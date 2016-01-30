package ba.arrays.paractice;

import java.util.Arrays;
import java.util.Scanner;

public class SearchNumberINArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of array");
		int[] array = new int[scan.nextInt()];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter element of array one by one");
			array[i] = scan.nextInt();
		}
		System.out.println("Enter number that you searching for");
		int q = scan.nextInt();
		boolean boo = false;
		int numbers = 0;
		long start = System.currentTimeMillis();
		for (int i = 0; i < array.length; i++) {
			numbers = array[i];

			if (numbers == q) {
				boo = true;

			}
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start + " time");
		System.out.println(Arrays.toString(array));
		System.out.println(boo);
	}

}
