package services;

import java.util.List;

import entities.Agence;
import entities.Carte;
import entities.Client;
import entities.Compte;

public interface IBanqueService {
    
    public List<Agence> listerAgence();
    public Agence ajouterAgence(Agence agence);
    public Agence rechercheByNumAgence(String num);

    public Compte creerCompte(Compte compte);
    public List<Compte> listerComptesClient(String tel);
    public List<Compte> listerComptes();
    public Compte rechercheCompte(String num);

    public Client creerClient( Client client);
    public Client rechercheClientByTel(String tel);

    public Carte rechercheCarte(String num);
    public List<Carte> listerCarte();
}
