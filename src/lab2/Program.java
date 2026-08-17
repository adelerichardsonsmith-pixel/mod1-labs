package lab2;

public class Program {

	public static void main(String[] args) {


			
	        Account myAccount = new Account(12345, "Marie", 700.00);

	        myAccount.deposit(50.00);
//	        myAccount.deposit(-20.00);
	        
	        myAccount.withdraw(30.00);
//			myAccount.withdraw(900.00);

			System.out.println(myAccount.getDetails());
	    
	
	}

}
