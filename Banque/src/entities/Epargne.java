package entities;

public class Epargne extends Compte{

    private double taux;

    public Epargne(double solde, double taux) {
        super(solde);
        this.taux = taux;
        TypeCpt=entities.TypeCpt.Epargne;
    }
    
    public Epargne() {
        super();
        TypeCpt=entities.TypeCpt.Epargne;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }
}
