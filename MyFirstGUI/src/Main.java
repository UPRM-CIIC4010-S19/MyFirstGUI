import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

		public static void main(String[] args) throws InterruptedException {
			
			JFrame mainFrame = new JFrame("My First GUI");
			mainFrame.setSize(600, 800);
			RaceStage myRace = new RaceStage(10);
			mainFrame.add(myRace);
			mainFrame.setVisible(true);
			
			while(!myRace.someCarReachedRightEdge()) {
				
				mainFrame.repaint();
				Thread.sleep(50);
				
			}
			
			JOptionPane.showMessageDialog(mainFrame, "Race Finished!!");
			
		}
	
}
