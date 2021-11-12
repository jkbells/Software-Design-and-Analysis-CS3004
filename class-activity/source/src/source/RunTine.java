

import java.util.Scanner;
public class RunTine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[5];
		
		System.out.println("Please Enter Values in an Array");
		Scanner input = new Scanner(System.in);
		
		for (int counter = 0; counter < array.length; counter++) {
			array[counter] = input.nextInt();
		}
		
		System.out.println("values in Array");
		
		for (int counter = 0; counter < array.length; counter++) {
			System.out.println(counter + "\t" + array[counter]);
		}

	}

}
