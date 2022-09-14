public class Compte {

    // Attributs
    protected double solde;
    private int num;
    // Attributs Navigationnel
    //many ton one avec Client
    public Compte() {
        int c = 0;
        num = c++;
    } 
    
    private Client client;
    public Compte(Client client) {
        this.client = client;
    }
    // Methodes
    public double getSolde() {
        return solde;
    }
    public double getNum() {
        return num;
    }
    public void setSolde(double solde){
        this.solde = solde;
    }
    public void setNum(int num){
        this.num = num;
    }
    public void retrait(double montant){
        if (montant < solde){
            solde = solde - montant;
        }else{
            System.out.println("Votre solde est insuffisant pour effectuer cette operation !");
        }
        return solde;
    }
    public void depot( double montant){
        return solde = (solde + montant);
    }
    public double virement( Compte cpt ,double montant ){
        this.retrait(montant);
        cpt.depot(montant);
        return solde;
    }
    public double consultation(){
        return solde;
    }



}
