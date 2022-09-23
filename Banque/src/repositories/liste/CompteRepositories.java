package repositories.liste;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Compte;
import repositories.ICompte;

public class CompteRepositories implements ICompte {
    
    private List<Compte> comptes=new ArrayList<>();
    @Override
    public Compte insert(Compte compte){
        comptes.add(compte);
        return compte;
    }
    @Override
    public List<Compte> findAll(){
        return comptes;
    }
    @Override
    public List<Compte> findByClient(String tel){
        return comptes
        .stream()
        .filter(cpt ->cpt.getClient().getTel().compareTo(tel)==0)
        .collect(Collectors.toList());
    }
    @Override
    public Compte findByNum(String num){
        return comptes.stream()
        .filter(c ->c.getNum().compareTo(num)==0)
        .findFirst()
        .orElse(null);
    }
}
