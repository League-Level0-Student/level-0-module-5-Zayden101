import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class housesessesesseseseeseseseeseseseseseseseeseseseesesesese {
static Robot a=new Robot();
static Random rand = new Random();
public static void main(String[] args) {

	
	a.miniaturize();
	a.setSpeed(99999);
	a.turn(270);
	a.move(500);
	a.penDown();

for (int i = 0; i < 20; i++) {
	int height = rand.nextInt(270)+30;
	drawhouse(height);

}
for (int e = 0; e < 550; e++) {
	

a.setPenColor(0, 200, 0);
a.turn(-90);
a.move(300);
a.turn(90);
a.move(2);
a.turn(90);
a.move(300);
a.turn(-90);
}
}
static void drawhouse(int hight) {
	a.turn(90);
	a.move(hight);
	
	int roof = rand.nextInt(5);	
	if(roof == 0){
		drawflatroof();
	}
	else if(roof == 2) {
		drawchimeyroof();
	}
	else if(roof == 4) {
		drawchimeyroof2();
	}
	else {
drawpointyroof();
	}
	
	
			
	a.move(hight);
	a.turn(90);
	a.move(15);
	a.turn(90);
	a.move(20);
	a.turn(90);
	a.move(10);
	a.turn(90);
	a.move(20);
	a.turn(-90);
	a.move(10);
	a.turn(180);
	a.move(28);
	a.turn(180);
	a.move(28);
	
	a.setPenColor(100, 200, 100);	
	
a.move(20);	
a.turn(180);
a.setRandomPenColor();
}

static void drawflatroof() {
	a.turn(90);
	a.move(25);
	a.turn(90);
	
	
}
static void drawpointyroof() {
	a.turn(45);
	a.move(15);
	a.turn(90);
	a.move(15);
	a.turn(45);
}
static void drawchimeyroof() {
	a.turn(90);
	a.move(10);
a.turn(-90);	
a.move(11);
a.turn(90);
a.move(5);
a.turn(90);
a.move(11);
a.turn(-90);
a.move(5);
a.turn(180);
a.move(20);
a.turn(180);
a.move(20);
a.turn(90);
}
static void drawchimeyroof2() {
	a.turn(90);
	a.move(5);
a.turn(-90);	
a.move(11);
a.turn(90);
a.move(5);
a.turn(90);
a.move(11);
a.turn(-90);
a.move(10);
a.turn(180);
a.move(20);
a.turn(180);
a.move(20);
a.turn(90);
}
}

