package Sequence4;

import java.util.Scanner;

public abstract class ReelContraint {

    private float min;
    private float max;
    private float valeur;

    public ReelContraint(float min, float max) {
        this.min = min;
        this.max = max;
        this.valeur = min;
    }

    public float getValeur() {
        return valeur;
    }

    public void setValeur(float valeur) {
        if (valeur>=min && valeur<=max ){
            this.valeur = valeur;
        }
    }

    public void saisir(){
        Scanner entree = new Scanner(System.in);
        System.out.println("Saisir une note compris entre 0 et 20");
        valeur = entree.nextFloat();
        while (valeur<=0 || valeur>20) {
            System.out.println("Saisir une note compris entre 0 et 20");
            valeur = entree.nextFloat();
        }
    }

    @Override
    public String toString() {
        return "(" + "min=" + min + ", max=" + max + ", valeur=" + valeur + ')';
    }
}
