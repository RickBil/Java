package entities;

public class Cheque extends Compte{

    private double frais;
    

    public Cheque(double solde, double frais) {
        super(solde);
        this.frais = frais;
        TypeCpt=entities.TypeCpt.Cheque;
    }

    public Cheque() {
        super();
        TypeCpt=entities.TypeCpt.Cheque;
    }

    public double getFrais() {
        return frais;
    }

    public void setFrais(double frais) {
        this.frais = frais;
    }
    
}
