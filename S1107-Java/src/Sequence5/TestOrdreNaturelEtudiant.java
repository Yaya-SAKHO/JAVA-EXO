package Sequence5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class TestOrdreNaturelEtudiant {

    public static void main(String[] args) {

        ArrayList<Etudiant> mesEtudiantsOrdreQcw = new ArrayList<Etudiant>();
        TreeSet<Etudiant> mesEtudiantsTries = new TreeSet<>();

        Etudiant e1 = new Etudiant("Sakho","Yaya","sakhoy","18 rue garcia","paris");
        Etudiant e2 = new Etudiant("Diouf","Fati","fatid","19 rue garcia","Lyon");
        Etudiant e3 = new Etudiant("Fall","Aly","Faldf","19 rue garcia","Grenole");
        Etudiant e4 = new Etudiant("Sylla","Issa","iqsq","10 rue garcia","Toulouse");
        Etudiant e5 = new Etudiant("Diouf","Amou","mamoud","16 rue garcia","Strasbourg");

        mesEtudiantsOrdreQcw.add(e1);
        mesEtudiantsOrdreQcw.add(e2);
        mesEtudiantsOrdreQcw.add(e3);
        mesEtudiantsOrdreQcw.add(e4);
        mesEtudiantsOrdreQcw.add(e5);


        mesEtudiantsTries.add(e1);
        mesEtudiantsTries.add(e2);
        mesEtudiantsTries.add(e3);
        mesEtudiantsTries.add(e4);
        mesEtudiantsTries.add(e5);

        Collections.sort(mesEtudiantsOrdreQcw);

        for (Etudiant etudiant : mesEtudiantsOrdreQcw){
            etudiant.affiche();
        }

        System.out.println("/**************************************/");

        for (Etudiant etudiant : mesEtudiantsTries){
            etudiant.affiche();
        }

    }

}
