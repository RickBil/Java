import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner clavier=new Scanner(System.in);
        Cercle c1=new Cercle();

        System.out.println(" Saisir le rayon : ");
        double rayon=clavier.nextDouble();

        c1.setRayon(rayon);
        double diametre=c1.diametre();
        double perimetre=c1.perimetre();
        double surface=c1.surface();

        System.out.println(" Le diametre est : "+diametre);
        System.out.println(" Le perimetre est : "+perimetre);
        System.out.println(" Le surface est : "+surface);

    }
}