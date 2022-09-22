package repositories.liste;

import java.util.ArrayList;
import java.util.List;

import entities.Client;

public class ClientRepositories {
    
    private List<Client> clients=new ArrayList<>();

    public Client insert(Client client){
        clients.add(client);
        return client;
    }
    public Client findByTel(String tel){
        return clients
        .stream()
        .filter(x ->x.getTel().compareTo(tel)==0)
        .findFirst()
        .orElse(null);
    }
}
