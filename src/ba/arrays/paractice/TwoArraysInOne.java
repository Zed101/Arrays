package ba.arrays.paractice;

import java.util.Arrays;

public class TwoArraysInOne {
	/*
	 * Napraviti program gdje vi, a ne korisnik, napravite dva niza, proizvoljne
	 * dužine, i odmah unesete vrijednosti (npr. int[] array1 = {1, 5, 2, 3}).
	 * Napravite treći niz sa dovoljnom veličinom da može prihvatiti i prvi i
	 * drugi niz. Stavite prvi, zatim i drugi niz, u taj novi niz i isprintati
	 * taj treći niz na konzolu.
	 */
	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5, 9,7};
		int[] array2 = {6, 7, 8, 9, 10};
		int[] array3 = new int [array1.length + array2.length];

		int j = 0;
		for (int i = 0; i < array3.length; i++) {
			if(i < array1.length){
				array3[i] = array1[i];
			}else{
				array3[i] = array2[j];
				j++;
			}
		}
		System.out.println(Arrays.toString(array3));
		
//		for (int i = 0; i < array1.length; i++) {
//			array3[i] = array1[i];
//		
//		}
//		
//		int index = array1.length;
//		for (int j = 0; j < array2.length; j++) {
//			array3[index] = array2[j];
//			index++;
//		}
//		
		for (int i : array3) {
			System.out.print(i + ", ");
		}
	}

}
