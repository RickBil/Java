import java.util.Scanner;

public class Main {

    public static void main(String []args){
        Scanner clavier=new Scanner(System.in);
        Client c1=new Client();
        
        System.out.println(" Entrer votre nom : ");
        String nom=clavier.nextLine();
        System.out.println(" Entrer votre prenom : ");
        String prenom=clavier.nextLine();
        int num = 0;
        System.out.println("Quel type de Compte souhaitez vous créer ? 1:Courant 2:Epargne ");
        int nu=clavier.nextInt();
        switch(nu){
            case 1:
                Compte x1=new Compte();
                x1.setNum(num++);
                break;
            case 2:
                Epargne e1=new Epargne();
                break;
            default:
                System.out.println("La valeur saisie est incorrecte !");
        }
        c1.setNom(nom);
        c1.setPrenom(prenom);
        c1.setNum(num++);


        System.out.println("Nom : "+nom);
        System.out.println("Prenom : "+prenom);
        System.out.println("Num : "+num);

    }
}
