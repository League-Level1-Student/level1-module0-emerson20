import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV {
	public static void main(String[] args) {
		JButton leftButton = new JButton();
		JButton midButton = new JButton();
		JButton rightButton = new JButton();
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		frame.add(panel);
		
frame.setVisible(true);
		
leftButton.setText("Mystery Show #1!");
midButton.setText("Mystery Show #2!");
rightButton.setText("Mystery Show #3!");
		
panel.add(leftButton);
panel.add(midButton);
panel.add(rightButton);
		
frame.pack();
		
frame.setTitle("Cuteness TV");
	
if ("leftButton") {
	showFrog();
}
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	      //    URI uri = new URI(videoID);
	      //    java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

}