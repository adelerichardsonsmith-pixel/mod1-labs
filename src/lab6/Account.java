package lab6;

public class Account {

	int id;
	double balance;
	String owner;

	public Account(int id, double balance, String owner) {
		this.id = id;
		this.balance = balance;
		this.owner = owner;
	}
	
	public void withdraw(double amount) {
		if (this.balance - amount < 0) {
            throw new IllegalArgumentException(
                String.format("Insufficient funds! Cannot withdraw £%.2f. Current balance is £%.2f.", amount, balance)
            );
        }
        this.balance -= amount;
    }
	
	public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
        } else {
            balance += amount;
            System.out.println("Successfully deposited: £" + amount);
        }
    }
	
	public void close(boolean close) {
		if (id == 123) {
			System.out.println("Account " + id + " is closed");
		}
	}
	
	public String getDetails() {
        return String.format("Account ID: %d | Owner: %s | Balance: £%.2f", id, owner, balance);
    }
	
	
}

