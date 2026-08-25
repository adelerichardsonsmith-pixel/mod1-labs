package lab10a;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Duck("Donald"));
        animals.add(new Penguin("Pingu"));
        animals.add(new Fish("Nemo"));

        System.out.println("=== Testing Interfaces in Animal Array ===");

        for (Animal a : animals) {
            System.out.println("\n--- Checking " + a.getName() + " (" + a.getAnimalType() + ") ---");
            
            // All Animals are Movable
            a.move();

            // Check if Animal implements Flyable
            if (a instanceof Flyable) {
                Flyable f = (Flyable) a;
                f.fly();
            }

            // Check if Animal implements Swimmable
            if (a instanceof Swimmable) {
                Swimmable s = (Swimmable) a;
                s.swim();
            }
        }
    }
}