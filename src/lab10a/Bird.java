package lab10a;

public abstract class Bird extends Animal{
	public Bird(String name) {
        super(name, AnimalType.Bird);
    }

    public void makeNest() {
        System.out.println(getName() + " is building a nest.");
    }
}
