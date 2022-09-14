package Models;

    public  class Journalier extends Employe{
        // Attributs
        private double prixJ;
        private double prixH;
        private double taxe;
        final double INDICE = 0.95;

        public Journalier() {
        }

        // Methodes
        public double getPrixJ() {
            return prixJ;
        }
        
        public void setTaxe(double taxe) {
            this.taxe = taxe;
        }

        public double getPrixH() {
            return prixH;
        }
        public void setPrixH(double prixH) {
            this.prixH = prixH;
        }
        
        public void setPrixJ(double prixJ) {
            this.prixJ = prixJ;
        }
        @Override
        public double salaireNet(){
                double sBrut = (prixH*prixJ);
                taxe=sBrut*INDICE;
                double sNet = (prixH*prixJ)*taxe;
            return sNet;
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return super.toString();
        }
    }
