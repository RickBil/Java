package models;

public class Client  {
    private int numero;
    private String nom;
    private String prenom;
    private static int nombre;
    public Client() {
        nombre++;
        numero=nombre;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void affiche(){
        System.out.println("Nom :"+nom+" Prenom :"+prenom+" Numero :"+numero);
    }
}
