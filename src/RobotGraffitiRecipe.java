import org.jointheleague.graphical.robot.Robot;

public class RobotGraffitiRecipe {
	public static void main(String[] args) {
		Robot a = new Robot();
		a.hide();
		a.penDown();
		a.setSpeed(10);
		a.move(120);
		a.turn(30);
		
		for (int i = 0; i < 8; i++) {
			
			a.move(20);
			a.turn(30);

		}
		a.move(50);
		a.turn(230);
		a.move(90);
		a.penUp();
		a.turn(-50);
		a.move(45);
		a.penDown();
		a.turn(-90);
		a.move(120);
		
	}
}
