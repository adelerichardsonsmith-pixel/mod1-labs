package lab1c;

import java.util.Scanner;

public class TheLunchQueue {
	


	public static void main(String[] args) {
		
		Utils utils = new Utils();

	    String mainCourse = utils.getString("What main dish would you like (Fish, Burgers or Veg)?");

	    if (!mainCourse.equals("Fish") && 
	        !mainCourse.equals("Burgers") && 
	        !mainCourse.equals("Veg")) {

	        System.out.println("Error: Invalid main course selection.");
	        return;
	    }

	    int roastPotatoes = utils.getInt("How many roast potatoes would you like?");
	    int brusselSprouts = utils.getInt("How many brussels sprouts would you like?");

	    System.out.println("Hello, your lunch is " + mainCourse + " with " + 
	                       roastPotatoes + " roast potatoes and " + 
	                       brusselSprouts + " brussel sprouts");
	}
	    
//	    public static String getString(String prompt) {
//	        System.out.println(prompt);
//	        Scanner s = new Scanner(System.in);
//	        String result = s.nextLine();
//	        return result;
//	        
//	    }
//
//	    public static int getInt(String prompt) {
//	        System.out.println(prompt);
//	        Scanner s = new Scanner(System.in);
//	        int result = s.nextInt();
//	        return result;
//	    }

}
