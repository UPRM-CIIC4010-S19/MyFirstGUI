import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class PoliceCar extends Car {

	public PoliceCar(int xPos, int yPos, Color color, int direction, int speed) {
		super(xPos, yPos, color, direction, speed);
	}

	public PoliceCar(int xPos, int yPos, Color color) {
		super(xPos, yPos, color);
	}
	
	public void draw(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		super.draw(g);
		
		int biomboX = this.getxPos() + this.getWidth() / 2;
		int biomboY = this.getyPos() - 5;
		Ellipse2D.Double biombo = new Ellipse2D.Double(biomboX, biomboY, 5, 5);
		g2.fill(biombo);
		
	}
	
}
