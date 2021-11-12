package source;

import javax.swing.*;

public class swing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog("Enter a number");
		int number1 = Integer.parseInt(input);
		int sqr = number1*number1;
		
		JOptionPane.showMessageDialog(null, "Square = " + sqr);
	}

}
