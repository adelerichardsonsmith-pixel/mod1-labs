package lab4;

public class Program {

	public static void main(String[] args) {
		
		int[] numbers = {1, 3, -5, 7, 0, 4, 6, 8 };
		printArray(numbers);
		
		//Task1
		int sum = 0;
		for (int num : numbers) {
		    sum += num;
		}

		System.out.println("Sum:" + sum);
	    
	    //Task2
	    int average = (int) sum / numbers.length;
        System.out.println("Average:" + average);
        
        //Task3
        int min = numbers[0];

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        
        System.out.println("Minimum:" + min);

        
        //Task 4
        int max = numbers[0];
        
        for (int num : numbers ) {
        	if (num > max) {
        		max = num;
        	}
        	
        }
        System.out.println("Maximum:" +max);
        
        //Task 5
        int zero = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                zero = i;
                break; // Exit early once zero is found
            }
        }

        System.out.println("Index of 0:" + zero);
        
	}
	
	public static void printArray(int[] arr) {
		
	}
		

}
