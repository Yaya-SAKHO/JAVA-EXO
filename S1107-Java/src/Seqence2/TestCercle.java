package Seqence2;

public class TestCercle {

    public static void main(String[] args) {

        Cercle cercle00 = new Cercle(3);
        Cercle cercleQcq = new Cercle(3,4,2);

        cercle00.affiche();
        cercleQcq.affiche();
        cercle00.deplaceCentre(27,33);
        cercle00.affiche();
    }
}
