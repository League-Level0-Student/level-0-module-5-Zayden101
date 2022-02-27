import org.jointheleague.graphical.robot.Robot;

public class GAMEGAMEGAMEGAME {
public static void main(String[] args) {
	
	
	
	Robot a = new Robot();
	a.setSpeed(999999);
	a.penDown();
	a.miniaturize();
	a.hide();
	
	a.move(50);
	a.turn(60);
	
	Robot b = new Robot();
	b.setSpeed(999999);
	b.penDown();
	b.miniaturize();
	b.hide();
	
	b.move(50);
	b.turn(60);
	b.move(-100);
	b.move(1100);
	
	a.move(50);
	a.turn(60);
	
	Robot c = new Robot();
	c.setSpeed(999999);
	c.penDown();
	c.miniaturize();
	c.hide();

	for (int i = 0; i < 2; i++) {
	c.move(50);
	c.turn(60);
	}
	
	c.move(-100);
	c.move(1100);
	
	a.move(50);
	a.turn(60);
	
	Robot d = new Robot();
	d.setSpeed(999999);
	d.penDown();
	d.miniaturize();
	d.hide();
	
	for (int i = 0; i < 3; i++) {
	d.move(50);
	d.turn(60);
	}
	
	d.move(-100);
	d.move(1100);
	
	a.move(50);
	a.turn(60);
	
	Robot e = new Robot();
	e.setSpeed(999999);
	e.penDown();
	e.miniaturize();
	e.hide();
	
	for (int i = 0; i < 4; i++) {
	e.move(50);
	e.turn(60);
	}
	
	e.move(-100);
	e.move(1100);
	
	a.move(50);
	a.turn(60);
	
	Robot f = new Robot();
	f.setSpeed(999999);
	f.penDown();
	f.miniaturize();
	f.hide();
	
	for (int i = 0; i < 5; i++) {
	f.move(50);
	f.turn(60);
	}
	
	f.move(-100);
	f.move(1100);
	
	a.move(50);
	a.turn(60);
	
	Robot g = new Robot();
	g.setSpeed(999999);
	g.penDown();
	g.miniaturize();
	g.hide();
	
	for (int i = 0; i < 6; i++) {
	g.move(50);
	g.turn(60);
	}
	
	g.move(-100);
	g.move(1100);
	
	for (int i = 0; i < 2; i++) {
	b.move(-750);
	c.move(-750);
	d.move(-750);
	e.move(-750);
	f.move(-750);
	g.move(-750);
	
	b.turn(90);
	c.turn(90);
	d.turn(90);
	e.turn(90);
	f.turn(90);
	g.turn(90);
	
	b.move(1000);
	c.move(1000);
	d.move(1000);
	e.move(1000);
	f.move(1000);
	g.move(1000);
	}
	
	b.moveTo(490, 275);
	c.moveTo(490, 275);
	d.moveTo(490, 275);
	e.moveTo(490, 275);
	f.moveTo(490, 275);
	g.moveTo(490, 275);
	
	/*for (int i = 0; i < 4; i++) {
	b.move(-350);
	c.move(-350);
	d.move(-350);
	e.move(-350);
	f.move(-350);
	g.move(-350);
	
	b.turn(100);
	c.turn(100);
	d.turn(100);
	e.turn(100);
	f.turn(100);
	g.turn(100);
	}
	
	b.moveTo(490, 275);
	c.moveTo(490, 275);
	d.moveTo(490, 275);
	e.moveTo(490, 275);
	f.moveTo(490, 275);
	g.moveTo(490, 275);
	
	b.setAngle(0);
	c.setAngle(60);
	d.setAngle(120);
	e.setAngle(180);
	f.setAngle(240);
	g.setAngle(300); */
	
	for (int i = 0; i < 3; i++) {	
	
	for (int j = 0; i < 3; i++) {
	b.move(-100);
	c.move(-100);
	d.move(-100);
	e.move(-100);
	f.move(-100);
	g.move(-100);
	
	b.turn(120);
	c.turn(120);
	d.turn(120);
	e.turn(120);
	f.turn(120);
	g.turn(120);
	}
	
	b.turn(60);
	c.turn(60);
	d.turn(60);
	e.turn(60);
	f.turn(60);
	g.turn(60);
	
	}
	
	
	
	
	
	
}
}
