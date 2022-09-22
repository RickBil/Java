package services;

import java.util.List;

import entities.Agence;
import entities.Carte;
import entities.Client;
import entities.Compte;
import repositories.liste.CompteRepositories;
import repositories.liste.AgenceRepositories;
import repositories.liste.CarteRepositories;
import repositories.liste.ClientRepositories;


public class BanqueService {
    // Objects
    AgenceRepositories agenceRepositories;
    repositories.CompteRepositories compteRepositories ;
    ClientRepositories clientRepositories ;
    CarteRepositories carteRepositories ;


    public BanqueService(AgenceRepositories agenceRepositories, repositories.CompteRepositories compteRepositories2,
            ClientRepositories clientRepositories, CarteRepositories carteRepositories ) {
        this.agenceRepositories = agenceRepositories;
        this.compteRepositories = compteRepositories2;
        this.clientRepositories = clientRepositories;
        this.carteRepositories = carteRepositories;
    }
    // UseCases : Agence
    public List<Agence> listerAgence(){
        return agenceRepositories.findAll();
    }
    public Agence ajouterAgence(Agence agence){
        return agenceRepositories.insert(agence); 
    }
    public Agence rechercheByNumAgence(String num){
        return agenceRepositories.findByNum(num); 
    }
    // UseCases : Compte
    public Compte creerCompte(Compte compte){
        return compteRepositories.insert(compte);
    }
    public List<Compte> listerComptesClient(String tel){
        return compteRepositories.findByClient(tel);
    }
    public List<Compte> listerComptes(){
        return compteRepositories.findAll();
    }
    public Compte rechercheCompte(String num){
        return compteRepositories.findByNum(num);
    }
    // UseCases : Client
    public Client creerClient( Client client){
        return clientRepositories.insert(client);
    }
    public Client rechercheClientByTel(String tel){
        return clientRepositories.findByTel(tel); 
    }
    // UseCases : Carte
    public Carte rechercheCarte(String num){
        return carteRepositories.findByNum(num);
    }
    public List<Carte> listerCarte(){
        return carteRepositories.findAll();
    }
}
