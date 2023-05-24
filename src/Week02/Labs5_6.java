package Week02;

public class Labs5_6 {

	public static void main(String[] args) {
		double costOfMilk = 2.55;
		int thirstLevel = 7;
		if (costOfMilk <2.50 || thirstLevel > 6) {
			System.out.println("Milk Please" );
		} else {
			System.out.println("No thanks");
		}
	
		int numberOfCookies = 4;
		int numberOfChildren = 2;
		int leftOvers = numberOfCookies % numberOfChildren;
			if (leftOvers >=5) {
				System.out.println("Jackpot! " + leftOvers + " cookies for me!");
			} else {
				if (leftOvers >=2) {
					System.out.println("Whoohooooo! " + leftOvers + " cookies for me!");
				} else {
					if (leftOvers > 0) {
						System.out.println("Yes! " + leftOvers + " cookie for me!");
					} else {
						System.out.println("Sad face. No cookies for me.");
					}
				}
			}
		
		
	}

}
