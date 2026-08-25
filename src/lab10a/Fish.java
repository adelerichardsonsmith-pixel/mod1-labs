package lab10a;

public class Fish extends Animal implements Swimmable{
	public Fish(String name) {
        super(name, AnimalType.Fish);
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming smoothly in the water!");
    }
}

