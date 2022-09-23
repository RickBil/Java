package views;

import java.util.Scanner;

import entities.Agence;
import services.IBanqueService;

public class VAgence {
    
    public static void menu(IBanqueService banqueService){
        Scanner clavier = new Scanner(System.in);
        int choix;

        do{
            System.out.println("1: Lister");
            System.out.println("2: Ajouter");
            System.out.println("3: Rechercher");
            System.out.println("4: Quitter");
            System.out.println( "Faites votre choix !");

            choix=clavier.nextInt();
            clavier.nextLine();

            switch(choix){
                case 1:
                    banqueService.listerAgence().forEach(System.out::println);
                        break;
                case 2:
                        
                        System.out.println(" Saisir le tél : ");
                        String tel=clavier.nextLine();
                        System.out.println(" Saisir l'address : ");
                        String address=clavier.nextLine();
                        Agence agence =new Agence(address,tel);
                        banqueService.ajouterAgence(agence);
                        break;
                case 3:
                    System.out.println(" Saisir le numero de l'agence : ");
                    String num=clavier.nextLine();
                    Agence ag=banqueService.rechercheByNumAgence(num);
                        if (ag!= null){
                            System.out.println(ag);
                        }else{
                            System.out.println("Le numero saisi est incorrecte !");
                        }
                        break;
                    } 
                System.out.println(" AU REVOIR !!! ");
                } while(choix!=4);
            
            
            }  
}
