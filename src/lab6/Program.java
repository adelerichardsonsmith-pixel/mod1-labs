package lab6;

public class Program {

	public static void main(String[] args) {

		Account myAccount = new Account(123, 100.00, "Adele");
		
		try {
            myAccount.withdraw(101.00);
            
        } catch (IllegalArgumentException e) {
            System.out.println("[ERROR]: " + e.getMessage());
            
        } finally {
            // Always executes, ensuring cleanup
            myAccount.close(true);
    		System.out.println(myAccount.getDetails());
        }
    }

	}


