package repositories.liste;

import java.util.ArrayList;
import java.util.List;

import entities.Carte;
import repositories.ICarte;

public class CarteRepositories implements ICarte {
    
    List<Carte> cartes = new ArrayList();

    public void CarteRepositories() {
        cartes.add(new Carte());
        cartes.add(new Carte());
        cartes.add(new Carte());
        cartes.add(new Carte());
        cartes.add(new Carte());
    }
    @Override
    public List<Carte> findAll(){
        return cartes.stream()
        .filter(c ->c.getCompte()==null)
        .toList();
    }
    @Override
    public Carte findByNum(String num){
        return cartes.stream()
        .filter(c ->c.getNum().compareTo(num)==0)
        .findFirst()
        .orElse(null);
    }
    
    

}
