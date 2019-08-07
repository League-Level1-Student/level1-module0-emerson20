import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffect implements ActionListener{
	public static void main(String[] args) {
	new SoundEffect().area(); 
	new SoundEffect().actionPerformed(null);
	new SoundEffect().playSound(null);
	//1. Create a GUI for a sound effects machine that will play different sounds when the buttons are pressed.
    //If you need help, take a look at the instructions for the Fortune Cookie recipe.

		//NOTE: because this GUI has more than one button, you must add a JPanel to your JFrame and put the buttons on the panel! 
	
  

//2. Gather sound bites. They must be .wav files. Free sound effects can be found here. The League also has an account at freesound. Ask your teacher for our login.

//The .wav files must be placed into your Java project (drag and drop).

//3. Call this playSound() method when they click on a button. You will need to import java.applet.AudioClip 

	}
private void playSound(String fileName) {
   AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
   sound.play();
    

}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}private void area(){
	JFrame frame = new JFrame();
	   frame.setVisible(true);
	   
	   JPanel pat = new JPanel();
	   pat.setVisible(true);

	     frame.add(pat);
	     
	   JButton button = new JButton("water");
	   button.addActionListener(this);
	   JButton boa = new JButton("bird");
	   JButton boat = new JButton("caaat");
	   JButton put = new JButton("dogs");
	   JButton bet = new JButton("pages");
	   
	    pat.add(button);
	    pat.add(boa);
	    pat.add(boat);
	    pat.add(put);
	    pat.add(bet);
	    frame.pack();
}
}                                                                                                                                                                                                          