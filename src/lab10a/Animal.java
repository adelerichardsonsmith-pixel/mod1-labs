package lab10a;

public abstract class Animal  implements Movable{
	private String name;
    private AnimalType animalType;

    public Animal(String name, AnimalType animalType) {
        this.name = name;
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    @Override
    public void move() {
        System.out.println(name + " is moving around!");
    }
}
