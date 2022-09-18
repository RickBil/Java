package entities;

public class User {
    
    private static int nbre;
    protected int id;
    protected String login;
    protected String password;
    protected String NomComplet;
    protected Role role;


    public User(String login, String password, String nomComplet) {
        this.login = login;
        this.password = password;
        NomComplet = nomComplet;
        role=Role.Gestionnaire;
    }


    public User() {
        nbre++;
        id=nbre;
        role=Role.Gestionnaire;
    }
    

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getNomComplet() {
        return NomComplet;
    }
    public void setNomComplet(String nomComplet) {
        NomComplet = nomComplet;
    }
    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }
    

    
}
