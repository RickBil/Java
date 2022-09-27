package entities;

import java.util.ArrayList;
import java.util.List;

public class Client extends User {

    private String tel;

    //OneToMany avec Compte
    private List<Compte> comptes=new ArrayList<>();
    
    public Client(int id, String login, String password, String nom, String prenom, Role role, String tel) {
        super(id, login, password, nom, prenom, role);
        this.tel = tel;
    }

    public List<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }

    public Client(String login, String password, String nom, String prenom, String tel) {
        super(login, password, nom, prenom);
        this.tel = tel;
    }

    public Client(String nom, String prenom, String tel) {
        super(nom, prenom);
        this.tel = tel;
    }
    
    public Client(String tel) {
        super();
        role=Role.Client;
    }
    
    

    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }


}
