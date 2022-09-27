package repositories.bd;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import core.Mysqldb;
import entities.Client;
import entities.Role;
import repositories.IClient;

public class ClientRepositories extends Mysqldb implements IClient {

    private final String SQL_INSERT="INSERT INTO `user` ( `login`, `password`, `role`, `nom`, `prenom`, `tel`) VALUES ( ?, ?, ?, ?, ?, ?)";
    private final String SQL_FIND_BY_TEL="SELECT * FROM `user` WHERE `tel` LIKE ?";
    private final String SQL_FIND_BY_ID="SELECT * FROM `user` WHERE `id` LIKE ?";
    @Override
    public Client insert(Client client) {
        this.ouvrirConnexionBD();
        try{
            ps = conn.prepareStatement(SQL_INSERT,PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1,client.getLogin());
            ps.setString(2,client.getPassword());
            ps.setString(3,client.getRole().name());
            ps.setString(4,client.getNom());
            ps.setString(5,client.getPrenom());
            ps.setString(6, client.getTel());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                client.setId(rs.getInt(1));
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        this.fermerConnexionBD();
        return client;
    }

    @Override
    public Client findByTel(String tel) {
        Client client=null;
        this.ouvrirConnexionBD();
        try{
            ps=conn.prepareStatement(SQL_FIND_BY_TEL);
            ps.setString(1,tel);
            ResultSet rs=ps.executeQuery();
            if (rs.next()){
                client=new Client(rs.getInt("id"), 
                                rs.getString("login"), 
                                rs.getString("password"),   
                                rs.getString("nom"), 
                                rs.getString("prenom"), 
                                rs.getString("role").compareTo("ROLE_CLIENT")==0? Role.Client:Role.Gestionnaire, 
                                rs.getString("tel"));
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        this.fermerConnexionBD();
        return client;
    }
    @Override
    public Client findById(int id) {
        Client client=null;
        this.ouvrirConnexionBD();
        try{
            ps=conn.prepareStatement(SQL_FIND_BY_ID);
            ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();
            if (rs.next()){
                client=new Client(rs.getInt("id"), 
                                rs.getString("login"), 
                                rs.getString("password"),   
                                rs.getString("nom"), 
                                rs.getString("prenom"), 
                                rs.getString("role").compareTo("ROLE_CLIENT")==0? Role.Client:Role.Gestionnaire, 
                                rs.getString("tel"));
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        this.fermerConnexionBD();
        return client;
    }
    
}
