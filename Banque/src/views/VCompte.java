package views;

import java.util.Scanner;

import entities.Cheque;
import entities.Client;
import entities.Compte;
import entities.Epargne;
import services.BanqueService;

public class VCompte {
    
    public static void menu(BanqueService banqueService){
        Scanner clavier = new Scanner(System.in);
        int choix;

        do{
            System.out.println("1: Creer un Compte ");
            System.out.println("2: Lister les Comptes d'un Clients ");
            System.out.println("3: Rechercher");
            System.out.println("4: Quitter");
            System.out.println( "Faites votre choix !");

            choix=clavier.nextInt();
            clavier.nextLine();

            switch(choix){
            case 1:
                System.out.println(" Saisir le tel :");
                String tel=clavier.nextLine();
                Client client = banqueService.rechercheClientByTel(tel);
                if(client==null){
                    System.out.println(" Saisir le Nom et Prenom :");
                    String nomComplet=clavier.nextLine();
                    client = new Client(nomComplet, tel);
                    banqueService.creerClient(client);
                }
                System.out.println(" Saisir le Solde :");
                double solde=clavier.nextDouble();
                int type;
                do{
                    System.out.println("1: Epargne :");
                    System.out.println("2: Cheque :");
                    System.out.println(" Choisir le type de compte !");
                    type=clavier.nextInt();
                    
                }while(type !=1 && type !=2);
                Compte cpt;
                if(type == 1){
                    System.out.println(" Saisir le Taux :");
                    double taux=clavier.nextDouble();
                    cpt = new Epargne(solde, taux);
                }else{
                    System.out.println(" Saisir le Frais :");
                    double frais=clavier.nextDouble();
                    cpt = new Cheque(solde, frais);
                }
                cpt.setClient(client);
                banqueService.creerCompte(cpt);
                        break;
            case 2:
                System.out.println(" Saisir le tel :");
                tel=clavier.nextLine();
                banqueService.listerComptesClient(tel).forEach(cp->{
                    System.out.println(cp);
                });
                        break;
            case 3:
                    
                        break;
                    } 
                System.out.println(" AU REVOIR !!! ");
                } while(choix!=4);
            
            
            }
}
