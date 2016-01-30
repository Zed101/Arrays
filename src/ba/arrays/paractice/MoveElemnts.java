package ba.arrays.paractice;

import java.util.Arrays;
import java.util.Scanner;

public class MoveElemnts {
	/*
	 * Napisati program gdje korisnik unosi cijeli broj N. Pored toga vi imate
	 * fiksiran jedan niz od deset elemanata tipa char. Shiftati taj niz u
	 * desno, ukoliko je N > 0, ili u lijevo, ukoliko je N < 0, za N puta.
	 * Naravno, ukoliko je N = 0 onda nije potrebno ništa uraditi.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of move");
		int index = scan.nextInt();
		char[] elements = new char[] { 'I', 'N', 'G', 'B', 'I', 'T', 'C', 'A', 'M', 'P' };
		char[] array2 = new char[elements.length];

		// System.out.println(string);
		if (index >= 0) {
			index = index % elements.length;
			for (int i = 0; i < elements.length; i++) {
				array2[index] = elements[i];
				index++;
				if(index == elements.length){
					index = 0;
				}

			}
		}else{
			index = index % elements.length;
			index = elements.length + index;
			for (int i = 0; i < array2.length; i++) {
				array2[index] = array2[i];
				index++;
				if(index == elements.length){
					index -= index;
				}
			}
		}
		System.out.println(Arrays.toString(array2));
		for (char c : elements) {
			// System.out.println(c );
		}
	}

}
