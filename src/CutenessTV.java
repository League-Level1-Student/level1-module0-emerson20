import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	public static void main(String[] args) {
		new CutenessTV().run();
	}

	JButton leftButton;
	JButton midButton;
	JButton rightButton;
	JFrame frame;
	JPanel panel;

	public void run() {
		leftButton = new JButton();
		midButton = new JButton();
		rightButton = new JButton();
		frame = new JFrame();
		panel = new JPanel();

		frame.add(panel);

		frame.setVisible(true);
		leftButton.addActionListener(this);
		midButton.addActionListener(this);
		rightButton.addActionListener(this);
		leftButton.setText("Mystery #1!");
		midButton.setText("Mystery #2!");
		rightButton.setText("Mystery #3!");

		panel.add(leftButton);
		panel.add(midButton);
		panel.add(rightButton);

		frame.pack();

		frame.setTitle("Cuteness TV");

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
			 URI uri = new URI(videoID);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JButton buttonClicked = (JButton) e.getSource();
		if (buttonClicked == leftButton) {
			showDucks();
		} else if (buttonClicked == midButton) {
			showFrog();
		} else {
			showFluffyUnicorns();
		}
	}

}