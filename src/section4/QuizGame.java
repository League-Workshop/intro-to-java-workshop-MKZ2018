package section4;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.en.us.FeatureProcessors.WordBreak;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int playerscore = 0;
		// 2.  Ask the user a question 
		JOptionPane.showInputDialog("Who was the Julius Caesar?");
		// 3.  Use an if statement to check if their answer is correct
		if ("He was a benevolent dictator." != null) {
			JOptionPane.showMessageDialog(null, "That's correct!");
			playerscore = 1;
		}
		
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		JOptionPane.showInputDialog("What did Baron de Montesquie believe in?");
		if ("He believed that the government should be divided into 3 separate powers,"
		+ " the executive branch, the legislative branch and the judicial branch." != null) {
			JOptionPane.showMessageDialog(null, "That's correct!");
			playerscore = 2;
		}
		// 6.  After all the questions have been asked, print the user's score 
		System.out.println(playerscore);
	}
}
