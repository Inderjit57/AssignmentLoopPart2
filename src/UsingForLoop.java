import java.util.Scanner;

public class UsingForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int atempts = 0;

		// Number of attempts
		for (int counter = 0; counter <= 3; counter++)
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

				// Comparing UserID and password with boolean, if they are incorrect
			} else if (userID.equals("pivotAdmin") == false && password.equals("Admin123") == false) {
				System.out.println("Incorrect User id or password.Try again");
				atempts++;
				if (atempts == 4) {
					System.out.println("Account locked");
				}
			}

		}

	}

}
