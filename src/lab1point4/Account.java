package lab1point4;

public class Account {
	
	public static void main(String[] args) {
	account();
	}
	
	public static void account() {
		
		double initialMoney = 100;
		double currentMoney = initialMoney;
		double interestRate = 1.05;
		int years = 0;
		
		while (currentMoney < 200) {
			currentMoney *= interestRate;
			years++;
		}
		
		System.out.println(years);
	}

}
