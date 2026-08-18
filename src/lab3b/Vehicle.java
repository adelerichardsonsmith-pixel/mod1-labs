package lab3b;

public class Vehicle {
	
	int lane, distanceTravelled, speed;
	
	RegistrationPlate registrationPlate;
	
	
	public Vehicle(int lane) {
		this.speed = 0;
		this.lane = lane;
		this.distanceTravelled = 0;
		this.registrationPlate = RegistrationPlateFactory.getNextRegistrationPlate();
	}


	void accelerate(int amount) {
		this.distanceTravelled += amount;
		this.speed += amount;
		if (this.speed > 200) {
			this.speed = 200;
	}
	}

	void brake(int amount) {
		this.speed -= amount;
		if (this.speed < 0) {
			this.speed = 0;

	}
	}
	
	public String getDetails() {
		return String.format("Speed: %d, Lane: %d, Distance Travelled: %d, Plate: %s",speed, lane, distanceTravelled, registrationPlate.getNumber());
	}
	




}


