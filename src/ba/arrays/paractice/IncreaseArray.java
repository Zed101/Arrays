package ba.arrays.paractice;

public class IncreaseArray {
	/*
	 * Napisati program gdje vi, a ne korisnik, napravite jedan niz proizvoljne
	 * veličine i popunite ga sa proizvoljnim int vrijednostima. Napravite
	 * drugi, duplo veći, niz i popunite prvih pola indeksa sa vrijednostima
	 * prvoga niza. Ostatak niza će biti ispunjen nulama. Tako ste, zapravo,
	 * uradili „povećanje“ niza.
	 */
	public static void main(String[] args) {
		int[] array = new int[10];
		int numbers = 0;

		for (int i = 0; i < array.length; i++) {
			numbers = array[i] + i + 1;
			numbers = (int) (Math.random() * 10) + 1;
			array[i] = numbers;

		}
		for (int j : array) {
			// System.out.println(j); // array filled with random numbers
		}
		int[] array2 = new int[array.length * 2];

		for (int i = 0; i < array.length; i++) {
			array2[i] = array[i];

		}
		for (int i : array2) {
			System.out.println(i);// array2 filled with zeros

		}
	}
}
