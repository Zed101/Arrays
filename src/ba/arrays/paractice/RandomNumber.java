package ba.arrays.paractice;

public class RandomNumber {

	public static void main(String[] args) {

		/*
		 * Napisati program koji će napraviti niz od deset brojeva. Popuniti taj
		 * niz sa random brojevima od 1 do 10. Isprintati taj niz na ekran preko
		 * foreach petlje.
		 */

		int[] arrayTo10 = new int [10];
		
		for (int i = 0; i < arrayTo10.length; i++) {
			int  numbers = arrayTo10[i] + i +1;
			numbers = (int) (Math.random() * 10) + 1;
			System.out.println(numbers);
			
		}
		
	}

}
