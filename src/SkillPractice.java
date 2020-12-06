import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {

SkillPractice skills = new SkillPractice();
           skills.skill1();
           skills.skill2();
           skills.skill3();
           skills.skill4();
           skills.skill5();
}

void skill1() {
// Use pop-ups for the following.
// Ask the user how many dimes they have
String o=JOptionPane.showInputDialog("how many dimes do you have.");



// Tell them how many cents they have (hint multiply by 10)

int chickenNugget=Integer.parseInt(o);
int oo=chickenNugget*10;
JOptionPane.showMessageDialog(null, oo);

// Ask the user how tall they are (inches)
String u=JOptionPane.showInputDialog("How tall are you.");



// If they are shorter than 36 inches, tell them to eat their Wheaties

int tall=Integer.parseInt(u);

if (tall<37){
	JOptionPane.showMessageDialog(null, "e");
}

else {
	JOptionPane.showMessageDialog(null, "o");
}
}

void skill2() { // Write a loop to print every third number between 1 and 30 to the console


for (int i = 1; i < 31; i++) {
	if (i%3==0) {
	System.out.println(i);
}
}



}

void skill3() { // Get a random number that is less than 20 and print it to the console

	 Random rand = new Random();
int e=rand.nextInt(20);
System.out.println( );
System.out.println(e);
// Get another random number that is less than 10 and print it to the console
int ee=rand.nextInt(10);
System.out.println(ee);

// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction

JOptionPane.showMessageDialog(null, e-ee);

}

void skill4() { // In a pop-up, ask the user for the city they live in

	String e=JOptionPane.showInputDialog("what city do u live in");

// If they answered "San Diego", tell them they live in America's Finest City

 if (e.equals("San diego")){
	JOptionPane.showMessageDialog(null, "wallrus");
}


// Otherwise, tell them to move to San Diego

 else {
		JOptionPane.showMessageDialog(null, "toilet");
	}

// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation."
int bread=6;
//String lp=JOptionPane.showInputDialog("how many airplanes do you eat a day");

if (bread ==0) {
	JOptionPane.showMessageDialog(null, "poo");
}

// If there is 1 car, use a pop-up to display the make/model of the car

if (bread ==1) {
	JOptionPane.showMessageDialog(null, "EAT MORE AIRPLANES");
}

// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them.
if (bread > 1) {
	JOptionPane.showMessageDialog(null, "good");
}
}

void skill5() { // In a pop-up, ask the user for the name of their school

	String ooi=JOptionPane.showInputDialog("what school do u go to");

// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message.

JOptionPane.showMessageDialog(null, ooi + " Mc Donald dipers");


}
}

