package _99_extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
Robot a = new Robot();
		//2. Set the speed to 100
a.setSpeed(100);
a.penDown();
		int colorChoice=JOptionPane.showOptionDialog(null, "Chose color", "color", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Yellow", "Blue","Green","Orange", "Random"}, 0);
		System.out.println(colorChoice);
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if (colorChoice == (0)) {
			a.setPenColor(Color.red);
		}
		if (colorChoice == (1)) {
			a.setPenColor(Color.yellow);
		}
		if (colorChoice == (2)) {
			a.setPenColor(Color.blue);
		}
		if (colorChoice == (3)) {
			a.setPenColor(Color.green);
		}
		if (colorChoice == (4)) {
			a.setPenColor(Color.orange);
		}
		if (colorChoice == (5)) {
		a.setRandomPenColor();
		}
		//4. Ask the use how many polygons they want to be drawn.
		String o=JOptionPane.showInputDialog("how many pologons");
		int oo=Integer.parseInt(o);

		//5. Use the robot to draw the number of polygons the user requested.
		for (int i = 0; i < oo; i++) {
			a. move(100);
			a. turn(90);
			a. move(100);
			a. turn(90);
			a. move(100);
			a. turn(90);
			a. move(100);
			a.turn(90);
			a.move(10);
			a.turn(90);
			a.move(10);
			a.turn(-90);
		}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

