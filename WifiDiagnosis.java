/*
 * Class: CMSC203 CRN 30376
 *  Program: Assignment 1
 * Instructor: Prof. Grinberg
 * Description: Creating a machine to give solutions to the user who needs help fixing their Wifi. 
 * Due: 2/13/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Arman Babazadeh
*/

import java.util.Scanner;

class WifiDiagnosis {
	public static void main(String[] args) {

		final String agree = "Yes"; // I created constant varibles like you asked.
		final String disagree = "No";

		System.out.println("If you have a problem with internet connectivity, this Wifi Diagnosis might work. ");

		System.out.println();

		Scanner input = new Scanner(System.in); // This is the scanner I used throughout the projects input.

		System.out.println("Reboot the computer and try to connect ");
		System.out.println("Did that fix the problem? (Yes or No)");
		String answer = input.nextLine();

		if (!answer.equalsIgnoreCase(agree) && !answer.equalsIgnoreCase(disagree)) {
			System.out.println();
			System.out.print("Invalid answer, try again \n");
			System.out.println("Programmer name: Arman Babazadeh ");
			input.close(); // I close the scanner due to resource leaks.
			return;
		} else if (answer.equalsIgnoreCase(agree)) {
			System.out.println();
			System.out.print("Done \n");
			System.out.print("Programmer: Arman Babazadeh ");
			input.close();
			return;
		}

		System.out.println(); // Creating a space between the sections of my code when it prints to console.

		///////////////////////////////////////////////////////////////

		System.out.println("Reboot the router and try to connect ");
		System.out.println("Did that fix the problem? (Yes or No)");
		answer = input.nextLine();

		if (!answer.equalsIgnoreCase(agree) && !answer.equalsIgnoreCase(disagree)) {
			System.out.println();
			System.out.print("Invalid answer, try again \n");
			System.out.print("Programmer name: Arman Babazadeh ");
			input.close();
			return;
		} else if (answer.equalsIgnoreCase(agree)) {
			System.out.println();
			System.out.print("Done \n");
			System.out.print("Programmer: Arman Babazadeh ");
			input.close();
			return;
		}

		System.out.println();

		//////////////////////////////////////////////////////////////

		System.out.println(
				"Make sure the cables connecting to the router are firmly plugged in and power is getting to the router ");
		System.out.println("Did that fix the problem? (Yes or No)");
		answer = input.nextLine();

		if (!answer.equalsIgnoreCase(agree) && !answer.equalsIgnoreCase(disagree)) {
			System.out.println();
			System.out.print("Invalid answer, try again \n");
			System.out.print("Programmer name: Arman Babazadeh ");
			input.close();
			return;
		} else if (answer.equalsIgnoreCase(agree)) {
			System.out.println();
			System.out.print("Done \n");
			System.out.print("Programmer: Arman Babazadeh ");
			input.close();
			return;
		}

		System.out.println();

		////////////////////////////////////////////////////////////

		System.out.println("Move the computer closer to the router and try to connect ");
		System.out.println("Did that fix the problem? (Yes or No)");
		answer = input.nextLine();

		if (!answer.equalsIgnoreCase(agree) && !answer.equalsIgnoreCase(disagree)) {
			System.out.println();
			System.out.print("Invalid answer, try again \n");
			System.out.print("Programmer: Arman Babazadeh ");
			input.close();
			return;
		} else if (answer.equalsIgnoreCase(agree)) {
			System.out.println();
			System.out.print("Done \n");
			System.out.print("Programmer name: Arman Babazadeh ");
			input.close();
			return;
		} else {
			System.out.println();
			System.out.println("Contact your ISP ");
			System.out.print("Programmer name: Arman Babazadeh ");
		}

		input.close();
	}

}