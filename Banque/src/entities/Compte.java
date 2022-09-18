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

    
}
