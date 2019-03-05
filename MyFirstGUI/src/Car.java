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
	private int speed; // Speed in pixels per tick
	private int direction; // 1 => left to right, -1 => right to left
	
	private static final int DEFAULT_SPEED = 10;
	
	public Car(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.color = Color.BLUE;
		this.direction = 1;
		this.speed = DEFAULT_SPEED;
	}
	
	public Car(int xPos, int yPos, Color color) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.color = color;
		this.direction = 1;
		this.speed = DEFAULT_SPEED;
	}
	
	public Car(int xPos, int yPos, Color color, int direction, int speed) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.color = color;
		this.direction = direction;
		this.speed = speed;
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
	
	public int getSpeed() {
		return speed;
	}

	public int getDirection() {
		return direction;
	}

	public int getWidth() {
		return 60;
	}

	public int getHeight() {
		return 30;
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
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}
	
	public void move(int deltax, int deltay) {
		this.setxPos(this.getxPos()+deltax);
		this.setyPos(this.getyPos()+deltay);
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
