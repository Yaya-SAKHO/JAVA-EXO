package Sequence4;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList {

    public static void main(String[] args) {

        ArrayList <Integer> alIntegers = new ArrayList<Integer>();
        alIntegers.add(10);
        alIntegers.add(9);
        alIntegers.add(3);
        alIntegers.add(-1);
        alIntegers.add(20);


      // alIntegers.remove(0); suprimme

        for (Integer  unEntier: alIntegers ){
            System.out.println(unEntier);
        }

        //System.out.println(alIntegers.size()); la taille
        //System.out.println(alIntegers.get(2)); affiche l'endroit ou se trouve la valeur 2

        System.out.println("************trie************************");
        Collections.sort(alIntegers);
        for (Integer  unEntier: alIntegers ){
            System.out.println(unEntier);
        }
        System.out.println("************trie renverse************************");
        Collections.reverse(alIntegers);
        for (Integer  unEntier: alIntegers ){
            System.out.println(unEntier);
        }

        System.out.println("************trie renverse 2 ************************");
        Collections.sort(alIntegers, Collections.reverseOrder());
        for (Integer  unEntier: alIntegers ){
            System.out.println(unEntier);
        }

        ArrayList<String> alString = new ArrayList<String>();
        alString.add("yaya");
        alString.add("Moussa");
        alString.add("Issa");
        alString.add("Fati");

        for (String chaine : alString){
            System.out.println(chaine);
        }
    }
}
