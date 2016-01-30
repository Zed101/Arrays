package ba.arrays.paractice;

import java.util.Scanner;

public class PromptArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] newArray = new int [5];
		int i = 0;
		System.out.println("Enter 5 numbers in array one by one");
		
		while(scan.hasNextInt()){
			
			newArray[i] = scan.nextInt();
			i++;
			
			if(i == 5){
				break;
			}
		
		}
		for (int array : newArray) {
			System.out.println(array);
			
		}
	
	}

}
