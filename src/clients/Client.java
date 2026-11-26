package clients;

public class Client {

    public String nom;
    public String prenom;
    public String numeroPermis;
    public String telephone;
    public int anneeNaissance;

    public Client(){
        this.nom = "N/A";
        this.prenom = "N/A";
        this.telephone = "N/A";
        this.numeroPermis = "N/A";
        this.anneeNaissance = 2000;
    }

    public Client(String nom, String prenom, String numeroPermis, String telephone, int anneeNaissance){
        this.nom = nom;
        this.prenom = prenom;
        this.numeroPermis = numeroPermis;
        this.telephone = telephone;
        this.anneeNaissance = anneeNaissance;
    }

    public Client(Client c){
        this.nom = c.nom;
        this.prenom = c.prenom;
        this.numeroPermis = c.numeroPermis;
        this.telephone = c.telephone;
        this.anneeNaissance = c.anneeNaissance;
    }

    public int calculerAge(int anneeCourante){
        int age = anneeCourante - anneeNaissance;
        return age;
    }
}
