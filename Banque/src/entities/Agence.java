package entities;

import java.util.ArrayList;
import java.util.List;

public class Agence {
    
    private static int nbre;
    private int id;
    private String num;
    private String address;
    private String tel;

    //OneToMany avec Compte
    private List<Compte> comptes=new ArrayList<>();

    // Constructeur par defaut
    public Agence() {
        nbre++;
        id=nbre;
        num="AG_"+nbre;
    }
    // Surchage 
    public Agence(String address, String tel) {
        this.address = address;
        this.tel = tel;
        nbre++;
        id=nbre;
        num="AG_"+nbre;
    } 

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNum() {
        return num;
    }
    public void setNum(String num) {
        this.num = num;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    @Override
    public String toString() {
        return "Agence [address=" + address + ", id=" + id + ", num=" + num + ", tel=" + tel + "]";
    }
    


    
}
