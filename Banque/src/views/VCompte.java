package views;

import java.util.Scanner;

import entities.Agence;
import entities.Carte;
import entities.Cheque;
import entities.Client;
import entities.Compte;
import entities.Epargne;
import services.IBanqueService;

public class VCompte {
    
    public static void menu(IBanqueService banqueService){
        int choix;
        String tel;
        Client client=null;
        Compte compte=null;
        Scanner clavier = new Scanner(System.in);

        do{
            System.out.println("1: Lister ");
            System.out.println("2: Ajouter ");
            System.out.println("3: Lister les comptes d'un client ");
            System.out.println("4: Affecter une carte ");
            System.out.println("5: Quiter ");
            System.out.println( "Faites votre choix !");

            choix=clavier.nextInt();
            clavier.nextLine();

            switch(choix){
            case 1:
                banqueService.listerComptes().forEach(System.out::println);
                break;
            case 2:
                System.out.println("Infos du compte !!! ");
                System.out.println(" Entrer le numero de téléphone");
                tel=clavier.nextLine();
                client = banqueService.rechercheClientByTel(tel);
                if(client==null){
                    System.out.println(" Saisir le Nom :");
                    String nom=clavier.nextLine();
                    System.out.println(" Saisir le Prenom :");
                    String prenom=clavier.nextLine();
                    client = new Client(nom,prenom,tel);
                    banqueService.creerClient(client);
                }
                System.out.println(" Infos du compte !!!");
                System.out.println(" Saisir le Solde :");
                double solde=clavier.nextDouble();
                int type;
                do{
                    System.out.println("1: Epargne :");
                    System.out.println("2: Cheque :");
                    System.out.println(" Choisir le type de compte !");
                    type=clavier.nextInt();
                    
                }while(type !=1 && type !=2);
                
                if(type == 1){
                    System.out.println(" Saisir le Taux :");
                    double taux=clavier.nextDouble();
                    compte = new Epargne(solde, taux);
                }else{
                    System.out.println(" Saisir le Frais :");
                    double frais=clavier.nextDouble();
                    compte = new Cheque(solde, frais);
                }
                Agence agence=null ;
                clavier.nextLine();
                do{
                    System.out.println("Infos agence !!! ");
                    banqueService.listerAgence().forEach(System.out::println);
                    System.out.println(" Entrer le numero de L'agence");
                    String num=clavier.nextLine();
                    agence = banqueService.rechercheByNumAgence(num);
                }while(agence==null);
                compte.setClient(client);
                compte.setAgence(agence);
                banqueService.creerCompte(compte);
                    break;
            case 3:
                System.out.println(" Saisir le tel :");
                tel=clavier.nextLine();
                client=banqueService.rechercheClientByTel(tel);
                if(client!=null){
                    client.getComptes().forEach(System.out::println);
                }
                        break;
            case 4:
                System.out.println(" Entrer le numero du compte");
                String num=clavier.nextLine();
                compte= banqueService.rechercheCompte(num);
                if(compte!=null){
                    System.out.println(" Choisir une carte ");
                    banqueService.listerCarte().forEach(System.out::println);
                    num=clavier.nextLine();
                    Carte carte = banqueService.rechercheCarte(num);
                    if(carte!=null){
                        compte.setCarte(carte);
                    }
                }
                        break;
                    } 
                System.out.println(" AU REVOIR !!! ");
                } while(choix!=5);
            
            }
}
