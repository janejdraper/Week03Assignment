package Week02;
		import java.io.*;
		import java.util.*;
public class Lesson_JavaBooleanOperations {

	public static void main(String[] args) {

		    
			    
		    	Scanner in = new Scanner(System.in);
		        boolean a = in.nextBoolean();
		        boolean b = in.nextBoolean();
		        boolean c = in.nextBoolean(); 
//		    /***** DO NOT CHANGE THE CODE ABOVE THIS LINE ******/ 
//		      
//		      // WRITE YOUR CODE HERE
//		        boolean result = (a == true && b == true) || (b==true && c==true) || (a==true && c==true);
//		        System.out.println(result);
//		        
// complex with NOT b
		        boolean result = (a && b) || (c || !b);
		        System.out.println(result);
		        
		        
//		        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
//		            System.out.println("It's a vowel!");
//		            
//		        } else {
//		            System.out.println("It's a consonant!");
//		            
//		        }
//		    }
//		    public static void main(String[] args) {
//				Scanner in = new Scanner(System.in);
//				char a;
//				a = in.nextLine().charAt(0);
//			    aeiou(a);
	
	
			}
		}
