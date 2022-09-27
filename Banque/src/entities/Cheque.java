package entities;

public class Cheque extends Compte{

    private double frais;
    

    public Cheque(int id, String num, double solde, double frais) {
        super(id, num, solde);
        this.frais = frais;
    }

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

    @Override
    public String toString() {
        
        return "Cheque : "+ super.toString()+ "frais=" + frais + "]";
    }
    
}
