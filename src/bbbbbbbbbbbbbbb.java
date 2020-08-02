import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class bbbbbbbbbbbbbbb {
public static void main(String[] args) {
	
	// Create a new Robot
	Robot a = new Robot();
			// Set your robot's pen down 
a.penDown();			
			// SPEED. Set the robot to go at max speed (100)
			a.setSpeed(100);
	        // LOOP. Use a for loop to repeat ALL the following lines of code 50 times. 
			for( int i = 0; i < 500; i++) {
				
				
			
					// Change the robot pen color to random
				a.setRandomPenColor();
					// DRAW.    Move the robot (5*i) pixels\
				a.move(1*i);
					//          "i" is the variable in the for loop	
				
					// TURN.    Turn the robot (360/7) degrees to the right
				a.turn(45/1);
					// Change the robot pen width to (i)
a.setPenWidth(i);
			
			// Check the pattern against the picture in the recipe. If it matches, you are done!

			}
	

	
	
	
	
	
	
	
	
	
	
}
}
