package repositories.liste;

import java.util.ArrayList;
import java.util.List;

import entities.Client;
import repositories.IClient;

public class ClientRepositories implements IClient{
    
    private List<Client> clients=new ArrayList<>();
    @Override
    public Client insert(Client client){
        clients.add(client);
        return client;
    }
    @Override
    public Client findByTel(String tel){
        return clients
        .stream()
        .filter(x ->x.getTel().compareTo(tel)==0)
        .findFirst()
        .orElse(null);
    }
    @Override
    public Client findById(int id) {
        // TODO Auto-generated method stub
        return null;
    }
}
