package services;

import java.util.List;

import entities.Agence;
import entities.Client;
import entities.Compte;
import repositories.AgenceRepositories;
import repositories.ClientRepositories;
import repositories.CompteRepositories;


public class BanqueService {
    // Objects
    AgenceRepositories agenceRepositories;
    CompteRepositories compteRepositories ;
    ClientRepositories clientRepositories ;


    public BanqueService(AgenceRepositories agenceRepositories, CompteRepositories compteRepositories,
            ClientRepositories clientRepositories) {
        this.agenceRepositories = agenceRepositories;
        this.compteRepositories = compteRepositories;
        this.clientRepositories = clientRepositories;
    }
    // UseCases
    public List<Agence> listerAgence(){
        return agenceRepositories.findAll();
    }
    public Agence ajouterAgence(Agence agence){
        return agenceRepositories.insert(agence); 
    }
    public Agence rechercheByNumAgence(String num){
        return agenceRepositories.findByNum(num); 
    }
    
    public Compte creerCompte(Compte compte){
        return compteRepositories.insert(compte);
    }
    public Client creerClient( Client client){
        return clientRepositories.insert(client);
    }
    public Client rechercheClientByTel(String tel){
        return clientRepositories.findByTel(tel); 
    }
    public List<Compte> listerComptesClient(String tel){
        return compteRepositories.findByClient(tel);
    }

}
