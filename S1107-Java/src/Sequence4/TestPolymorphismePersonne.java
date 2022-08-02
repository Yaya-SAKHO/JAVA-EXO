package Sequence4;

import java.util.ArrayList;

public class TestPolymorphismePersonne {

    public static void main(String[] args) {

        ArrayList<Personne> mesPersonnes = new ArrayList<Personne>();

        Etudiant e1 = new Etudiant("yaya","sakho","sakhoy","rue moyrand","toulel");
        Personnel p1 = new Personnel("Fati","diouf","fatiD",2000,20.0f);

        mesPersonnes.add(e1);
        mesPersonnes.add(p1);

        for (Personne pers : mesPersonnes){
            if (pers instanceof Etudiant )
            System.out.println(pers.getMail());
        }

        for (Personne pers : mesPersonnes){
                System.out.println(pers.getMail());
        }

    }


}
