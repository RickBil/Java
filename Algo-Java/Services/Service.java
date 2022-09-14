package Services;

import java.util.ArrayList;

import Models.Employe;
import Models.Salarier;

public class Service implements IService{
    private ArrayList<Service> services=new ArrayList();
    private ArrayList<Salarier> salariers=new ArrayList();

        @Override
        public void ajouterE(Employe employe, Models.Service service) {
            // TODO Auto-generated method stub
            if(employe.getType()==type.SALARIER){
                ((Salarier)Employe)

            }
        }

        @Override
        public void creerE() {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void creerS(Models.Service service) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void listerEmployeDunService(Models.Service service) {
            // TODO Auto-generated method stub
            ArrayList<Salarier> salariers=service.getSalarier();
            for(Salarier salarier:salariers){
                System.out.println(salarier);
            }
        }

        @Override
        public void listerEmployeMoinsPayerParService() {
            // TODO Auto-generated method stub
            for(Models.Service service:tabService ){
                System.out.println(service.moinsPayer());
            }
            return null;
        }
        
    }
