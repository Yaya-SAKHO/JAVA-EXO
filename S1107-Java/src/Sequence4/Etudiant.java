package Sequence4;

import java.util.ArrayList;

public class Etudiant extends Personne {

    private String adresseParents;
    private ArrayList<Note> notes;

    public Etudiant(String nom, String prenom, String login) {
        super(nom,prenom,login);
    }

    public Etudiant(String nom, String prenom, String login, String adresseE, String adresseP) {
        super(nom, prenom, login, adresseE);
        adresseParents = adresseP;
        notes = new ArrayList<Note>();
    }


    public String getAdresseParent() {
        return this.adresseParents;
    }

    public String getMail(){
        return (getPrenom()+"."+getNom()+"@etu.univ-grenoble-alpes.fr");
    }

    public float getMoyenne(){
        float som=0;
        float moy;
        for (int i=0; i< notes.size(); i++){
           som  +=  notes.get(i).getValeur();
        }
        moy = som / notes.size();
        return moy;
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }

    public void setAdresse(String adresseE , String adresseP){
        setAdresse(adresseE);
        this.adresseParents = adresseP;
    }

    public void addNotes(float uneNote){
        Note note = new Note(uneNote);
        notes.add(note);
    }



    public void affiche(){
        super.affiche();
        System.out.println("Adresse Parent : " + getAdresseParent() + "\nNotes " + getNotes() + "\nMoyenne " + getMoyenne() );

    }


}
