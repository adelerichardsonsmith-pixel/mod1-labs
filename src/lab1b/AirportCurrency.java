package lab1b;

public class AirportCurrency {

	public static void main(String[] args) {

		//values for input
		double gbpAmount = 100.0;
		int currencyChoice = 1;
		char customerType = 'S';
		
		//determine currency rate
		float exchangeRate = 0.0f;
		String currencyName = "";
		
		switch (currencyChoice) {
		case 1:
			exchangeRate = 1.25f;
			currencyName = "USD";
			break;
		case 2:
			exchangeRate = 1.15f;
			currencyName = "EUR";
			break;
		case 3:
			exchangeRate = 180.5f;
			currencyName = "JPY";
			break;
		case 4:
			exchangeRate = 0.68f;
			currencyName = "AUD";
			break;
		default:
			System.out.println("Error: Invalid currency choice.");
			break;
			
		}
		
		//calculate fee
		double feePercentage;
        if (gbpAmount < 100) {
            feePercentage = 0.05;
        } else {
            feePercentage = 0.025;
        }
        double amountAfterFee = gbpAmount - (gbpAmount * feePercentage);
        
        //calculate tax
        double taxPercentage = 0.0;

        switch (customerType) {
            case 'V':
                taxPercentage = 0.05;
                break;
                
            case 'R':
                taxPercentage = 0.10;
                break;
            case 'S':
            	taxPercentage = 0.0;
            	break;
            default:
                System.out.println("Error: Invalid customer type.");
                break;
        }

        double amountAfterTax = amountAfterFee - (amountAfterFee * taxPercentage);

        double rawForeignCurrency = amountAfterTax * exchangeRate;
        int finalForeignCurrency = (int) rawForeignCurrency;
        
        System.out.println("--- TRANSACTION SUMMARY ---");
        System.out.println("Initial Amount: £" + gbpAmount);
        System.out.println("Amount after Service Fee: £" + amountAfterFee);
        System.out.println("Amount after Airport Tax: £" + amountAfterTax);
        System.out.println("Final Amount in Foreign Currency: " +currencyName  + "" + finalForeignCurrency);
	}

}
