package models;

public class Compte implements Iaffiche  {
    protected int numero;//0
    protected double solde;//0
    private static int nombre;//0
    protected String type;

    public String getType() {
        return this.type;
    }

    //Navigabilite => 
    
      //ManyToOne avec Client
    protected Client client;

    //Constructeur par defaut =>  qui n'a pas d'arguments
    public Compte(){
        nombre++;
        numero=nombre;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }

    //Methodes metier
    public void depot(double montant){
        solde=solde+montant;
    }

    public void retrait(double montant){
        if(montant<solde){
            solde=solde-montant;
        }else{
            System.out.println("Votre solde est insufisant "+solde);
        }
    }

    public void virement(double montant,Compte cptVir){
        if(montant<solde){
            this.retrait(montant);
            cptVir.depot(montant);
        }else{
            System.out.println("Votre solde est insufisant "+solde);
        }
    }

    public String  consultation(){
        return "Numero :"+numero+" Solde :"+solde;
    }
    public void affiche(){
        System.out.println("Numero :"+numero+" Solde :"+solde);
    }

}
