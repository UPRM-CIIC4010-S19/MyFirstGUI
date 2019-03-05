import javax.swing.JFrame;

public class Main {

		public static void main(String[] args) throws InterruptedException {
			
			JFrame mainFrame = new JFrame("My First GUI");
			mainFrame.setSize(600, 800);
			MyComponent myComponent = new MyComponent(10);
			mainFrame.add(myComponent);
			mainFrame.setVisible(true);
			
			while(true) {
				
				mainFrame.repaint();
				Thread.sleep(50);
				
			}
			
		}
	
}
