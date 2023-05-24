package Week03;

public class Week03Arrays1 {

	public static void main(String[] args) {

		String studentName1 = "Tom Sawyer";
		String studentName2 = "Jack Smith";
		String studentName3 = "Bill Turner";
		
		System.out.println(studentName1);
		System.out.println(studentName2);
		System.out.println(studentName3);

		String[] students = new String[3];
		//remember the positions are 0,1,2
		students[0] = "Tom Sawyer";
		students[1] = "Jack Smith";
		students[2] = "Bill Turner";
		
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);
		
		for (int i = 0; i< students.length; i++) {
			System.out.println(students[i]);
		}
		
		//enhanced for loop
		System.out.println("Enhanced for loop (see below)");
		for (String student : students) {
			//for each student in my students array do this...
			System.out.println(student);
		}
	}

}
