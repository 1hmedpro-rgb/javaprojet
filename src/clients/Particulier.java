package clients;

public class Particulier extends Client{

    private boolean estAssurePlusUnAn;

    public Particulier(String nom,String prenom,String telephone,int anneeNaissance,boolean estAssurePlusUnAn){
        super(nom,prenom,telephone,telephone,anneeNaissance);
        this.estAssurePlusUnAn = estAssurePlusUnAn;
    }
}
