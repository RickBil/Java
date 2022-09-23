import java.util.Scanner;

import repositories.IAgence;
import repositories.ICarte;
import repositories.IClient;
import repositories.ICompte;
import repositories.bd.AgenceRepositories;
import repositories.liste.CarteRepositories;
import repositories.liste.ClientRepositories;
import repositories.liste.CompteRepositories;
import services.BanqueService;
import services.IBanqueService;
import views.VAgence;
import views.VCompte;

public class App {
    public static void main(String[] args) throws Exception {
        IAgence agenceRepositories = new AgenceRepositories();
        ICompte compteRepositories = new CompteRepositories();
        IClient clientRepositories = new ClientRepositories();
        ICarte carteRepositories = new CarteRepositories();
        IBanqueService banqueService =new BanqueService(agenceRepositories,compteRepositories,clientRepositories,carteRepositories);
        
        Scanner clavier = new Scanner(System.in);
        int choix;

        do{
            System.out.println("1: Agence Service");
            System.out.println("2: Compte Service");
            System.out.println("3: Quitter");
            System.out.println( "Faites votre choix !");

            choix=clavier.nextInt();
            clavier.nextLine();

            switch(choix){
                case 1:
                    VAgence.menu(banqueService);
                        break;
                case 2:
                    VCompte.menu(banqueService);
                        break;
            }
                System.out.println(" AU REVOIR !!! ");
            } while(choix!=3);
        
    }
}
