import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class delet {
	int num = Integer.parseInt("random");
public static void main(String[] args) {
	
	
	String q=JOptionPane.showInputDialog("enter number");
	
	if (q.equals("1")) {
		Robot a = new Robot();
		a.miniaturize();
		for (int i = 0; i < 50; i++) {
		a.setWindowColor(255, 255, 255);
		a.move(1);
		a.turn(1);
		a.setWindowColor(0, 0, 0);
		a.move(1);
		a.turn(1);
		}
	}
	if (q.equals("2")) {
		JOptionPane.showMessageDialog(null, "you are just wierd");
	}
if (q.equals("3")) {
	for (int i = 0; i < 25; i++) {
		JOptionPane.showMessageDialog(null, "ERROR");
	}
	}
if (q.equals("4")) {
JOptionPane.showMessageDialog(null, "no");
}
if (q.equals("5")) {
	JOptionPane.showMessageDialog(null, "5");
}
if (q.equals("6")) {
	Robot b=new Robot();
	b.miniaturize();
	b.penDown();
	b.setSpeed(99999);
	b.setPenWidth(10);
	for (int i = 0; i < 175; i++) {
	b.setRandomPenColor();
	b.move(2);
	b.turn(2);
}
}
	
}
}
