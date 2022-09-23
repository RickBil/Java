package repositories;

import java.util.List;

import entities.Carte;

public interface ICarte {
    
    public List<Carte> findAll();
    public Carte findByNum(String num);
}
