import org.jointheleague.graphical.robot.Robot;

public class y {	static Robot a = new Robot();
static Robot b = new Robot();
static Robot c = new Robot();
static Robot d = new Robot();
static Robot e = new Robot();
static Robot f = new Robot();
static Robot g = new Robot();
static Robot h = new Robot();

public static void main(String[] args) {
	
	
	b.miniaturize();
	b.setSpeed(999999999);
	b.penDown();
	a.miniaturize();
	a.setSpeed(999999999);
	a.penDown();
	c.miniaturize();
	c.setSpeed(999999999);
	c.penDown();
	d.miniaturize();
	d.setSpeed(999999999);
	d.penDown();
	e.miniaturize();
	e.setSpeed(999999999);
	e.penDown();
	f.miniaturize();
	f.setSpeed(999999999);
	f.penDown();
	g.miniaturize();
	g.setSpeed(999999999);
	g.penDown();
	h.miniaturize();
	h.setSpeed(999999999);
	h.penDown();
	cicrls();
	a.move(50);
	b.move(50);
	c.move(	50);
			d.move(50);
			e.move(50);
			f.move(50);
			g.move(50);
			h.move(50);
			cicrls();
			a.move(-100);
			b.move(-100);
			c.move(	-100);
					d.move(-100);
					e.move(-100);
					f.move(-100);
					g.move(-100);
					h.move(-100);
					cicrls();
					a.move(-25);
					b.move(-25);
					c.move(	-25);
							d.move(-25);
							e.move(-25);
							f.move(-25);
							g.move(-25);
							h.move(-25);
							cicrls();

									

							
							
							
}
static void cicrls() {
	for (int i = 0; i < 50; i++) {
		
		a.move(24);b.move(24);c.move(12);d.move(12);e.move(-24);f.move(-24);g.move(-12);h.move(-12);
		a.turn(27);	b.turn(-27);c.turn(13);d.turn(-13);e.turn(-27);	f.turn(27);g.turn(-13);h.turn(13);
		a.move(99);b.move(99);c.move(100);d.move(100);e.move(-99);f.move(-99);g.move(-100);h.move(-100);
		a.turn(30);b.turn(-30);c.turn(15);d.turn(-15);e.turn(-30);f.turn(30);g.turn(-15);h.turn(15);
		a.setRandomPenColor();
		b.setRandomPenColor();
		c.setRandomPenColor();
		d.setRandomPenColor();
		e.setRandomPenColor();
		f.setRandomPenColor();
		g.setRandomPenColor();
		h.setRandomPenColor();
		}

}
}
