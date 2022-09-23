package repositories;

import entities.Client;

public interface IClient {
    
    public Client insert(Client client);
    public Client findByTel(String tel);
}
