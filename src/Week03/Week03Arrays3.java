package Week03;

public class Week03Arrays3 {

	public static void main(String[] args) {

		String[] products = new String[5];
		
		products[0] = "Carrots";
		products[1] = "Pineapple";
		products[2] = "Tomatoes";
		products[3] = "Potatoes";
		products[4] = "Cereal";

		for (String product : products) {
			System.out.println("Product: " + product);
		}
		
		int[] multiplesOf3 = new int[10];
					
		for (int i = 1; i <= multiplesOf3.length; i++) {
			//using i = 1 so that i-1 starts at zero
			multiplesOf3[i-1] = i*3;
			System.out.println("number:" + multiplesOf3[i-1]);
		}
		
		int[] multiplesOf5 = new int[10];
		
		for (int i=0; i < multiplesOf5.length; i++) {
			multiplesOf5[i] = (i+1)*5;
			System.out.println(multiplesOf5[i]);
		}
	}

}
