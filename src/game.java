import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class game {
public static void main(String[] args) {
	Robot player = new Robot();
	player.setSpeed(5);
	player.penDown();
	player.setWindowSize(4000, 1000);

	String line=JOptionPane.showInputDialog("chose a thickness 1-10");
	int width = Integer.parseInt(line);
	player.setPenWidth(width);
	
	
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
	

	JOptionPane.showMessageDialog(null, "you have 50 moves to make something");
	JOptionPane.showMessageDialog(null, "type done while moving if you are done drawing but you havent used all moves");
	for (int i = 0; i < 50; i++) {
		
	String move=JOptionPane.showInputDialog("up, down, right, left, big up, big down, big right, big left?");
	
	if (move .equals("up")) {
		player.move(50);
	}
	if (move.equals("right")) {
		player.turn(90);
		player.move(50);
		player.turn(-90);
	}
	if (move.equals("down")) {
		player.turn(180);
		player.move(50);
		player.turn(-180);
	}
	if (move.equals("left")) {
		player.turn(-90);
		player.move(50);
		player.turn(90);
	}
	if (move .equals("big up")) {
		player.move(100);
	}
	if (move.equals("big right")) {
		player.turn(90);
		player.move(100);
		player.turn(-90);
	}
	if (move.equals("big down")) {
		player.turn(180);
		player.move(100);
		player.turn(-180);
	}
	if (move.equals("big left")) {
		player.turn(-90);
		player.move(100);
		player.turn(90);
	}
	if (move.equals("color")) {
			player.setRandomPenColor();
		JOptionPane.showMessageDialog(null, "your color has been changed");
	}
	if (move.equals("done")) {
		break;
	}
	}
	JOptionPane.showMessageDialog(null, "this is what you have made");
	
}
}
