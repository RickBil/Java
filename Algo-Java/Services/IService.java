package Services;

import Models.Employe;

public interface IService {

    public void creerS(Models.Service service);
    public void creerE();
    public void ajouterE(Employe employe,Models.Service service);
    public void listerEmployeDunService(Models.Service service);
    public void listerEmployeMoinsPayerParService();
}
