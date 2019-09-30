import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JackInTheBox implements ActionListener{
	public static void main(String[] args) {
	new JackInTheBox().creatUI();

	}
	//1. Create a user interface (GUI) that has a single button labeled "Surprise".
   // If you need help, take a look at the instructions for the Fortune Cookie recipe.
void creatUI() {
		JFrame frame = new JFrame();
frame.setVisible(true);

JButton button = new JButton();
frame.add(button);
frame.pack();

button.addActionListener(this);

}

//2. When the user presses the button 5 times, show them a jack-in-the-box using the methods below.
//(A sample jackInTheBox.png file is provided in the default package)
private void showPicture(String fileName) {
   try {
       JLabel imageLabel = createLabelImage(fileName);
       JFrame frame = new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.add(imageLabel);
       frame.pack();
       frame.setVisible(true);
   } catch (Exception e) {
       e.printStackTrace();
   }
}
private JLabel createLabelImage(String fileName) {
	try {
            java.net.URL imageURL = getClass().getResource(fileName);
            if (imageURL == null) {
	       System.err.println("Could not find image " + fileName);
	       return new JLabel();
            } else {
                Icon icon = new ImageIcon(imageURL);
                JLabel imageLabel = new JLabel(icon);
                return imageLabel;
            }
        } catch (Exception e) {
            System.err.println("Could not find image " + fileName);
            return new JLabel();
        }
}

//3. Also play a sound when the jack-in-the-box pops up using this method.
//(A sample sound homer-woohoo.wav is provided in the default package)

private void playSound(String soundFile) { 
   try {
       AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
       sound.play();
   } catch (Exception e) {
       e.printStackTrace();
   }
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	showPicture("extra/HP_Meme.jpg");;
}
}
                                                                                                                                                                                                   //https://www.google.com/search?biw=1032&bih=900&tbm=isch&sa=1&ei=jlhsXZPIG4aQtQXdkojQBQ&q=harry+potte+meme&oq=harry+potte+meme&gs_l=img.3..0i10l10.1222311.1224444..1224941...0.0..1.109.1373.15j2......0....1..gws-wiz-img.......0i7i30.o_IJmpBM9Oo&ved=0ahUKEwiTx47S57DkAhUGSK0KHV0JAloQ4dUDCAY&uact=5#imgrc=HBhld1LwM5IZDM: