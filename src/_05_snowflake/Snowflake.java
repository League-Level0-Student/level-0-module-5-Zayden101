package _05_snowflake;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;


public class Snowflake {
	
	public static void main(String[] args) {

Robot a = new Robot();
a.miniaturize();
a.moveTo(300, 300);

a.penDown();

a.setSpeed(9999999);

for (int i = 0; i < 6; i++) {
			
a.setPenColor(0, 0, 0);
			
a.move(50);
			
			a.turn(60);
			
			
			if(i%2 == 0) {
			 a.setRandomPenColor();
			}
			else {
				a.setRandomPenColor();
			}

			for (int j = 0; j <6; j++) {
				
		a.turn(-60);
					a.move(50);
			}
			a.setPenColor(0, 0, 0);
}

	}

}
