package Sequence4;

public class TestNoteEtudiant {

    public static void main(String[] args) {

        Etudiant e1 = new Etudiant("Sakho","Yaya","sakhoy","1 rue moyrand","18 rue federo");
        e1.addNotes( 1);
        e1.addNotes(3);
        e1.addNotes(-1);
        e1.getNotes();

        e1.getMoyenne();

        e1.affiche();
    }
}
