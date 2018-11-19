package section2;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// START HERE
		Robot bobby = new Robot();
		bobby.move(40);
		bobby.sparkle();
		bobby.turn(90);
		bobby.move(40);
		bobby.turn(90);
		bobby.hide();
	}
}
