import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        Client c1 = new Client();

        System.out.println(" Entrer votre nom : ");
        String nom = clavier.nextLine();
        System.out.println(" Entrer votre prenom : ");
        String prenom = clavier.nextLine();
        int num = 0;
        System.out.println("Quel type de Compte souhaitez vous créer ? " + "\n" + " 1:Courant " + "\n" + " 2:Epargne ");
        int nu = clavier.nextInt();
        switch (nu) {
            case 1:
                Compte x1 = new Compte();
                
                System.out.println("Quelle operation souhaitez vous effectuer ?");
                switch (nu) {
                    case 1:
                        int i = 0;
                        while (i == 0) {
                            System.out.println("1:Retrait" + "\n" + "2:Depot" + "\n" + "3:Virement" + "\n" + "4:Solde"
                                    + "\n" + "5:Quitter");
                            int x = clavier.nextInt();
                            switch (x) {
                                case 1:
                                    System.out.println(" Saisir le montant : ");
                                    double montant = clavier.nextDouble();
                                    double retrait = x1.retrait(montant);
                                    break;
                                case 2:
                                    System.out.println(" Saisir le montant : ");
                                    double montantD = clavier.nextDouble();
                                    double depot = x1.depot(montantD);
                                    break;
                                case 3:
                                    System.out.println(" Saisir le numero du Compte : ");
                                    double numV = clavier.nextDouble();
                                    System.out.println(" Saisir le montant : ");
                                    double montantV = clavier.nextDouble();
                                    System.out.println("Virement de " + montantV + " effectuer au Compte n° : " + numV);
                                    break;
                                case 4:
                                    double solde = x1.consultation();
                                    System.out.println(" Votre solde est de : " + solde + "XOF");
                                    break;
                                case 5:
                                    System.out.println(" Au revoir !");
                                    i++;
                                    break;
                            }
                        }
                }
                break;
            case 2:
                Epargne e1 = new Epargne();
                e1.setNum(num++);
                break;
            default:
                System.out.println("La valeur saisie est incorrecte !");
        }
        c1.setNom(nom);
        c1.setPrenom(prenom);
        c1.setNum(num++);

        System.out.println("Nom : " + nom);
        System.out.println("Prenom : " + prenom);
        System.out.println("Num : " + num);

    }
}
