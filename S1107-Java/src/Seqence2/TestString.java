package Seqence2;

import java.util.Locale;
import java.util.Scanner;

public class TestString {
    public static void main(String[] args) {
        Scanner entree = new Scanner(System.in);
        String maChaine ;
        String maChaine2 ;
        System.out.println("saisir la chaine 1");
        maChaine = entree.next();
        System.out.println(maChaine);
        int compteVa = maChaine.length();
        System.out.println("Nombre de caractere dans la chaine : " + compteVa);
        String majuscule = maChaine.toUpperCase();
        System.out.println("Ma chaine en Majuscule : " + majuscule);
        System.out.println("saisir la chaine 2");
        maChaine2 =entree.next();
        if (maChaine.equals(maChaine2)){
            System.out.println("le deux chaine sont identique");
        }
        else {
            System.out.println("le deux chaine sont different");
        }
        if (maChaine==maChaine.toLowerCase()){
            System.out.println("ma chaine est un muniscule");
        }
        else{
            System.out.println("ma chaine n'est  pas en minuscule ");
        }

    }
}
