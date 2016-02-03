import javax.swing.JOptionPane;

public class birthday {
public static void main(String[] args) {

	String birthday = JOptionPane.showInputDialog("What is your birth day.");
	if (birthday.equals("02/03")) {JOptionPane.showMessageDialog(null, "Happy Birthday");
		
	}
	else {JOptionPane.showMessageDialog(null, "Happy unbirthday");
		
	}
}
}
