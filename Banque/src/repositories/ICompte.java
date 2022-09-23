package repositories;

import java.util.List;

import entities.Compte;

public interface ICompte {
    
    public Compte insert(Compte compte);
    public List<Compte> findAll();
    public List<Compte> findByClient(String tel);
    public Compte findByNum(String num);
}
