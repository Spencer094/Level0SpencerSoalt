 // Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String birthday = JOptionPane.showInputDialog("Whos Birthday?");
		// 3. Print out what the user typed
	JOptionPane.showMessageDialog(null, birthday);
		// 4. if user asked for "mom"
			//print mom's birthday
	if (birthday.equals("mom")) {JOptionPane.showMessageDialog(null, momsBirthday);
		
	}
		// 5. if user asked for "dad"
			// print dad's birthday
else if (birthday.equals("dad")) {JOptionPane.showMessageDialog(null, dadsBirthday);
	
}	

		// 6. if user asked for your name
			// print myBirthday
else if (birthday.equals("spencer")) {JOptionPane.showMessageDialog(null, dadsBirthday);
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}