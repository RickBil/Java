package views;

import java.util.Scanner;

import services.BanqueService;

public class VAgence {
    
    public static void menu(){
        Scanner clavier = new Scanner(System.in);
        BanqueService banqueService =new BanqueService();
        int choix;

        do{
            System.out.println("1: Lister");
            System.out.println("2: Ajouter");
            System.out.println("3: Rechercher");
            System.out.println("4: Quitter");
            System.out.println( "Faites votre choix !");

            choix=clavier.nextInt();

            switch(choix){
                case 1:
                banqueService.listerAgence().forEach(System.out::println);
                    break;
            } 

        } while(choix!=4);
    }
}
