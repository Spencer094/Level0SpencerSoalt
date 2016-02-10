import java.io.IOException;

import javax.swing.JOptionPane;

public class StephenHawking {
public static void main(String[] args) {
	

    // 1. make a main method and put steps 2, 3 & 4 inside it
    // 2. ask the user for a sentence
	String a = JOptionPane.showInputDialog("Give me a sentance.");
    // 3. call the speak method below and send it the sentence
	speak(a);
    // 4. repeat steps 2 and 3 a lot of times
}
/* Don’t change this…. */
static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
    }

}

// Copyright Wintriss Technical Schools 2014






