package Week02;

import java.util.Arrays;
import java.io.*;
import java.util.*;

public class LessonJavaLoops {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//        String str1 = "PHP";
//        System.out.println("Original string: "+str1);
//        String resultV1 = repeat_str(str1, 7);           method, called or invoked (week 4 info)
//       System.out.println("\nAfter repeating 7 times: "+resultV1);
//   }
		

		   
		        Scanner in = new Scanner(System.in);
		        String userWord = "Happy"; //in.next();
		        String longString ="";
		/****** DO NOT CHANGE THE CODE ABOVE THIS LINE ******/
		        System.out.println(userWord.length());
		        // WRITE YOUR CODE HERE 
		        for ( int i = 0; i < userWord.length(); i++ ) {
		            longString += userWord;
		            System.out.println(longString);
//		            System.out.println(userWord);
		        }
		        
		        System.out.println(longString);
		  
		    }
	
//	Scanner in = new Scanner(System.in);
//	System.out.println("Enter a password that is at least 10 characters: ");
//	String userPassword = in.nextLine();
//
//	do{
//	    if ( userPassword.length() < 10 ) {
//	        System.out.println("Your password is not long enough.");
//	        userPassword = in.nextLine();
//	    } else {
//	        System.out.println("Your password is long enough.");
//	    }
//
//	} while ( userPassword.length() < 10 );
	

}