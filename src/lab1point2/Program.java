package lab1point2;

public class Program {

	public static void main(String[] args) {
		
		int grade = -11;
		
		if (grade < 1 || grade > 100) {
			System.out.println("Error: marks must be between 1 and 100");
		}
		else {
		
		if ( grade > 71) {
			System.out.println("Dinstinction");
		}
		else if ( grade > 61) {
			System.out.println("Merit");
		}
		else if ( grade > 50) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		}
		

	}

}
