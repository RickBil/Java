package models;

public class Epargne extends Compte {
    public static final double  TAUX=1.18;

    public Epargne(){
        super();//Constructeur de Compte
        type="Epargne";
    }

    @Override //Reecrite ou Redefinie
    public void depot(double montant) {
        solde+=montant*TAUX;
    }

    @Override
    public void retrait(double montant) {
        System.out.println("Ce Compte est bloque  ");
    }

    @Override
    public void virement(double montant, Compte cptVir) {
        System.out.println("Ce Compte est bloque  ");
    }
    
}

//Epargne ep=new Epargne()  =>  new Compte()
