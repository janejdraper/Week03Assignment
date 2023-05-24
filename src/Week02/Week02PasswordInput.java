package Week02;

import java.util.*;

public class Week02PasswordInput {

	public static void main(String[] args) {
		boolean loggedIn = false;
		int loginattempt = 0;
		Scanner sc = new Scanner(System.in);
		while (!loggedIn && loginattempt < 5) {
			System.out.print("Enter username: ");
			String username = sc.nextLine();
			System.out.print("Enter password: ");
			String password = sc.nextLine();
			if (username.equals("samy123") && password.equals("elsaqueen23")) {
				System.out.println("Welcome back " + username);
				loggedIn = true;
			} else {
			System.out.println("Unrecognized username and/or password");
			loginattempt += 1;
			System.out.println("Number of incorrect attempts = " + loginattempt);
			} //end of the else
		}
			if (loginattempt == 5) {
				System.out.println("Too many failed login attempts. End program.");
			} else {
				System.out.println("What would you like to do today?");
			
			
			} //end of the else
	} // end of main()

} // end of UserInputDemo class
