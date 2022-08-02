package Sequence5;

import java.util.ArrayList;
import java.util.Comparator;

public class Etudiant extends Personne implements Comparable<Etudiant>  {

    private String adresseParents;
    private ArrayList<Note> notes;
    private Groupe groupe;


    public Etudiant(String nom, String prenom, String login ) {
        super(nom,prenom,login);
        groupe = new Groupe();
    }

    public Etudiant(String nom, String prenom, String login, String adresseE, String adresseP ) {
        super(nom, prenom, login, adresseE);
        adresseParents = adresseP;
        notes = new ArrayList<Note>();
        groupe = new Groupe();
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
        System.out.println("Adresse Parent : " + getAdresseParent() + "\nNotes " + getNotes() + "\nMoyenne " + getMoyenne() + "\n" );

    }

    @Override
    public int compareTo(Etudiant o) {
        int comparaison= this.getNom().compareTo(o.getNom());
        if (comparaison==0){
            return this.getPrenom().compareTo(o.getPrenom());
        }
        else {
            return comparaison;
        }
    }


    public static final Comparator<Etudiant> compEtudiantTriParMoy = new Comparator<Etudiant>() {
        @Override
        public int compare(Etudiant o1, Etudiant o2) {
            if (o1.getMoyenne()<o2.getMoyenne()){
                return 1;
            }
            else if (o1.getMoyenne()>o2.getMoyenne()){
                return -1;
            }
            else {
                return 0;
            }
        }
    };

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        groupe.addEtudiant(this);
    }

    public boolean estDansGroupe(Groupe groupe){
        return this.groupe==groupe;
    }
}
