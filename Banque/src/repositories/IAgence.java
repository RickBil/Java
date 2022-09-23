package repositories;

import java.util.List;

import entities.Agence;

public interface IAgence {

    public List<Agence> findAll();

    public Agence insert(Agence agence);

    public Agence findByNum(String num);
}
