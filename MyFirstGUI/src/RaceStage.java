import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JComponent;

public class RaceStage extends JComponent {

	private static int counter = 0;

	private Vehicle[] theCars;
	private int numCars;
	
	private Random genDistance = new Random();

	private static final int LANE_HEIGHT = 40;

	public RaceStage(int numCars) {

		theCars = new Vehicle[numCars];
		int lane = 0;
		for (int i=0; i<numCars; i++) {
			if (i % 3 == 0) {
				theCars[i] = new PoliceCar(0, lane, Color.BLACK);
			}
			else if (i % 3 == 1) {
				theCars[i] = new Car(0, lane, Color.cyan);
			}
			else {
				theCars[i] = new Truck(0, lane, Color.cyan);
			}
			lane += theCars[i].getHeight() + 10;
		}
		this.numCars = numCars;
	}

	private boolean reachedRightEdge(Vehicle c) {
		return c.getxPos()+c.getWidth() >= this.getWidth();
	}

	private boolean reachedLeftEdge(Vehicle c) {
		return c.getxPos() <= 0;
	}

	private boolean reachedEdge(Vehicle c) {
		return reachedLeftEdge(c) || reachedRightEdge(c);
	}

	public void paintComponent(Graphics g) {

		//topLeftCar = new Car(0,0,Color.RED);
		for (int i=0; i<theCars.length; i++) {
			int deltax = genDistance.nextInt(theCars[i].getSpeed()) * theCars[i].getDirection();
			theCars[i].move(deltax, 0);
			if (reachedEdge(theCars[i])) {
				theCars[i].setDirection(-theCars[i].getDirection());
			}
			theCars[i].draw(g);
		}

		counter++;
		System.out.println("paintComponent called " + counter + " times");

	}
	
	public boolean someCarReachedRightEdge() {
		for (int i=0; i<numCars; i++) {
			if (this.reachedRightEdge(theCars[i])) {
				return true;
			}
		}
		return false;
	}



}
