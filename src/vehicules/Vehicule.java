package vehicules;

public class Vehicule {
    public String immat;
    public String marque;
    public String modele;
    public int kilometrage;
    public double tarif;
    public boolean disponible;

    public Vehicule() {
        this.immat = "N/A";
        this.marque = "N/A";
        this.modele = "N/A";
        this.kilometrage = 0;
        this.tarif = (double)0.0F;
        this.disponible = true;
    }

    public Vehicule(String immat, String marque, String modele, double tarif) {
        this.immat = immat;
        this.marque = marque;
        this.modele = modele;
        this.tarif = tarif;
        this.kilometrage = 0;
        this.disponible = true;
    }

    public Vehicule(Vehicule v) {
        this.immat = v.immat;
        this.marque = v.marque;
        this.modele = v.modele;
        this.tarif = v.tarif;
        this.kilometrage = v.kilometrage;
        this.disponible = v.disponible;
    }

    public void rouler(int km) {
        this.kilometrage += km;
    }

    public void afficherInfos() {
        System.out.println("Immatriculation : " + this.immat);
        System.out.println("Marque : " + this.marque);
        System.out.println("Modèle : " + this.modele);
        System.out.println("Tarif Journalier : " + this.tarif);
        System.out.println("Kilométrage : " + this.kilometrage);
        System.out.println("Disponible : " + this.disponible);
    }
}