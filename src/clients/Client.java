package clients;

public class Client {

    private String nom;
    private String prenom;
    private String numeroPermis;
    private String telephone;
    private int anneeNaissance;
    private static int compteurClients;

    public String getNom() {return nom;}
    public String getPrenom() {return prenom;}
    public String getNumeroPermis() {return numeroPermis;}
    public String getTelephone() {return telephone;}
    public int getAnneeNaissance() {return anneeNaissance;}
    public static int getCompteurClients() {return compteurClients;}

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setAnneeNaissance(int anneeNaissance) {
        this.anneeNaissance = anneeNaissance;
    }

    public Client(){
        this.nom = "N/A";
        this.prenom = "N/A";
        this.telephone = "N/A";
        this.numeroPermis = "N/A";
        this.anneeNaissance = 2000;
        compteurClients ++;
    }

    public Client(String nom, String prenom, String numeroPermis, String telephone, int anneeNaissance){
        this.nom = nom;
        this.prenom = prenom;
        this.numeroPermis = numeroPermis;
        this.telephone = telephone;
        this.anneeNaissance = anneeNaissance;
        compteurClients ++;
    }

    public Client(Client c){
        this.nom = c.nom;
        this.prenom = c.prenom;
        this.numeroPermis = c.numeroPermis;
        this.telephone = c.telephone;
        this.anneeNaissance = c.anneeNaissance;
        compteurClients ++;
    }

    public int calculerAge(int anneeCourante){
        int age = anneeCourante - anneeNaissance;
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %d",
                nom, prenom, numeroPermis, telephone, anneeNaissance);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Client autre = (Client) obj;
        return this.numeroPermis.equals(autre.numeroPermis);
    }

    @Override
    public int hashCode(){
        return numeroPermis.hashCode();
    }
}
