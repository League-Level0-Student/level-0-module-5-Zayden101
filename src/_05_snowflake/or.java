package _05_snowflake;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class or {
	static Robot a = new Robot();

public static void main(String[] args) {
	
	

	a.setSpeed(999999999);
	a.sparkle();
	a.penDown();
	a.miniaturize();
	
	
String q=JOptionPane.showInputDialog(null, "WHAT SHAPE DO YOU WANT TO DRAW!!!!!!!!!      square, triangle, doubletriangle, circle");
	
	if (q.equals("square")) {
		square();
	}  
	if (q.equals("triangle")) {
		triangle();
	}
	if (q.equals("doubletriangle")) {
		doubletriangle();
	}
	if (q.equals("circle")) {
		circle();
	}



}


static void square() {
for (int i = 0; i < 4; i++) {

	a.move(50);
a.turn(90);	
}


}
static void triangle() {
for (int i = 0; i < 3; i++) {

	a.move(50);
a.turn(120);	
}

}
static void doubletriangle() {

	a.move(50);
a.turn(120);	
a.move(50);
a.turn(120);
a.move(50);
a.turn(120);
a.move(50);
a.turn(90);
a.move(50);
a.turn(90);
a.move(50);
a.turn(120);	
a.move(50);
a.turn(120);
a.move(50);
a.turn(120);
a.move(50);
a.turn(90);	
a.move(50);
a.turn(90);	

}
static void circle() {
for (int i = 0; i < 120; i++) {
	a.move(1);
	a.turn(3);
}
	
}
}
