import javax.swing.JFrame;

public class Main {

		public static void main(String[] args) throws InterruptedException {
			
			JFrame mainFrame = new JFrame("My First GUI");
			mainFrame.setSize(800, 600);
			MyComponent myComponent = new MyComponent();
			mainFrame.add(myComponent);
			mainFrame.setVisible(true);
			
			while(true) {
				
				mainFrame.repaint();
				Thread.sleep(100);
				
			}
			
		}
	
}
