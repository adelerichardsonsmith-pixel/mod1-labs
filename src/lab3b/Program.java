package lab3b;

import java.util.ArrayList;
import java.util.Random;

public class Program {

	public static void main(String[] args) {
		
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		
		Random rand = new Random();
		boolean raceFinished = false;
		
		vehicles.add(new Vehicle(1));
		vehicles.add(new Vehicle(2));
		vehicles.add(new Vehicle(3));
		
		int getCount = vehicles.size();
		System.out.println("Number of vehicles: " + getCount);
		
		for (Vehicle v : vehicles) {
			System.out.println(v.getDetails());
		}
		
		while (!raceFinished) {
			for (Vehicle v : vehicles) {
				int n = rand.nextInt(10)+1;
				v.accelerate(n);
				if (v.distanceTravelled > 1000) {
					raceFinished = true;
				}
			}
			
		}
			
	}
}