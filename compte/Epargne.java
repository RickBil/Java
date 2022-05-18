public class Epargne extends Compte{
    // Attributs
    final double TAUX = 0.18;

    // Methodes
    public double retrait(double montant){
        if (montant < solde){
            solde = solde - montant;
        } return solde;
    }
    public double depot( double montant){
        return solde = (solde + montant);
    }
}
