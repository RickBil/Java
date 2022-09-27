package entities;

abstract public class Compte {

    private static int nbre;
    protected int id;
    protected String num;
    protected double solde;
    protected TypeCpt TypeCpt;

    //ManyToOne avec Client
    protected Client client;
    
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    //ManyToOne avec Agence
    protected Agence agence;
    
    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    public Carte carte;

    public Compte(int id, String num, double solde) {
        this.id = id;
        this.num = num;
        this.solde = solde;
    }

    public Carte getCarte() {
        return carte;
    }

    public void setCarte(Carte carte) {
        this.carte = carte;
    }

    
    public Compte(double solde) {
        nbre++;
        id=nbre;
        num="CPT_"+nbre;
        this.solde = solde;
    }

    public Compte() {
        nbre++;
        id=nbre;
        num="CPT_"+nbre;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNum() {
        return num;
    }
    public void setNum(String num) {
        this.num = num;
    }
    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }
    public TypeCpt getTypeCpt() {
        return TypeCpt;
    }
    public void setTypeCpt(TypeCpt typeCpt) {
        TypeCpt = typeCpt;
    }

    @Override
    public String toString() {
        return " [id=" + id + ", num=" + num + ", solde=" + solde;
    }

    
}
