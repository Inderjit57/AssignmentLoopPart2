import java.util.Scanner;

public class UsernamePassword {

	public static void main(String[] args) {
		/*
		 * Q1) Write a program which takes username and password from user via console
		 * and compares it with a user name and password saved in your class. Saved user
		 * id and password are as below 
		 * UserId pivotAdmin 
		 * password Admin123 
		 * If the username and password entered by user matches with the one saved in your
		 * class, then print “You are logged in to the application“ other wise print
		 * “Incorrect User id or password.Try again”. Also a user gets 3 chances enter
		 * the correct user name and password. If the user enters incorrect user name or
		 * password more than 3 times then print “ Account locked”
		 */

		Scanner sc = new Scanner(System.in);

		int counter = 0; // Number of attempts

		// program should go in the while loop and then ask for userID and Password
		while (counter <= 2) {
			counter++; // Counter value change when loop starts again

			System.out.println(counter + " Enter UserID");
			String userID = sc.next(); // UserID variable from console
			System.out.println(counter + " Enter Password");
			String password = sc.next(); // Password variable from console

			// Using Strg.equals(Strng1) method to compare strings (If userID and Password
			// are correct)
			if (userID.equals("pivotAdmin") && password.equals("Admin123")) {
				System.out.println("You are logged in to the application");
				if (userID.equals("pivotAdmin") && password.equals("Admin123")) {
					break;
				}
			} else {
				System.out.println("Incorrect User id or password.Try again");
			}
		}
		if (counter == 3) {
			System.out.println("Account locked");
		}

	}

}
