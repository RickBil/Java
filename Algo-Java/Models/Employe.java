package Models;
    public abstract class Employe {
        // Attributs
        protected int id;
        protected String nom;
        protected String prenom;
        private static int nombre;
        protected String type;

        // Constructeur
        public Employe(){
            nombre++;
            id=nombre;
        }
        // Methodes
        public String getNom() {
            return nom;
        }
        public static int getNombre() {
            return nombre;
        }
        public static void setNombre(int nombre) {
            Employe.nombre = nombre;
        }
        public void setNom(String nom) {
            this.nom = nom;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getPrenom() {
            return prenom;
        }
        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        public abstract double salaireNet();
        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return " ID : "+id+" Nom : "+nom+" Prenom : "+ prenom+" ";
        }
        public String getType() {
            return type;
        }
        public void setType(String type) {
            this.type = type;
        }
        
        

}
