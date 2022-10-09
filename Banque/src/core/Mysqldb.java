package core;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Mysqldb implements IDatabase {
    protected Connection conn;
    protected PreparedStatement ps;

    @Override
    public void ouvrirConnexionBD() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                conn= DriverManager.getConnection("jdbc:mysql://localhost:8889/banque_java","root", "root");
            }catch (SQLException e){
                e.printStackTrace();
            }
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    @Override
    public void fermerConnexionBD() {
        if(conn != null) {
            try {
                conn.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

}