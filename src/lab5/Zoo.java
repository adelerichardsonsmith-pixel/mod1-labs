package lab5;

import java.util.HashMap;

public class Zoo {
	
	HashMap<String, Integer> animalMap = null;
    String[] originalAnimals = {"Zebra", "Lion", "Buffalo"};
    String[] newAnimals = {"Zebra", "Gazelle", "Buffalo", "Zebra"};
	

	public Zoo(String zoo) {
		animalMap = new HashMap<>();
        addAnimals(originalAnimals);
        addAnimals(newAnimals);
        displayAnimalData();
        
//        System.out.println(animalMap);
	}
        

	void addAnimals(String[] animals) {
        for (String animal : animals) {
            if (animalMap.containsKey(animal)) {
                int currentCount = animalMap.get(animal);
                animalMap.put(animal, currentCount + 1);
            } else {
                animalMap.put(animal, 1);
            }
        }
    }
	
	void displayAnimalData() {
		for (String animal : animalMap.keySet()) {
			int count = animalMap.get(animal);
			System.out.println(animal + "\t\t" + count);
		}
	}
}
