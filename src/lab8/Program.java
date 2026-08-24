package lab8;

public class Program {
	
	public static void main(String[] args) {
		Car[] cars = {
	            new Car("Ford Focus", 0),
	            new RacingCar("Ferrari F8", 0, "Lewis Hamilton", 2),
	            new Car("Honda Civic", 0),
	            new RacingCar("Red Bull RB20", 0, "Max Verstappen", 3)
	        };
		processCars(cars);
	}

	private static void processCars(Car[] cars) {
		for (Car c : cars) {
			c.getToSixty();
			c.accelerate(2);
			
			System.out.println("Model " + c.getModel() + ", Speed " + c.getSpeed() + "MPH");
			
			if (c instanceof RacingCar) {
				RacingCar rc = (RacingCar) c;
				System.out.println(rc.getDriver());
			}
		}
		
	}

}
