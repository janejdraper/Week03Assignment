package Week02;

import java.util.Scanner;

public class SillyAbby {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Welcome, " + name + ". You're silly.");
		
		int selection = 0;
		
		while (selection != 4) {
		System.out.println("Select an option.");
		System.out.println("1) " + name + " is a doofus");
		System.out.println("2) " + name + " is a dingledorf");
		System.out.println("3) " + name + " is the best in the west");
		System.out.println("4) " + name + " is done with this stupid game");
		
		selection = sc.nextInt();
				
		switch (selection) {
			case 1:
				System.out.println("Yes, " + name + " is a doofus");
				break;
			case 2:
				System.out.println("Yes, " + name + " is a dingledorf");
				break;
			case 3:
				System.out.println("Yes, " + name + " is the best in the west");
			case 4:
				break;
			default:
				break;
		}  
		}   System.out.println("Good bye");
	}

}
