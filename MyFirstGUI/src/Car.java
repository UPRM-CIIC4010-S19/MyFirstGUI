import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Car extends Vehicle {
	
	public Car(int xPos, int yPos, Color color, int direction, int speed) {
		super(xPos, yPos, color, direction, speed);
	}

	public Car(int xPos, int yPos, Color color) {
		super(xPos, yPos, color);
	}

	public Car(int xPos, int yPos) {
		super(xPos, yPos);
	}

	@Override
	public int getHeight() {
		return 30;
	}

	@Override
	public int getWidth() {
		return 60;
	}
	
	@Override
	public void draw(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle body = new Rectangle(getxPos(),getyPos()+10, 60, 10);
		Ellipse2D.Double rearTire = new Ellipse2D.Double(getxPos()+10,getyPos()+20,10,10);
		Ellipse2D.Double frontTire = new Ellipse2D.Double(getxPos()+40,getyPos()+20,10,10);
		Line2D.Double rearWindow = new Line2D.Double(getxPos()+10, getyPos()+10, getxPos()+20, getyPos());
		Line2D.Double frontWindow = new Line2D.Double(getxPos()+40, getyPos(), getxPos()+50, getyPos()+10);
		Line2D.Double roof = new Line2D.Double(getxPos()+20, getyPos(), getxPos()+40, getyPos());
		
		g2.setColor(this.getColor());
		g2.fill(body);
		g2.draw(roof);
		g2.setColor(Color.BLACK);
		g2.fill(rearTire);
		g2.fill(frontTire);
		g2.draw(rearWindow);
		g2.draw(frontWindow);

	}

}
