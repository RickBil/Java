package services;
import models.Client;
import models.Compte;

public class Service implements IService {
    private final int N = 20;
    private int indexCompte = 0;
    private int indexClient = 0;
    private Compte comptes [] = new Compte[N];
    private Client clients [] = new Client[N];
    @Override
    public void addClient(Client client) {
        // TODO
        if(indexClient<N){
            clients[indexClient]=client;
            indexClient++;
        }else{
            System.out.println("Le nombre de Client est atteint !");
        }
    }

    @Override
    public void showClient() {
        // TODO
        for(Client client : clients){
            if(client != null){
                client.affiche();
            }
        }
    }

    @Override
    public void addCompte(Compte compte, Client client) {
        // TODO
        if(indexCompte<comptes.length){
            compte.setClient(client);
            comptes[indexCompte]=compte;
            indexCompte++;
        }else{
            System.out.println("Le nombre de Client est atteint !");
        }
    }

    @Override
    public void showCompte() {
        // TODO
        for(Compte compte : comptes){
            if(compte != null){
                compte.affiche();
            }
        }
    }

    @Override
    public void showCompteType(String type) {
        // TODO
    }

    @Override
    public void showCompteClient(Client client) {
        // TODO
    }

    @Override
    public Compte findCompteByNum(int num) {
        // TODO
    }
}
