
import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot cat = new Robot();

	public static void main(String[] args) {
		cat.moveTo(50, 500);
		cat.penDown();
		cat.setSpeed(100);
		for (int i = 0; i < 10; i++) {
			drawHouse("large");
			drawHouse("small");
			drawHouse("medium");
		}

	}

	static void drawHouse(String size) {
		int height = 0;
		if (size.equals("small")) {
			height = 60;
		}
		if (size.equals("medium")) {
			height = 120;
		}
		if (size.equals("large")) {
			height = 250;
		}

		cat.setPenColor(Color.black);
		cat.move(height);
		if (size.equals("large")) {
			drawFlatRoof();
		}else {
			drawPointRoof();
		}
		cat.move(height);
		cat.turn(-90);
		cat.setPenColor(Color.GREEN);
		cat.move(20);
		cat.turn(-90);

	}
	public static void drawFlatRoof() {
		cat.turn(90);
		cat.move(50);
		cat.turn(90);
	}
	public static void drawPointRoof(){
		cat.turn(45);
		cat.move(50);
		cat.turn(90);
		cat.move(50);
		cat.turn(45);
	}
}