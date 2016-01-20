import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot ro= new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
ro.setSpeed(10);
		// 5. Set the pen width to 5

		// 6. Do steps #7 to #8 four times...

			// 7. Set the pen color to random
	
			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right

	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() 
	{ro.penDown();
	ro.move(100);
	ro.turn(90);
	ro.move(100);
	ro.turn(90);
	ro.move(100);
	ro.turn(90);
	ro.move(100);
	ro.turn(90);
	ro.move(50);
	ro.turn(90);
	ro.move(100);
	ro.turn(90);
	ro.move(50);
	ro.turn(90);
	ro.move(50);
	ro.turn(90);
	ro.move(100);
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");

		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}


