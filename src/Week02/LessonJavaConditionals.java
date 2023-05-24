package Week02;
import java.io.*;
import java.util.*;

public class LessonJavaConditionals {

	public static void main(String[] args) {
        System.out.println("Type your word:");
		Scanner in = new Scanner(System.in);
        String randomWord = in.next();
    /***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/
        
      // My version
//    int stringSize = randomWord.length(); 
//    if (stringSize >= 10) {
//        System.out.println("That is a really long word!");
//    } else {
//        System.out.println("Your word is not that long.");
//    }
    // Instructor answer
    if ( randomWord.length() >= 10 ) {
        System.out.println("That is a really long word!");
    } else {
        System.out.println("Your word is not that long.");
    }
        
    }
}

//import java.util.*;

//MY SOLUTION
//public class DayOfWeek {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String day = input.nextLine();
//    /***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/  
//      
//      // WRITE YOUR CODE HERE
//        String DAY = day.toLowerCase();
//        if (DAY.equals("monday") || DAY.equals("tuesday") || DAY.equals("wednesday") || DAY.equals("thursday") || DAY.equals("friday")) {
//            System.out.println(day + " is a weekday.");
//        } else if (DAY.equals("saturday") || DAY.equals("sunday")) {
//            System.out.println(day + " is a weekend day.");
//        } else {
//            System.out.println("Invalid day!");
//        }
//
//        
//    }
//}

//INSTRUCTOR SOLUTION
//switch(day.toLowerCase()) {
//case "monday":
//case "tuesday":
//case "wednesday":
//case "thursday":
//case "friday":
//    System.out.println(day + " is a weekday.");
//    break;
//case "saturday":
//case "sunday":
//    System.out.println(day + " is a weekend day.");
//    break;
//default:
//    System.out.println("Invalid day!");
//}
//}
//}