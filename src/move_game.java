import java.awt.Image;
import java.security.PublicKey;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.jointheleague.graphical.robot.Robot;

public class move_game {
public static void main(String[] args) {
	
	
	Robot a=new Robot();
	Robot b=new Robot();

	a.changeRobot("https://vignette.wikia.nocookie.net/among-us-wiki/images/a/ab/Cyan.png/revision/latest/scale-to-width-down/310?cb=20200516162803");
	b.moveTo(300, 100);
	b.changeRobot("https://vignette.wikia.nocookie.net/among-us-wiki/images/a/ab/Cyan.png/revision/latest/scale-to-width-down/310?cb=20200516162803");
	
	for (int i = 0; i < 50; i++) {
		
	int Move = JOptionPane.showOptionDialog(null, "Move", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Up", "Down", "Left", "Right" }, null);

	if (Move==0) {
		a.move(100);
	}
	if (Move==1) {
		a.turn(180);
		a.move(100);
		a.turn(180);
	}
	if (Move==2) {
		a.turn(-90);
		a.move(100);
		a.turn(90);
	}
	if (Move==4) {
		a.turn(90);
		a.move(100);
		a.turn(-90);
	}
	}
}
}
