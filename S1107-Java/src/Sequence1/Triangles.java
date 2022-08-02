package Sequence1;

import java.util.Scanner;

public class Triangles {

    private static void afficheLigne(int val) {
        for (int i = 0; i < val; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    private static void demiTriangleIsocele(int val) {
        for (int i = 1; i <= val; i++) {
            afficheLigne(i);
        }
    }

    private static void triangleIsocele(int val) {
        for (int i = 1; i <= val; i++) {
            afficheLigne(i);
        }
        for (int i = val; i >= 1; i--) {
            afficheLigne(i);
        }
    }

    public static void main(String[] args) {

        // demiTriangleIsocele(3);
        Scanner entree = new Scanner(System.in);
        int valeur;
        System.out.println("Saisi un entier");
        valeur = entree.nextInt();

        afficheLigne(valeur);
        System.out.println("");
        demiTriangleIsocele(valeur);
        System.out.println("");
        triangleIsocele(valeur);

    }


}
