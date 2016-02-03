import javax.swing.JOptionPane;

public class r {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int number= 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String a = JOptionPane.showInputDialog("The eight of us go forth not back to protect our king from a foes attack.");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (a.equals("Chess Pawns")) {JOptionPane.showMessageDialog(null, "correct!");
number= number+1;	
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {JOptionPane.showMessageDialog(null, "wrong");
	
}
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, number);
	}
}

