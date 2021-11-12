package source;

// Classes, Objects, and Functions
// working with Multiple classes

public class GradeBook {
	
	private String courseName;
	
	// Method to Set The courseName
	public void setcourseName(String name) {
		courseName = name;
	}
	
	// method to retrieve the course name
	public String getCourseName() {
		return courseName;
	}
	
	// display a welcome message to the Gradebook user
	public void displayMessage() {
		System.out.print("Welcome to the grade book for " + getCourseName());
	}	
}
