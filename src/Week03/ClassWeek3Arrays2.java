package Week03;

import java.util.*;

public class ClassWeek3Arrays2 {

	public static void main(String[] args) {
		String strIn;
		Scanner prompt = new Scanner(System.in);
		System.out.println("Enter a word below:");
		strIn = prompt.nextLine();
		char[] pink_elephants = strIn.toCharArray();
		for (int i=pink_elephants.length-1; i>=0; i--) {
			System.out.print(pink_elephants[i]);
		}
	}

}
