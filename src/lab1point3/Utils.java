package lab1point3;

import java.util.Scanner;

public class Utils {
	
	
    public String getString(String prompt) {
        System.out.println(prompt);
        Scanner s = new Scanner(System.in);
        String result = s.nextLine();
        return result;
        
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        Scanner s = new Scanner(System.in);
        int result = s.nextInt();
        return result;
    }

}
