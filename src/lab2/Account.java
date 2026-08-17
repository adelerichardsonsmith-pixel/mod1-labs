package lab2;

public class Account {
	
	private int id;
	private String owner;
	private double balance;
	
	public Account(int id, String owner, double balance) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }
	
	public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
        } else {
            balance += amount;
            System.out.println("Successfully deposited: £" + amount);
        }
    }
	
	public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Cannot withdraw £" + amount);
        } else {
            balance -= amount;
            System.out.println("Successfully withdrew: £" + amount);
        }
    }
	
	public String getDetails() {
        return String.format("Account ID: %d | Owner: %s | Balance: £%.2f", id, owner, balance);
    }
	
	public void addInterest() {
	    this.balance += this.balance * 0.025;
	}
}
