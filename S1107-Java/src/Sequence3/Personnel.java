package Sequence3;

public class Personnel  extends Personne {

    private int echalon;
    private float valeurPointIndice;

    public Personnel(String nom, String prenom, String login ){
        super(nom,prenom,login);

    }

    public Personnel(String nom, String prenom, String login, int echalon , float valeurPoint ){
        super(nom,prenom,login);
        this.echalon = echalon;
        this.valeurPointIndice = valeurPoint;

    }

    public int getEchalon(){
        return this.echalon;
    }

    public float getValeurPointIndice(){
        return this.valeurPointIndice;
    }

    public float getSalaire(){
        return this.echalon * this.valeurPointIndice;
    }

    public void setEchalon(int echalon) {
        this.echalon = echalon;
    }

    public void setValeurPointIndice(float valeurPoint){
        this.valeurPointIndice = valeurPoint;
    }


    public void affiche() {
        super.affiche();
        System.out.println("Echalon : " + getEchalon() +  " \nSalaire : " + getSalaire());
    }

    @Override
    public String getMail() {
     return (getNom()+"."+getPrenom()+"@univ-grenoble-alpes.fr");
    }
}
