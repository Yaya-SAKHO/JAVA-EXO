package Sequence5;

import java.util.TreeSet;

public class TestEtudiantGroupe {

    public static void main(String[] args) {


        Etudiant e1 = new Etudiant("Sakho","Yaya","sakhoy","18 rue garcia","paris");
        Etudiant e2 = new Etudiant("Diouf","Fati","fatid","19 rue garcia","Lyon");
        Etudiant e3 = new Etudiant("Fall","Aly","Faldf","19 rue garcia","Grenole");
        Etudiant e4 = new Etudiant("Sylla","Issa","iqsq","10 rue garcia","Toulouse");
        Etudiant e5 = new Etudiant("Diouf","Amou","mamoud","16 rue garcia","Strasbourg");

        Groupe gp1 = new Groupe("AS1");
        gp1.addEtudiant(e1);
        gp1.addEtudiant(e2);
        gp1.addEtudiant(e2);

        Groupe gp2= new Groupe("AS2");
        gp2.addEtudiant(e3);
        gp2.addEtudiant(e4);
        gp2.addEtudiant(e5);

        gp1.affiche();

        gp2.affiche();



    }
}
