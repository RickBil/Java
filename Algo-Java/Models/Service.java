package Models;

import java.util.ArrayList;

public class Service {
    // Attributs
    private String libelle;
    private String adresse;
    private int id;
    private ArrayList<Salarier> salariers=new ArrayList<>();
    // Methodes
    public String getLibelle() {
        return libelle;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public ArrayList<Salarier> getSalarier() {
        return salariers;
    }
    public void setSalarier(ArrayList<Salarier> salarier) {
        this.salariers = salarier;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public void addSalarier(Salarier salarier){
        salariers.add(salarier);
        //salarier.setService(this);
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return ((Service)obj).getId()==this.id;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Service [Adresse =" + adresse+" Libelle ="+ libelle+" ]";
    }
    public void moinsPayer(){
        
    }
    public ArrayList<Salarier> getSalariers() {
        return salariers;
    }
    
    
}
