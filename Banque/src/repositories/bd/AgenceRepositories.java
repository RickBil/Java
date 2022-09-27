package repositories.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//import com.mysql.cj.jdbc.MysqlDataSource;

import entities.Agence;
import repositories.IAgence;

public class AgenceRepositories implements IAgence {

    @Override
    public List<Agence> findAll() {
        List<Agence> agences = new ArrayList<>();
        // Charger la connexion
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Chargement reussit");
            // Ouvrir la connexion
            Connection conn= DriverManager.getConnection(
                    "jdbc:mysql://localhost:8889/java_banque", "root", "root");
                System.out.println(" Connecté !!!");
                Statement stm=conn.createStatement(); 
                  ResultSet rs=  stm.executeQuery( "select * from agence");
                    while (rs.next()){
                        //colonne 1(int) => rs.getInt(1) ou rs.getInt("id") 
                        //colonne 2(Varchar) => rs.getString(2) ou rs.getString("adress") 
                        Agence agence = new Agence( rs.getInt("id"), 
                                                    rs.getString("adress"), 
                                                    rs.getString("num"), 
                                                    rs.getString("tel"));
                        agences.add(agence);
                    }
            conn.close();
            }catch (SQLException e){
                e.printStackTrace();
            }catch (ClassNotFoundException e) {
            // TODO Auto-generated method stub
                e.printStackTrace();
        }   return agences;
    }

    @Override
    public Agence insert(Agence agence) {
        String sql="INSERT INTO `agence` (`adress`, `num`, `tel`) VALUES ('?', '?', '?')";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Chargement reussit");
            // Ouvrir la connexion
            Connection conn= DriverManager.getConnection(
                    "jdbc:mysql://localhost:8889/java_banque",
                    "root", "root");
                System.out.println(" Connecté !!!");
            // Execution de la requete
            PreparedStatement pstm= conn.prepareStatement(sql);
            // Remplacement des parametres par leurs valeurs 
            pstm.setString(1, agence.getAddress());
            pstm.setString(2, agence.getNum());
            pstm.setString(3, agence.getTel());
            // Recuperation des resultats 
            int nmbreLine=pstm.executeUpdate();
            // Fermeture de la connexion
            conn.close();
            }catch (SQLException e){
                e.printStackTrace();
            }catch (ClassNotFoundException e) {
            // TODO Auto-generated method stub
                e.printStackTrace();
        }
        return agence;
    }

    @Override
    public Agence findByNum(String num) {
        Agence agence=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Chargement reussit");
            // Ouvrir la connexion
            Connection conn= DriverManager.getConnection(
                    "jdbc:mysql://localhost:8889/java_banque",
                    "root", "root");
                System.out.println(" Connecté !!!");
            Statement stm=conn.createStatement(); 
            ResultSet rs=  stm.executeQuery( "select * from agence where numero='"+num+"'");
                    if (rs.next()){
                        agence = new Agence( rs.getInt("id"), 
                        rs.getString("adress"), 
                        rs.getString("num"), 
                        rs.getString("tel"));
                    }
            conn.close();
            }catch (SQLException e){
                e.printStackTrace();
            }catch (ClassNotFoundException e) {
            // TODO Auto-generated method stub
                e.printStackTrace();
        }
        return agence;
    }
    
}
