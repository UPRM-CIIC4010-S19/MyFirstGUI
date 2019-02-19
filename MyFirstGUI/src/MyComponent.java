import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JComponent;

public class MyComponent extends JComponent {
	
	private static int counter = 0;
	
	private Car topLeftCar = new Car(0,0,Color.RED);
	private Car bottomRightCar = new Car(0, 0);
	
	public void paintComponent(Graphics g) {
		
		//topLeftCar = new Car(0,0,Color.RED);
		topLeftCar.draw(g);

		
		//bottomRightCar = new Car(this.getWidth()-60, this.getHeight()-30);
		bottomRightCar.setxPos(this.getWidth()-60);
		bottomRightCar.setyPos(this.getHeight()-30);
		bottomRightCar.draw(g);
		
		Random genRandom = new Random();
		int randomX = genRandom.nextInt(this.getWidth() - 60);
		int randomY = genRandom.nextInt(this.getHeight() - 30);
		Car randomCar = new Car(randomX, randomY, Color.MAGENTA);
		randomCar.draw(g);
		
		counter++;
		System.out.println("paintComponent called " + counter + " times");
		
	}
	

	
}
