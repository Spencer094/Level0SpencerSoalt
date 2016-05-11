import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
for (int i = 0; i < 10; i++) {
	

		int randomNumber = new Random().nextInt(5);
		System.out.println(randomNumber);
		if (randomNumber == 1) {
			JOptionPane.showMessageDialog(null, "Your awsome");
		} else if (randomNumber == 2) {
			JOptionPane.showConfirmDialog(null, "Your nice");
		} else if (randomNumber == 3) {
			JOptionPane.showConfirmDialog(null, "Your cool");
		} else if (randomNumber == 4) {
			JOptionPane.showConfirmDialog(null, "Your funny");
		} else if (randomNumber == 5) {
			JOptionPane.showConfirmDialog(null, "Your a good friend");
		}
		// 4. Repeat all the code above 10 times

		// 5. Find someone to test out your program. They will like it :)
	}
}
}
