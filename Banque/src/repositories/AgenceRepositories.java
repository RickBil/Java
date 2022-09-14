package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.Agence;
public class AgenceRepositories {
    //BD
    List<Agence> agences =new ArrayList<>();

    public AgenceRepositories() {
        init_listAgence();
    }

    public void init_listAgence(){
        // Agence agence=new Agence("Point E","78 287 09 91");
        // agences.add(agence);
        // Agence agence1=new Agence("Point E","78 287 09 91");
        // agences.add(agence1);
        // Agence agence2=new Agence("Point E","78 287 09 91");
        // agences.add(agence2);
        agences.add(new Agence("Grand Dakar","33 021 23 12"));
        agences.add(new Agence("Fann","33 024 29 02"));
        agences.add(new Agence("HLM1","33 891 15 33"));
    }
    public List<Agence> findAll() {
        return agences;
    }
}
