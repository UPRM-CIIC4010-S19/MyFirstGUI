import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public abstract class Vehicle {
	
	private int xPos;
	private int yPos;
	private Color color;
	private int speed; // Speed in pixels per tick
	private int direction; // 1 => left to right, -1 => right to left
	
	private static final int DEFAULT_SPEED = 10;
	
	public Vehicle(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.color = Color.BLUE;
		this.direction = 1;
		this.speed = DEFAULT_SPEED;
	}
	
	public Vehicle(int xPos, int yPos, Color color) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.color = color;
		this.direction = 1;
		this.speed = DEFAULT_SPEED;
	}
	
	public Vehicle(int xPos, int yPos, Color color, int direction, int speed) {
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

	public abstract int getWidth();

	public abstract int getHeight();

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

	public abstract void draw(Graphics g);
		

	

}
