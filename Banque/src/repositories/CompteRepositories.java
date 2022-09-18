package repositories;


import java.util.ArrayList;
import java.util.List;

import entities.Compte;

public class CompteRepositories {
    
    private List<Compte> comptes=new ArrayList<>();

    public Compte insert(Compte compte){
        comptes.add(compte);
        return compte;
    }


}
