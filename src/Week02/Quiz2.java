package Week02;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int index=0; index <= 99; index++) {
//			if(!(index%2==0)) {
//		System.out.println(index);
//			}
//	}
		//INFINITE LOOP! DON'T EXECUTE!
//		for (int i = 0; i<10; i--) {
//			System.out.println(i);
//		}
//			  double moneyInWallet = 4.50;
//
//			  double costOfMilk = 1.99;
//
//			  if (moneyInWallet >= costOfMilk * 2) {
//
//			    System.out.println("Let's buy two gallons.");
//
//			  } else if (moneyInWallet >= costOfMilk) {
//
//			    System.out.println("Let's buy one gallon.");
//
//			  } else {
//
//			    System.out.println("Way too expensive!");
//
//			  }

		

//			  String name = "Tommy";
//
//			  int age = 52;
//
//			  if (name == "Tommy") {
//
//			    System.out.println("Hi, Tommy!");
//
//			  } else if (age == 52) {
//
//			    System.out.println("52 years old.");
//
//			  }
//
//			  System.out.println("Out of conditional.");
//
		int numericGrade = 98;
		char letterGrade = ' ';
		if (numericGrade >=90) {
			letterGrade ='A';
		} else if (numericGrade >= 80) {
			letterGrade ='B';
		} else if (numericGrade >= 70) {
			letterGrade ='C';
		} else if (numericGrade >= 60) {
			letterGrade ='D';	
		} else {
			letterGrade ='F';
		}
		System.out.println("The letter Grade for a " + numericGrade + " is a " + letterGrade + ".");
	}			
	
}
