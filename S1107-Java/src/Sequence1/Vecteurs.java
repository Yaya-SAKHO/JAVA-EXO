package Sequence1;

import java.util.Scanner;

public class Vecteurs {

    private static int max(int[] v) {
        int max = v[0];

        for (int i = 1; i < v.length; i++) {
            if (v[i] > max) {
                max = v[i];
            }
        }

        return max;
    }

    private static boolean estValPresente(int[] v, int valeur) {
        int i=0;
        while( i < v.length && v[i]!=valeur ) {
            i = i+1;
        }

        if (i!=0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] monvect;
        monvect = new int[15];

        for (int i = 0; i < monvect.length; i++) {
            monvect[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < monvect.length; i++) {
            System.out.println(monvect[i]);
        }

        int res;

        System.out.println("Maximum");
        res = max(monvect);

        System.out.println(res);

        Scanner entre = new Scanner(System.in);
        System.out.println("Valeur a chercher");
        int valcherchee = entre.nextInt();
        boolean presente;
        presente = estValPresente(monvect, valcherchee);

        if (presente) {
            System.out.println("La valeur " + valcherchee + " est presente dans le vecteur");
        } else {
            System.out.println("La valeur " + valcherchee + " n'est pas presente dans le vecteur");
        }
    }
}

