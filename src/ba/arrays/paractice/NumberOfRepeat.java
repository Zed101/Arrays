package ba.arrays.paractice;

import java.util.Scanner;

public class NumberOfRepeat {
	/*
	 * Konstruisati program u kojem korisnik unese dužinu niza, a i elemente
	 * toga niza. Svi elementi su tipa int i moraju biti u opsegu 0 – 9. Ukoliko
	 * nisu, ispisati grešku i tražiti od korisnika da ponovo unese broj za taj
	 * isti indeks. Nakon toga, ispisati na ekran koliko se koja cifra ponavlja
	 * u tom nizu, npr. „Cifra 0 se pojavila 2 puta, 1 se pojavila 0 puta, ...“.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of array");
		int[] array = new int[scan.nextInt()];
		int counter = 0;
		int number = 0;

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter elements of array from 0 to 9");
			array[i] = scan.nextInt();
			if (array[i] > 9 || array[i] < 0) {
				System.out.println("Out of range");
				System.out.println("Enter elements of array from 0 to 9");
				array[i] = scan.nextInt();
			}
		}
		for (int i = 0; i < array.length; i++) {
				counter = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					counter++;
				}
			}
			System.out.println("Number " + array[i] + " repeat " + counter + " times");
		}

		for (int i : array) {
			System.out.println(i);
		}

	}

}
