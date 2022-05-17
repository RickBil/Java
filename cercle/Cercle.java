public class Cercle {
    // Attributs
    private double rayon;
    public  static  final  double PI =  3.14;

    public double getRayon() {
        return rayon;
    }
    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
    public double perimetre() {
        return (rayon*2)*PI;
    }
    public double surface() {
        return (rayon*rayon*PI);
    }
    public double diametre(){
        return (rayon*2);
    }
    }
