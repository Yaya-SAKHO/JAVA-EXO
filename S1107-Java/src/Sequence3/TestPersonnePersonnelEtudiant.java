package Sequence3;

public class TestPersonnePersonnelEtudiant {

    public static void main(String[] args) {

       //Personne pp = new Personne("Issa","Soumare","personne1231","1 persone Grenoble ");
       Personnel pp1 = new Personnel("Diouf","Diouf","personel12377",2000,20);
       Etudiant etu = new Etudiant("Aly","Fall","etu.11","etua-15-2555","etu_parent");

       //System.out.println("**********Perssonne*************************");
       //pp.affiche();
       System.out.println("***********Personnel*************************");
       pp1.setAdresse("Fati_123_Diouf");
       pp1.affiche();
       System.out.println("***********etudiant****************************");
       etu.affiche();
    }
}
