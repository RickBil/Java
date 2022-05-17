public class Rectangle {
    // Attributs
    private double longueur;
    private double largeur;
    public double getLongueur() {
        return longueur;
    }
    public double getLargeur() {
        return largeur;
    }
    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }
    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }
    public double perimetre(){
        return (longueur+largeur)*2;
    }
    public double demiPerimetre(){
        return (longueur+largeur);
    }
    public double surface(){
        return (longueur*largeur);
    }
}
