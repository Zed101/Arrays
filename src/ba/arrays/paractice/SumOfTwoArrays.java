package ba.arrays.paractice;

import java.util.Arrays;

public class SumOfTwoArrays {
	/*
	 * Iskodirati program gdje vi, a ne korisnik, napravite dva niza tipa int,
	 * proizvoljne veličine, sa unesenim vrijednostima od 0 do 9, tj. samo
	 * cifre. Napraviti treći niz, sabrati dva niza i staviti ga u treći niz.
	 * Primjer: niz1 = {9, 5, 2, 3}, dok je niz2 = {4, 8, 7}. Kada se saberu
	 * dobit će se treći niz koji će imati elemente 1, 0, 0, 1, 0.
	 */
	public static void main(String[] args) {

		int[] array1 = new int[] { 9, 5, 2, 3 };
		int[] array2 = new int[] { 4, 8, 7 };
		int digit = 0;
		int digit2 = 0;
		int[] array3 = new int[array1.length];

		int k = array2.length - 1;
		for (int i = array1.length - 1; i >= 0; i--) {
			if(k >= 0){
			array3[i] = array1[i] + array2[k];
			System.out.println(array1[i] + " " + array2[k]);
			int number = array3[i] % 10;

			if (array3[i] != number) {
				array3[i] = number;
				System.out.println(i+1 + " i + 1");
				array3 = new int [array3.length + 1];
				array3[i + 1] += 1;
				
			}
			}
			k--;
		}
		System.out.println(Arrays.toString(array3));
	

		for (int i : array3) {
			System.out.println(i);
		}

	}

}
