package source;

public class GradeBookCons {
	
	private String courseName;
	
	// constructor name is same as class name
	public GradeBookCons(String name) {
		courseName = name; 
	}
	// ---------------------------------------------
	public String getCourseName()
	{
		return courseName;
	}
	
	public void displayMessage() {
		System.out.println("Welcome to the grade book for" + getcourseName());
	}
}
