import java.util.Scanner;

public class Main {
    
    public static void main(String [] args){
        Scanner clavier=new Scanner(System.in);
        Rectangle r1=new Rectangle();

        System.out.println(" Saisir la longueur : ");
        double longueur=clavier.nextDouble();
        
        System.out.println(" Saisir la largeur");
        double largeur=clavier.nextDouble();

        r1.setLongueur(longueur);
        r1.setLargeur(largeur);
        double perimetre=r1.perimetre();
        double demiPerimetre=r1.demiPerimetre();
        double surface=r1.surface();

        System.out.println("Le perimetre est :"+perimetre);
        System.out.println("Le demiPerimetre est :"+demiPerimetre);
        System.out.println("La surface est :"+surface);
        
    }
}
