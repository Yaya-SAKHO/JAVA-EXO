package Sequence3;

public class Etudiant extends Personne {

    private String adresseParents;

    public Etudiant( String nom,String prenom,String login) {
        super(nom,prenom,login);
    }

    public Etudiant(String nom, String prenom, String login, String adresseE, String adresseP) {
        super(nom, prenom, login, adresseE);
        adresseParents = adresseP;
    }


    public String getAdresseParent() {
        return this.adresseParents;
    }

    public String getMail(){
        return (getPrenom()+"."+getNom()+"@etu.univ-grenoble-alpes.fr");
    }


    public void setAdresse(String adresseE , String adresseP){
        setAdresse(adresseE);
        this.adresseParents = adresseP;
    }

    public void affiche(){
        super.affiche();
        System.out.println("Adresse Parent : " + getAdresseParent());
    }


}
