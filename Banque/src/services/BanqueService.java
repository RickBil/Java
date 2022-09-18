package services;

import java.util.List;

import entities.Agence;
import repositories.AgenceRepositories;


public class BanqueService {

    AgenceRepositories agenceRepositories= new AgenceRepositories();
    public List<Agence> listerAgence(){
        return agenceRepositories.findAll();
    }
    public Agence ajouterAgence(Agence agence){
        return agenceRepositories.insert(agence); 
    }
    public Agence rechercheByNumAgence(String num){
        return agenceRepositories.findByNum(num); 
    }

    

}
