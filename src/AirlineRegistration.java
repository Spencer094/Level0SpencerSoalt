// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Airline registration 
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter
 * and print their boarding pass. You need to collect the following information: 
 * 		First name 
 * 		Last name
 * 		Destination airport 
 * 		Birthday (for security purposes) 
 * 		Male/female (for security purposes) 
 * 
 * Print the boarding pass in this format:
 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
 * Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class AirlineRegistration {public static void main(String[] args) {
String name=JOptionPane.showInputDialog("What is your first name?");
String lname=JOptionPane.showInputDialog("What is your last name?");
String des=JOptionPane.showInputDialog("What is your destination?");
String bday=JOptionPane.showInputDialog("What is your birth day?");
String gen=JOptionPane.showInputDialog("What is your gender?");
System.out.println("First Name " + name);
System.out.println(Last Name "Last Name" + lname);
		System.out.println(" Destination " + des);
				System.out.println(" Birth Day " + bday);
						System.out.println(" Gender " + gen);
}
}



