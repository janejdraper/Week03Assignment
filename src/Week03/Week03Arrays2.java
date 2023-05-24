package Week03;

public class Week03Arrays2 {

	public static void main(String[] args) {
		//Long method
		String firstName = "Mary";
		String lastName = "Brown";
		int assignmentOne = 100;
		int assignmentTwo = 79;
		int assignmentThree = 80;
		int assignmentFour = 90;
		int assignmentFive = 100;

		System.out.println("Student: " + firstName + " " + lastName);
		System.out.println("Grades:");
		System.out.println("1: " + assignmentOne);
		System.out.println("2: " + assignmentTwo);
		System.out.println("3: " + assignmentThree);
		System.out.println("4: " + assignmentFour);
		System.out.println("5: " + assignmentFive);

		
		//Array version
		
		String fullName = "Mary" + " " + "Brown"; 
		int[] gradesArray = {100, 79, 80, 90, 100};

		System.out.println("Student: " + fullName);
		System.out.println("Grades: ");
		for (int i = 0; i < 5; i++) {
		System.out.println((i+1) + ": " + gradesArray[i]);
		}
		
		
		
		//Advanced for loop array
		
		String fullName2 = "Mary" + " " + "Brown"; 
		int[] gradesArray2 = {100, 79, 80, 90, 100};
		int counter = 1;

		System.out.println("Student: " + fullName2);
		System.out.println("Grades: ");
		for (int grade : gradesArray2) {
		System.out.println((counter++) + ": " + grade);
		}
	}

}
