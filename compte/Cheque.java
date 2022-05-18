public class Cheque extends Compte{
    // Attributs
    private double frais;

    // Methodes
    public double depot( double montant){
        return solde = (solde + montant);
    }

    public double getFrais() {
        return frais;
    }

    public void setFrais(double frais) {
        this.frais = frais;
    }

}
