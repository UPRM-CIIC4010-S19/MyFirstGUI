import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Truck extends Vehicle {

	public Truck(int xPos, int yPos, Color color, int direction, int speed) {
		super(xPos, yPos, color, direction, speed);
	}

	public Truck(int xPos, int yPos, Color color) {
		super(xPos, yPos, color);
	}

	public Truck(int xPos, int yPos) {
		super(xPos, yPos);
	}


	@Override
	public int getWidth() {
		return 60;
	}

	@Override
	public int getHeight() {
		return 30;
	}

	@Override
	public void draw(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle body = new Rectangle(getxPos()+40,getyPos()+10, 20, 10);
		Ellipse2D.Double rearTire = new Ellipse2D.Double(getxPos()+10,getyPos()+20,10,10);
		Ellipse2D.Double frontTire = new Ellipse2D.Double(getxPos()+40,getyPos()+20,10,10);
		Rectangle cargo = new Rectangle(getxPos(),getyPos(), 40, 20);
		Line2D.Double frontWindow = new Line2D.Double(getxPos()+40, getyPos(), getxPos()+50, getyPos()+10);
		
		g2.setColor(Color.BLACK);// TO DO Remove
		g2.setColor(this.getColor());
		g2.setColor(Color.BLACK);
		g2.fill(body);
		g2.setColor(Color.BLACK);
		g2.fill(rearTire);
		g2.fill(frontTire);
		g2.draw(frontWindow);
		g2.draw(cargo);
	}

}
