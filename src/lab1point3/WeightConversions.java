package lab1point3;

import java.util.Scanner;

public class WeightConversions {


	public static void main(String[] args) {
		
		Utils utils = new Utils();

	    int weightInPounds = utils.getInt("What is your weight in pounds?");
	    convertInputToStonesPounds(weightInPounds);
	    
	    int weightInKilograms = utils.getInt("What is your weight in kilograms?");
	    convertKilogramsToStonesPounds(weightInKilograms);
		
	}
	
	public static void convertInputToStonesPounds(int weightInPounds) {
		int stones = weightInPounds / 14;
        int pounds = weightInPounds % 14;

        System.out.println(weightInPounds + " lbs is equivalent to " + stones + " st " + pounds + " lbs.");
    }
	
	public static void convertKilogramsToStonesPounds(int weightInKilograms) {
		int totalPounds = (int) (weightInKilograms * 2.20462);
        int stones = totalPounds / 14;
        int remainingPounds = totalPounds % 14;

        System.out.println(weightInKilograms + " kg is equivalent to " + stones + " st " + remainingPounds + " lbs.");
	}
	
//  public static String getString(String prompt) {
//  System.out.println(prompt);
//  Scanner s = new Scanner(System.in);
//  String result = s.nextLine();
//  return result;
//  
//}
//
//public static int getInt(String prompt) {
//  System.out.println(prompt);
//  Scanner s = new Scanner(System.in);
//  int result = s.nextInt();
//  return result;
//}
	
    


}
