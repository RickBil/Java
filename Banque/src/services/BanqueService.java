package services;

import java.util.List;

import entities.Agence;
import entities.Carte;
import entities.Client;
import entities.Compte;
import repositories.IAgence;
import repositories.ICarte;
import repositories.IClient;
import repositories.ICompte;




public class BanqueService implements IBanqueService {
    // Objects
    IAgence agenceRepositories;
    ICompte compteRepositories ;
    IClient clientRepositories ;
    ICarte carteRepositories ;


    public BanqueService(IAgence agenceRepositories, ICompte compteRepositories, IClient clientRepositories,
            ICarte carteRepositories) {
        this.agenceRepositories = agenceRepositories;
        this.compteRepositories = compteRepositories;
        this.clientRepositories = clientRepositories;
        this.carteRepositories = carteRepositories;
    }
    // UseCases : Agence
    @Override
    public List<Agence> listerAgence(){
        return agenceRepositories.findAll();
    }
    @Override
    public Agence ajouterAgence(Agence agence){
        return agenceRepositories.insert(agence); 
    }
    @Override
    public Agence rechercheByNumAgence(String num){
        return agenceRepositories.findByNum(num); 
    }
    @Override
    // UseCases : Compte
    public Compte creerCompte(Compte compte){
        return compteRepositories.insert(compte);
    }
    @Override
    public List<Compte> listerComptesClient(String tel){
        return compteRepositories.findByClient(tel);
    }
    @Override
    public List<Compte> listerComptes(){
        return compteRepositories.findAll();
    }
    @Override
    public Compte rechercheCompte(String num){
        return compteRepositories.findByNum(num);
    }
    // UseCases : Client
    @Override
    public Client creerClient( Client client){
        return clientRepositories.insert(client);
    }
    @Override
    public Client rechercheClientByTel(String tel){
        return clientRepositories.findByTel(tel); 
    }
    // UseCases : Carte
    @Override
    public Carte rechercheCarte(String num){
        return carteRepositories.findByNum(num);
    }
    @Override
    public List<Carte> listerCarte(){
        return carteRepositories.findAll();
    }
}
