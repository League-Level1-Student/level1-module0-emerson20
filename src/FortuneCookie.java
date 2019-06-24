import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener{
	//1. Make a FortuneCookie class, with a showButton() method like the one below:

		        public void showButton() {
		            System.out.println("Button clicked");
		       
		    

	

		   

		//3. Now change the showButton() method in Step 1, to make a JFrame and get it to show up when you run the program. Hint:
JFrame frame = new JFrame();
		   frame.setVisible(true);

	//	4. Make a JButton and add it to the JFrame.

		    JButton button = new JButton();
		    frame.add(button);
		    frame.pack();

	//	5. The next 4 steps make a pop-up appear that says, “Woohoo” when the button is clicked

		  //   a. Add an action listener to the button:

		button.addActionListener(this);

		  //   b. Have your class implement ActionListener [use Eclipse quick fix]


		  //   c. Add the unimplemented methods [use Eclipse quick fix]


		  //   d. Put a JOptionPane pop-up inside the actionPerformed() method that says "Woohoo".

//call actionPerformed(ActionEvent e);

	//	6. Generate a random number between 0 and 4:


//		  int rand = new Random().nextInt(5);

		//7. Depending on which random number, show one of the five fortunes.



	//	[optional] 8. Run other student's programs to receive fortunes from them.
}

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JOptionPane.showMessageDialog(null, "Woohoo!!!!!!!");
				} 
}

class FortuneCookieRunner {
    public static void main(String[] args) {
        new FortuneCookie().showButton();
  }
}
