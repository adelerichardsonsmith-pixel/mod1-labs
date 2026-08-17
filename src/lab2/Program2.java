package lab2;

public class Program2 {

	public static void main(String[] args) {
		
		Account[] accounts = new Account[3];
		accounts[0] = new Account(101, "Marie", 900.00);
		accounts[1] = new Account(102, "Adele", 50.50);
		accounts[2] = new Account(103, "Frances", 182.00);
		
		for (Account acc : accounts)
		
        System.out.println(acc.getDetails());

	}

}
