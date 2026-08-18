package lab3b;

import java.util.ArrayList;
import java.util.Random;

public class Program {

	public static void main(String[] args) {
		
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		
		vehicles.add(new Vehicle(1));
		vehicles.add(new Vehicle(2));
		vehicles.add(new Vehicle(3));
		
		int getCount = vehicles.size();
		System.out.println("Number of vehicles: " + getCount);
		
		for (Vehicle v : vehicles) {
			System.out.println(v.getDetails());
		}	
		
		raceVehicles(vehicles);
	} 
	
	public static void raceVehicles(ArrayList<Vehicle> vehicles) {
		boolean raceFinished = false;
		Random rand = new Random();
		int turn = 1;
		
		while (!raceFinished) {
			
			for (Vehicle v : vehicles) {
				int n = rand.nextInt(10)+1;
				v.accelerate(n);
				System.out.println(v.getDetails());

				if (v.distanceTravelled > 1000) {
					System.out.println("Vehicle: " + v.registrationPlate.getNumber() + "wins, distance travelled: " + v.distanceTravelled);
					raceFinished = true;
					break;
				}
			}
			turn ++;

		}
		

	}
}