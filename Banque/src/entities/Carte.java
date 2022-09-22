package entities;

public class Carte {
    private int nbre;
    int id ;
    String num;
    String dateX;

    //OneToOne avec Cheque
    private Cheque Compte;

    public Cheque getCompte() {
        return Compte;
    }

    public void setCompte(Cheque compte) {
        Compte = compte;
    }

    public Carte() {
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
    public String getDateX() {
        return dateX;
    }
    public void setDateX(String dateX) {
        this.dateX = dateX;
    }
}
