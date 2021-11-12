package source;

import java.util.Scanner;

public class inputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,sum;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your First Number");
		num1 = input.nextInt();
		System.out.println("Enter your Second Number");
		num2 = input.nextInt();
		sum  = num1+num2;
		System.out.println("The sum of two numbers = " + sum);
		
		
	}
}
