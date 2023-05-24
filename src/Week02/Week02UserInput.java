package Week02;

import java.util.Scanner;

public class Week02UserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		//without the ln, the sysout command doesn't move to a new line
		String name = sc.nextLine();
		
		System.out.println("Welcome, " + name);
		
		int selection = 0;
		double total = 0;
		
		while (selection != 4) {
		System.out.println("Select an option.");
		System.out.println("1) Add candybar to shopping cart: $1.99");
		System.out.println("2) Add cheese to shopping cart: $6.95");
		System.out.println("3) Add soccer ball to shopping cart: $12.99");
		System.out.println("4) check out");
		
		selection = sc.nextInt();
		
		
		switch (selection) {
			case 1:
				total = total + 1.99;
				break;
			case 2:
				total = total + 6.95;
				break;
			case 3:
				total += 12.99;
				break;
			case 4:
				break;
			default:
				System.out.println("Please pick a valid option");
			
		}
		System.out.println("Your current toal is: $" + total);
		}
	}

}
