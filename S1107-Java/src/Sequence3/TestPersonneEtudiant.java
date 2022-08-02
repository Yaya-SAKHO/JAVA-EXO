package Sequence3;

public class TestPersonneEtudiant {

    public static void main(String[] args) {

        Etudiant E2 = new Etudiant("Sakho","Yaya","sakhoy","3 rue Moyrand","4 rue Moyrand");
        Personne P1 = new Personnel("Soumare","Issa","soum");
        E2.affiche();
        System.out.println("****************************************");
        P1.affiche();
        System.out.println("*****************************************");
        System.out.println(P1.getMail());
        System.out.println(E2.getMail());
        System.out.println("****************Changer l'adresse Etudiant*******************");
        E2.setAdresse("4 aller de Royman","8 Rue Charle de Gaul");
        E2.affiche();


    }
}
