package ba.arrays.paractice;

import java.util.Arrays;
import java.util.Scanner;

public class ToHard {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int[] array = new int[100000];
		long start = System.currentTimeMillis();

		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100000) + 1;
			
		}
		Arrays.sort(array);
		System.out.println("Enter the number you searching for");
		int n = scan.nextInt();
		System.out.println(Arrays.binarySearch(array, n));
		long end = System.currentTimeMillis();
		System.out.println(end - start + " time");
	//	System.out.println(Arrays.toString(array));
	}

}
