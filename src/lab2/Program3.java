package lab2;

public class Program3 {

	public static void main(String[] args) {
		
		int k=100;
		incInt(k);
		System.out.println(k);
		
		Account myAccount = new Account(104, "Dave", 100.00);

		myAccount.addInterest();

		Account partnerAccount = myAccount;
		
		partnerAccount.addInterest();
		
		System.out.println(myAccount.getDetails());
		
		processAccount(myAccount);
		System.out.println(myAccount.getDetails());
		

	}
	
	static void processAccount(Account acc){ 
		acc.addInterest();

	}
	
	private static void incInt(int x) {
		x++;
	}

}
