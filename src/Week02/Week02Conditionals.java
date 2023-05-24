package Week02;

public class Week02Conditionals {

	public static void main(String[] args) {
		String name = "Abigail";
		
		if (name == "Sam") {
			System.out.println("Hello Sam!");
		} else {
			System.out.println("You are " + name + ", not Sam.");
		}

		int age = 14;
		if (age >= 16) {
			System.out.println("You can get your license!");
		} else if (age < 15) { //First nested if needs to not register the other values
			System.out.println("Please wait " + (16 - age) + " years to get your license");
		} else {
			System.out.println("Please wait 1 year to get your license");
		}
		
		if (age >= 16) { //Revisit of original design with fixes
			System.out.println("You can get your license!");
		} else if (age == 15) { //DON'T USE SINGLE = here. That's assigning variables
			System.out.println("Please wait 1 year to get your license");
		} else {
			System.out.println("Please wait " + (16 - age) + " years to get your license");
		}
		
		double costOfMilk = 2.5;
		
		if (costOfMilk <= 2) {
			System.out.println("Buying 2 gallons");
		} else if (costOfMilk <=3) {
			System.out.println("Buying 1 gallon");
		} else {
			System.out.println("Not buying any milk");
		}
		

		
		if (costOfMilk > 3) {
			System.out.println("Not buying any milk");
		} else if (costOfMilk > 2) {
			System.out.println("Buying 1 gallon of milk");
		} else {
			System.out.println("Buying 2 gallons of milk");
		}
		char grade = 'A';
		
		switch (grade) {
			case 'A':
				System.out.println("90%");
				break;
			case 'B':
				System.out.println("80%");
				break;
			case 'C':
				System.out.println("70%");
				break;
			default:
				System.out.println("0%");
		
		}
	}

}
