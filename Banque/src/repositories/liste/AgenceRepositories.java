package repositories.liste;

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
        agences.add(new Agence("Grand Dakar","33 021 23 12"));
        agences.add(new Agence("Fann","33 024 29 02"));
        agences.add(new Agence("HLM1","33 891 15 33"));
        agences.add(new Agence("Point E","33 289 40 09"));
    }
    public List<Agence> findAll() {
        return agences;
    }
    public Agence insert(Agence agence){
        agences.add(agence);
        return agence;
    }
    public Agence findByNum(String num){
        return agences
        .stream()
        .filter(x ->x.getNum().compareTo(num)==0)
        .findFirst()
        .orElse(null);

    }


}
