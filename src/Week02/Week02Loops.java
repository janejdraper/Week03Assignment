package Week02;

public class Week02Loops {

	public static void main(String[] args) {
//		for (int i=0; i<10; i++) {
//			System.out.println(i);
//		}
//		
		
		//NOTE - use Crtl+/ to quickly comment out sections
		
//		for (int i=1; 1 <= 10; i++) {
//			if (i % 2 == 0) { //the % symbol is modulo
//				System.out.println(i);
//			}
//		}
		
		int x =5;
		while (x < 10) {
			System.out.println(x);
			x++;
		}
		
		do {
			System.out.println(x);
		} while (x < 2);
		
//		int cupsofFlour = 0; 
//		while (cupsofFlour < 5) {
//			System.out.println("Scooping a cup of flour into the bowl");
//			cupsofFlour += 1;
//			if (cupsofFlour == 1) {
//			System.out.println("There is 1 cup of flour in the bowl.");
//			} else {
//			System.out.println("There are " + cupsofFlour + " cups of flour in the bowl.");
//			}
//			}
		
		for (int cupsofFlour = 1; cupsofFlour <= 5; cupsofFlour++) {
			System.out.println("Scooping a cup of flour into the bowl.");
			System.out.println("there are " + cupsofFlour + " cups of flour in the bowl.");
		
		}
	}

}
