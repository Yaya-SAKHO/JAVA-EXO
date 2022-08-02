package Sequence5;


public class Note extends ReelContraint {


    public Note(){
        super(0,20);
    }

    public Note(float valeur){
        super(0,20);
        this.setValeur(valeur);
    }
}
