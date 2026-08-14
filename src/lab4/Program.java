package lab4;

public class Program {

	public static void main(String[] args) {
		
		int[] numbers = {1, 3, -5, 7, 0, 4, 6, 8 };
		printArray(numbers);
		int sum = 0;
	    int average = (int) sum / numbers.length;
        int min = numbers[0];
        int max = numbers[0];
        int zero = -1;
        
		for (int num : numbers) {
		    sum += num;
		}
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        for (int num : numbers ) {
        	if (num > max) {
        		max = num;
        	}
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                zero = i;
                break;
            }
        }
        
		System.out.println("Sum:" + sum);
        System.out.println("Average:" + average);
        System.out.println("Minimum:" + min);
        System.out.println("Maximum:" +max);
        System.out.println("Index of 0:" + zero);
	}
	
	public static void printArray(int[] arr) {
	}
}
