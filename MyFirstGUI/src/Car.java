import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Car {
	
	private int xPos;
	private int yPos;
	private Color color;
	
	public Car(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.color = Color.BLUE;
	}
	
	public Car(int xPos, int yPos, Color color) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.color = color;
	}
	
	public int getxPos() {
		return xPos;
	}

	public int getyPos() {
		return yPos;
	}
	
	public Color getColor() {
		return color;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void draw(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle body = new Rectangle(xPos,yPos+10, 60, 10);
		Ellipse2D.Double rearTire = new Ellipse2D.Double(xPos+10,yPos+20,10,10);
		Ellipse2D.Double frontTire = new Ellipse2D.Double(xPos+40,yPos+20,10,10);
		Line2D.Double rearWindow = new Line2D.Double(xPos+10, yPos+10, xPos+20, yPos);
		Line2D.Double frontWindow = new Line2D.Double(xPos+40, yPos, xPos+50, yPos+10);
		Line2D.Double roof = new Line2D.Double(xPos+20, yPos, xPos+40, yPos);
		
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
