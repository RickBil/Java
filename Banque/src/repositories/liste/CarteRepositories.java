package repositories.liste;

import java.util.ArrayList;
import java.util.List;

import entities.Carte;

public class CarteRepositories {
    
    List<Carte> cartes = new ArrayList();

    public CarteRepositories() {
        cartes.add(new Carte());
        cartes.add(new Carte());
        cartes.add(new Carte());
        cartes.add(new Carte());
        cartes.add(new Carte());
    }
    public List<Carte> findAll(){
        return cartes.stream()
        .filter(c ->c.getCompte()==null)
        .toList();
    }
    public Carte findByNum(String num){
        return cartes.stream()
        .filter(c ->c.getNum().compareTo(num)==0)
        .findFirst()
        .orElse(null);
    }

}
