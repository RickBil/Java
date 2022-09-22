package repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Compte;

public class CompteRepositories {
    
    private List<Compte> comptes=new ArrayList<>();

    public Compte insert(Compte compte){
        comptes.add(compte);
        return compte;
    }
    public List<Compte> findAll(){
        return comptes;
    }
    public List<Compte> findByClient(String tel){
        return comptes
        .stream()
        .filter(cpt ->cpt.getClient().getTel().compareTo(tel)==0)
        .collect(Collectors.toList());
    }
    public Compte findByNum(String num){
        return comptes.stream()
        .filter(c ->c.getNum().compareTo(num)==0)
        .findFirst()
        .orElse(null);
    }
}
