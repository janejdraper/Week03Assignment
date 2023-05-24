package Week02;

public class Labs12_14 {

	public static void main(String[] args) {
		// 12. Write a for loop that prints every other number from 0 to 100
		for (int i=0; i<=100; i+=2) {
		System.out.println(i);
		}
		
		// 13. Write a for loop that iterates from 0 to 100 and prints 
		//			"EVEN" if the number is even and "ODD" if it's odd

		int n=0;
		while (n<=100) {
			if (n%2 == 0) {
			System.out.println(n + " even");
			} else {
			System.out.println(n + " odd");
			}
			n += 1;
		}
		
		// 14. Write a while loop that starts at 100 and iterates backwards by 1 until it reaches 0
		//			within the loop, divide each number by 3 and print the remainder to the console.
		for (int p = 100; p>=0; p--) {
			System.out.println(p + " " + p%3);
		}
	}

}
