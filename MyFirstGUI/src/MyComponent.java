import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class MyComponent extends JComponent {
	
	private static int counter = 0;

	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle body = new Rectangle(10,20, 60, 10);
		
		g2.draw(body);
		
		counter++;
		System.out.println("paintComponent called " + counter + " times");
		
	}
	
}
