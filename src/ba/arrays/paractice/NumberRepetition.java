package ba.arrays.paractice;

import java.util.Scanner;

public class NumberRepetition {
	/*
	 * Iskodirati program gdje se korisnik pita koliko će brojeva unijeti. Zatim
	 * unijeti sve te elemente, koji su tipa int, u niz. Na kraju će se korisnik
	 * pitati koji broj želi da se prebroji. Provjeriti koliko se taj broj
	 * pojavljuje u nizu i isprintati na ekran.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter number of elmentns that you want");
		int nOfElements = scan.nextInt();
		int[] arrayElements = new int [nOfElements];
		int i = 0;
		int counter = 0;
		
		for (int thatelement : arrayElements) {
			//System.out.println(thatelement);
		}
		
		for (int j = 0; j < arrayElements.length; j++) {
			System.out.println("Enter elemets in array");
			
			arrayElements[j] = scan.nextInt();
			
		}
		System.out.println("Enter number u search for");
		i = scan.nextInt();
		for (int k : arrayElements) {
			//System.out.println(k);
			if (i == k){
				counter++;
				System.out.println("Inputetd number exist in array");
			}
		}
		System.out.println(counter + " times");
		
		
	}

}
