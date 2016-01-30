package ba.arrays.paractice;

import java.util.Arrays;
import java.util.Scanner;

public class StringSmashedToChar {
	/*
	 * Zatim je potrebno obrnuti taj niz i isprintati ga (ne prihvaćam da ga
	 * odmah isprintate obrnuto, nego da prvo obrnete pa onda isprintate).
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter one word");
		String word = scan.nextLine();
		char[] lengthArray = new char[word.length()];
		char[] lengthArray1 = new char[word.length()];
		char chara = ' ';
		char chara1 = ' ';

		for (int i = 0; i < word.length(); i++) {
			chara = word.charAt(i);
			lengthArray[i] = chara;

			
		}
		 System.out.println(Arrays.toString(lengthArray));
		int k = 0;
		for (int j = lengthArray.length - 1; j >= 0; j--) {
			chara1 = lengthArray[j];
			lengthArray1[k] = chara1;
			k++;

		

		}

		System.out.println(Arrays.toString(lengthArray1));
		// System.out.println(Arrays.toString(lengthArray));

	}

}
