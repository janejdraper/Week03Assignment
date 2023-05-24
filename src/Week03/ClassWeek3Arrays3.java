package Week03;

import java.util.*;

public class ClassWeek3Arrays3 {

	public static void main(String[] args) {
		Scanner prompt = new Scanner(System.in);
		System.out.println("Enter a word or phrase below");
		String response = prompt.nextLine();
		for (int i=0; i < response.length(); i++) {
			if( (response.charAt(i) >= 'a' && response.charAt(i) <= 'z') || (response.charAt(i) >= 'A' && response.charAt(i) <= 'Z')) {
				System.out.println(response.charAt(i) + " is an alphabet.");
			} else
				System.out.println(response.charAt(i) + " is not an alphabet");
		}
	}

}
