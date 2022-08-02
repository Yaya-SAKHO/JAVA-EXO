package Sequence5;

import java.util.ArrayList;
import java.util.Collections;

public class TesteEtudiantTriMoyenne {

    public static void main(String[] args) {

        ArrayList<Etudiant> mesEtudiantTriesMoyenne = new ArrayList<>();


        Etudiant e1 = new Etudiant("Sakho","Yaya","sakhoy","18 rue garcia","paris");
        Etudiant e2 = new Etudiant("Diouf","Fati","fatid","19 rue garcia","Lyon");
        Etudiant e3 = new Etudiant("Fall","Aly","Faldf","19 rue garcia","Grenole");

        e1.addNotes(4);
        e1.addNotes(12);
        e1.addNotes(13);

        e2.addNotes(20);
        e2.addNotes(19);
        e2.addNotes(18);

        e3.addNotes(2);
        e3.addNotes(13);
        e3.addNotes(4);

        mesEtudiantTriesMoyenne.add(e1);
        mesEtudiantTriesMoyenne.add(e2);
        mesEtudiantTriesMoyenne.add(e3);

        for (Etudiant etudiant : mesEtudiantTriesMoyenne){
            etudiant.affiche();
        }
        System.out.println("***********************************************************");
        Collections.sort(mesEtudiantTriesMoyenne, Etudiant.compEtudiantTriParMoy);

        for (Etudiant etudiant : mesEtudiantTriesMoyenne){
            etudiant.affiche();
        }
    }
}
