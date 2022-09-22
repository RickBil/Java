package entities;

import java.time.LocalDateTime;

public class Transaction {
    int id;
    double montant;
    LocalDateTime date;
    String type;

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getMontant() {
        return montant;
    }
    public void setMontant(double montant) {
        this.montant = montant;
    }
    public LocalDateTime getDate() {
        return date;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

}
