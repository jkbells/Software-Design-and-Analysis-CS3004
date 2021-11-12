package source;

import java.util.Scanner;

public class GradeBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// input
		Scanner input = new Scanner("System.in");
		System.out.println("please enter the course name");
		String theName = input.nextLine();
		
		// ----------------------------------------------
		// object creation
		GradeBook myGradeBook = new GradeBook();
		
		// call to set method
		myGradeBook.setcourseName(theName);
		
		// Display
		myGradeBook.displayMessage();

	}

}
