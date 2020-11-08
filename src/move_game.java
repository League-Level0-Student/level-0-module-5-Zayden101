import java.awt.Image;
import java.security.PublicKey;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.jointheleague.graphical.robot.Robot;

public class move_game {
static Random rand = new Random();
public static void main(String[] args) {
	
	
	Robot a=new Robot();
	Robot b=new Robot();

	a.setSpeed(10);
	
	a.changeRobot("https://vignette.wikia.nocookie.net/among-us-wiki/images/a/ab/Cyan.png/revision/latest/scale-to-width-down/310?cb=20200516162803");
	b.moveTo(300, 100);
	b.changeRobot("https://vignette.wikia.nocookie.net/among-us-wiki/images/a/ab/Cyan.png/revision/latest/scale-to-width-down/310?cb=20200516162803");
	
	for (int i = 0; i < 50; i++) {
		
	int Move = JOptionPane.showOptionDialog(null, "Move", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Up", "Down", "Left", "Right", "Stop" }, null);

	if (Move==0) {
		a.setAngle(0);
		a.move(100);
		b.setAngle(180);
		b.move(9);
		b.setAngle(0);
	}
	if (Move==1) {
		a.setAngle(180);
		a.move(100);
		a.setAngle(0);
		b.setAngle(90);
		b.move(9);
		b.setAngle(0);
	}
	if (Move==2) {
		a.setAngle(-90);
		a.move(100);
		a.setAngle(0);
		b.setAngle(90);
		b.move(9);
		b.setAngle(0);
	}
	if (Move==3) {
		a.setAngle(90);
		a.move(100);
		a.setAngle(0);
		b.move(9);
		b.setAngle(0);
	} 
	if (Move==4) {
		System.exit(0);
	
	}
	}
}
}
