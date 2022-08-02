package Sequence5;

import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.TreeSet;

public class Groupe {

    private String libelle;
    TreeSet<Etudiant> etudiants ;

    public Groupe (){
    }

    public Groupe(String libelle) {
        this.libelle = libelle;
        etudiants = new TreeSet<>();
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void addEtudiant(Etudiant etudiant){
        this.etudiants.add(etudiant);
    }

    public boolean contientEtudiant(Etudiant etudiant){
        return this.etudiants.contains(etudiant);
    }

    public TreeSet<Etudiant> getEtudiant(){
        return etudiants;
    }

    public void affiche(){
        System.out.println("Groupe ");
        System.out.println("************"+ libelle +"***************");
        for (Etudiant etudiant : etudiants)
        {
            etudiant.affiche();
        }
    }



}
