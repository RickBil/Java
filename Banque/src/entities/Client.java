package entities;

public class Client extends User {

    private String tel;

    //OneToMany avec Client

    public Client(String login, String password, String nomComplet, String tel) {
        super(login, password, nomComplet);
        this.tel = tel;
        role=Role.Client;
    }
    public Client(String tel) {
        super();
        role=Role.Client;
    }

    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }


}
