package repositories.bd;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import core.Mysqldb;
import entities.Cheque;
import entities.Client;
import entities.Compte;
import entities.Epargne;
import entities.TypeCpt;
import repositories.IClient;
import repositories.ICompte;

public class CompteRepositories extends Mysqldb implements ICompte {
    private final String SQL_INSERT="INSERT INTO `compte` (`num`, `solde`, `type`, `taux`, `frais`, `client_id`, `agence_id`, ) VALUES (?,?,?,?,?,?,?)";
    private final String SQL_FIND_ALL="";
    private final String SQL_FIND_BY_CLIENT="";
    private final String SQL_FIND_BY_NUM="SELECT c.* FROM 'compte' c,user u WHERE c.client_id = u.id and u.tel like ?";
    
    IClient clientRepositories;
    public CompteRepositories(IClient clientRepositories) {
        this.clientRepositories = clientRepositories;
    }

    @Override
    public Compte insert(Compte compte) {
        this.ouvrirConnexionBD();
        try{
            ps = conn.prepareStatement(SQL_INSERT,PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1,compte.getNum());
            ps.setDouble(2,compte.getSolde());
            ps.setString(3,compte.getTypeCpt().name());
            if(compte.getTypeCpt()==TypeCpt.Cheque){
                ps.setNull(4,java.sql.Types.FLOAT);
                ps.setDouble(5,((Cheque)compte).getFrais());
            }else{
                ps.setDouble(4,((Epargne)compte).getTaux());
                ps.setNull(5,java.sql.Types.FLOAT);
            }
            ps.setInt(6,compte.getClient().getId());
            ps.setInt(7,compte.getAgence().getId());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                compte.setId(rs.getInt(1));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        this.fermerConnexionBD();
        return compte;
    }

    @Override
    public List<Compte> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Compte> findByClient(String tel) {
        List<Compte> comptes = new ArrayList<>();
        this.ouvrirConnexionBD();
        try{
            ps = conn.prepareStatement(SQL_FIND_BY_CLIENT);
            ps.setString(1,tel);
            ResultSet rs=ps.executeQuery();
            Compte compte;
            Client client=null;
            while(rs.next()){
                if (rs.getString("type").compareTo("cheque")==0){
                    compte= new Cheque(rs.getInt("id"), 
                                                rs.getString("num"), 
                                                rs.getDouble("solde"), 
                                                rs.getDouble("frais"));
                }else{
                    compte= new Epargne(rs.getInt("id"), 
                                                rs.getString("num"), 
                                                rs.getDouble("solde"), 
                                                rs.getDouble("taux"));
                }
            if(client!=null){
                client=clientRepositories.findById(rs.getInt("client_id"));
            }
            compte.setClient(client);
            comptes.add(compte);
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        this.fermerConnexionBD();
        return comptes;
    }

    @Override
    public Compte findByNum(String num) {

        return null;
    }
    
}
