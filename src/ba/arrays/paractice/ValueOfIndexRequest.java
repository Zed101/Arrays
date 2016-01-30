package ba.arrays.paractice;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Napraviti program koji od korisnika traži da unese dužinu niza N. 
 * Zatim će korisnik unijeti broj unosa K. U sljedećih K linija korisnik će unositi po dva broja. 
 *Prvi broj označava indeks a drugi broj označava vrijednost koja će se staviti na taj indeks.
 */
public class ValueOfIndexRequest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of array");
		int n = 0;
		try {
			n = scan.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("try again");
		}
		int[] array = new int[n];

		
		int index = 0;
		

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter number of index");
			try { 
				index = scan.nextInt();
			}catch(InputMismatchException e){
				System.out.println("try again");
			}
			System.out.println("Enter value of index");
			int valueOfIndex = scan.nextInt();
			 array[index] = valueOfIndex;
		}
		for (int i : array) {
			System.out.println(i);
		}
		
	}

}
