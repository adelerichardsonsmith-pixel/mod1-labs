package lab1point3;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
    
    String name = getString("What is your name?");
    int age = getInt("What is your age?");
    System.out.println("Hello " + name + ", you are " + age + " years old.");
        
    	        	
    }
    
    public static String getString(String prompt) {
        System.out.println(prompt);
        Scanner s = new Scanner(System.in);
        String result = s.nextLine();
        return result;
        
    }

    public static int getInt(String prompt) {
        System.out.println(prompt);
        Scanner s = new Scanner(System.in);
        int result = s.nextInt();
        return result;
    }
    
    
 
    
    

}


