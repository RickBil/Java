package Models;
public class Salarier extends Employe {
    // Attributs
    private double salaire;
    private double prime;
    private double retenu;
    //many to one avec Service
    private Service service;

    
    public Salarier() {
        type = "SALARIER";
    }

    public double getSalaire() {
        return salaire;
    }
    
    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
        service.addSalarier(this);
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
    
    public double getPrime() {
        return prime;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }
    
    public double getRetenu() {
        return retenu;
    }
    
    public void setRetenu(double retenu) {
        this.retenu = retenu;
    }
    @Override
    public double salaireNet() {
        // TODO Auto-generated method stub
        double sNet = salaire+retenu-prime;
        return sNet;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    
}
