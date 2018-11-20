package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		JOptionPane.showInputDialog("If you find yourself having to cross a piranha-infested river,"
				+ " here's how to do it...");
		String adjective;
		String liquid;
		String bodypart;
		String verb;
		String place;
		// Get the user to enter an adjective
adjective = JOptionPane.showInputDialog("enter adjective");
		// Get the user to enter a type of liquid
liquid = JOptionPane.showInputDialog("enter liquid");
		// Get the user to enter a body part
bodypart = JOptionPane.showInputDialog("enter a body part");
		// Get the user to enter a verb
verb = JOptionPane.showInputDialog("enter a verb");
		// Get the user to enter a place
place = JOptionPane.showInputDialog("enter a place");
		// Fit the user's words into this sentence, and save it in a String:

		 JOptionPane.showMessageDialog(null, "Piranhas are more " + adjective "during the day, "
		+ "so cross the river at night. Piranhas are attracted to fresh"  + liquid "and will most"
		+ "likely take a bite out of your [body part] if your"  + bodypart. "Whatever"
		+ "you do, if you have an open wound, try to find another way to get "
		+ "back to the" + place. "Good luck!");
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		

	}
}

