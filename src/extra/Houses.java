package extra;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
static Robot cat = new Robot();
public static void main(String[] args) {
	cat.moveTo(50, 500);
	cat.penDown();
	cat.setSpeed(100);
for (int i = 0; i < 5; i++) {
	drawHouse();
	drawHome();
}

//.length
	
	
	

}
static void drawHouse(){
	cat.setPenColor(Color.black);
	cat.move(100);
	cat.turn(90);
	cat.move(50);
	cat.turn(90);
	cat.move(100);
	cat.turn(-90);
	cat.setPenColor(Color.GREEN);
	cat.move(20);
	cat.turn(-90);
}
static void drawHome(){
	cat.setPenColor(Color.black);
	cat.move(300);
	cat.turn(50);
	cat.move(30);
	cat.turn(90);
	cat.move(30);
	cat.turn(40);
	cat.move(300);
	cat.turn(-90);
	cat.setPenColor(Color.GREEN);
	cat.move(20);
	cat.turn(-90);
}
}
