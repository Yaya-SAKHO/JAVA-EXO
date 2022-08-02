package Sequence4;

public abstract class Personne {

    private String login;
    private String nom;
    private String prenom;
    private String adresse;
    private int age ;

    public Personne(String nom, String prenom, String login) {
        this.login = login;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom, String login, String adresse) {
        this.login = login;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse ;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getLogin() {
        return login;
    }


    public String getNomComplet(){
        return this.nom.concat(this.prenom);
    }

    public int getAge(){
        return age;
    }

    public abstract String getMail();
    //{
       // return (getNom()+"."+getPrenom()+"@univ-grenoble-alpes.fr");
    //}

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse){
        this.adresse = adresse;
    }



    public void affiche(){
        System.out.println("Nom : " + getNom() + " `\nPrenom : " + getPrenom() + " \nLogin : " + getLogin() + " \nAdress : " + getAdresse() + "\nAdresse Mail : " + getMail()   );
    }



}
