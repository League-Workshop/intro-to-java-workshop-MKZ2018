package section2;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {
		// 1. Create a new Robot
		Robot bobby = new Robot();
		// 3. Put the robot's pen down
		bobby.penDown();
		// 9. Set the pen to a color that you like for the shape
		bobby.setRandomPenColor();
		// 4. Make a variable for the number of sides you want (can’t test this one)
		int sides = 5;
		// 5. Make a second variable for the angle you want the robot to turn. Hint: you
		// can divide in Java using "/". Can’t test until step 6
		int angle = 360 / 5;
		// 7. Use a for loop to repeat steps #2 to #11, 200 times. When this is done you
		// should see a pentagon
		for (int j = 0; j < 200; j++) {

			// 2. Move the robot 200 pixels
			bobby.move(200);
			// 10. Change the previous line of code to make the robot move "i" pixels
			// instead of 200
			bobby.move(j);
			// 6. Turn the robot the amount in your angle variable
			bobby.move(angle);
			// 11. Turn the robot one more degree
			bobby.turn(1);
		}
	}

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}
