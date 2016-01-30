package ba.arrays.paractice;

import java.util.Arrays;

public class CountNubersInArrayString {

	public static void main(String[] args) {
		String[] stringInput = new String[] { "B1tC4mp", "J4V4", "0k0L0", "S01e_M10", "89377" };
		int[] intArray = new int[10];

		String chara = "";

		char chara1 = ' ';
		int counter = 0;

		for (int i = 0; i < stringInput.length; i++) {
			chara += stringInput[i];
		}

		for (int i = 0; i < intArray.length; i++) {
			counter = 0;
			for (int j = 0; j < chara.length(); j++) {
				chara1 = chara.charAt(j);
				System.out.println("Provjeravam karakter: " + chara1 + " i index: " + i);
				if(checkNumber(chara1, i)){
					System.out.println("Trenutni counter " + counter);
					counter++;
				}
				// System.out.println(chara.charAt(j));

			}
			intArray[i] = counter;

		}

		System.out.println(Arrays.toString(intArray));
		System.out.println(chara);
	}

	public static boolean checkNumber(char chara1, int i) {
		if (chara1 == '0' && i == 0) {
			return true;
		}
		if (chara1 == '1' && i == 1) {
			return true;
		}
		if (chara1 == '2' && i == 2) {
			return true;
		}
		if (chara1 == '3' && i == 3) {
			return true;
		}
		if (chara1 == '4' && i == 4) {
			return true;
		}
		if (chara1 == '5' && i == 5) {
			return true;
		}
		if (chara1 == '6' && i == 6) {
			return true;
		}
		if (chara1 == '7' && i == 7) {
			return true;
		}
		if (chara1 == '8' && i == 8) {
			return true;
		}
		if (chara1 == '9' && i == 9) {
			return true;
		}
		return false;

	}

}
