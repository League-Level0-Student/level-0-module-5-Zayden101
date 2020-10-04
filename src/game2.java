import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class game2 {
public static void main(String[] args) {
	boolean usedPowerup = false;
	Robot player = new Robot();
	player.setSpeed(5);
	player.penDown();
	player.setWindowSize(4000, 1000);

	String line=JOptionPane.showInputDialog("chose a thickness 1-15");
	int width = Integer.parseInt(line);
	player.setPenWidth(width);
	
	String speed=JOptionPane.showInputDialog("choose a speed, 5-10");
	if (speed .equals("5")) {
		player.setSpeed(1);
	}
	if (speed .equals("6")) {
		player.setSpeed(6);
	}
	if (speed .equals("7")) {
		player.setSpeed(7);
	}
	if (speed .equals("8")) {
		player.setSpeed(8);
	}
	if (speed .equals("9")) {
		player.setSpeed(9);
	}
	if (speed .equals("10")) {
		player.setSpeed(10);
	}
	
	String color=JOptionPane.showInputDialog("choose a color, red, blue, yellow, random");
	if (color .equals("red")) {
		player.setPenColor(Color.red);
	}
	if (color .equals("blue")) {
		player.setPenColor(Color.blue);
	}
	if (color .equals("yellow")) {
		player.setPenColor(Color.yellow);
	}
	if (color .equals("random")) {
		player.setRandomPenColor();
	}
	JOptionPane.showMessageDialog(null, "you can type color while moving to change to a random color");
	String car=JOptionPane.showInputDialog("choose a car, mini or normal");
	if (car .equals("mini")) {
		player.miniaturize();
	}
	String sparkle=JOptionPane.showInputDialog("choose a car, sparkly or normal");
	if (car .equals("sparkly")) {
		player.sparkle();
	}

	JOptionPane.showMessageDialog(null, "type power to chose a power");
	String j=JOptionPane.showInputDialog(null, "would you like an explaniton for the power?");
	if (j .equals("yes")) {
		JOptionPane.showMessageDialog(null, "Powers can be found by typing power while moving. Powers can be used ONLY ONCE, if you type power but dont chose a power, you will get no other chance to use powers");
	
	}
	
	JOptionPane.showMessageDialog(null, "you have 50 moves to make something");
	JOptionPane.showMessageDialog(null, "type other while moving to");
	JOptionPane.showMessageDialog(null, "type done while moving if you are done drawing but you havent used all moves");
	for (int i = 0; i < 50; i++) {
		
	String move=JOptionPane.showInputDialog("w, a, s, d,ww, aa, ss, dd");
	
	if (move .equals("w")) {
		player.move(50);
	}
	if (move.equals("d")) {
		player.turn(90);
		player.move(50);
		player.turn(-90);
	}
	if (move.equals("s")) {
		player.turn(180);
		player.move(50);
		player.turn(-180);
	}
	if (move.equals("a")) {
		player.turn(-90);
		player.move(50);
		player.turn(90);
	}
	if (move .equals("ww")) {
		player.move(100);
	}
	if (move.equals("dd")) {
		player.turn(90);
		player.move(100);
		player.turn(-90);
	}
	if (move.equals("ss")) {
		player.turn(180);
		player.move(100);
		player.turn(-180);
	}
	if (move.equals("aa")) {
		player.turn(-90);
		player.move(100);
		player.turn(90);
	}
	if (move.equals("other")) {
	JOptionPane.showMessageDialog(null, "color, done, power");
	}
	if (move.equals("color")) {
			player.setRandomPenColor();
		JOptionPane.showMessageDialog(null, "your color has been changed");
	}
	if (move.equals("done")) {
		break;
	}
	String p="";
	if(usedPowerup == false) {
		if (move.equals("power")) {
			JOptionPane.showMessageDialog(null,"REMBER, any powers you do cannot be undone");
			p=JOptionPane.showInputDialog("upsidedown, sideways (right), sideways (left), super speed");
			usedPowerup = true;
		}
	}
	if (p.equals("upsidedown")) {
		player.turn(180);
	}
	if (p.equals("sideways (right)")) {
		player.turn(90);
	}
	if (p.equals("sideways (left)")) {
		player.turn(-90);
	}
	if (p.equals("super speed")) {
		player.setSpeed(99999);
	}
	}
	JOptionPane.showMessageDialog(null, "this is what you have made");
	

}
}
