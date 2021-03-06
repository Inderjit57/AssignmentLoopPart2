
/*
 * Q1) Write a program which takes username and password from user via console
 * and compares it with a user name and password saved in your class. Saved user
 * id and password are as below 
 * UserId pivotAdmin 
 * password Admin123 
 * If the username and password entered by user matches with the one saved in your
 * class, then print ?You are logged in to the application? other wise print
 * ?Incorrect User id or password.Try again?. Also a user gets 3 chances enter
 * the correct user name and password. If the user enters incorrect user name or
 * password more than 3 times then print ? Account locked?
 */
import java.util.Scanner;

public class UsingForLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int attempts = 1; // Counter for outside the ForLoop

		// Number of attempts. Here Counter is also number of attempts
		for (int counter = 1; counter <= 3; counter++)
		// program should go in the FOR loop and then ask for userID and Password

		{
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

				// Comparing .equals method with boolean, if UserID and Password are incorrect
			} else {
				if (!userID.equals("pivotAdmin") && !password.equals("Admin123")) { // Incorrect both
					System.out.println("Incorrect User id or password.Try again");
				}
				else if (!userID.equals("pivotAdmin") && password.equals("Admin123")) { //Incorrect UserID and Correct Password
					System.out.println("Incorrect UserID. Tryagain");
					
					}else if (userID.equals("pivotAdmin") && !password.equals("Admin123")) { //Correct UserID and Incorrect Password
						System.out.println("Incorrect Password. Tryagain");
					}
				
				attempts++;
				if (attempts == 4) {
					System.out.println("Account locked");
				}
			}
			

		}

	}

}
