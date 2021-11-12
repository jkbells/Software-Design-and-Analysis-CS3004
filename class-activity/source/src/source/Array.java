package source;

public class Array {
	
	public static void main(String[] args) {
		
		// declare array named array
		int[] array;
		
		// create the array object
		array = new int[10];
		
		// column headings
		System.out.println("Index" + "\t" + "Value");
		
		// output each array element's value
		for (int counter = 0; counter < array.lenght; counter++)
		{
			System.out.print(counter + "\t" + array [counter] );
			
		}
	}

}
