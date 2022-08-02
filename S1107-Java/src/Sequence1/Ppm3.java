package Sequence1;

import java.util.Scanner;

public class Ppm3 {


	private static int ppm3(int val ){

		if (val % 3 == 1){
			val = val - 1;
		}else if (val % 3 == 2){
			val = val + 1;
		}

		return val ;
	}

	public static void main(String[] args) {

		Scanner entree = new Scanner(System.in);
		int valeur;

		System.out.println("Saisi un entier");
		valeur = entree.nextInt();

		int res;	
		res = ppm3(valeur);

		System.out.println("le plus proche multiple de 3 de " + valeur + " est " + res);

	}

}
