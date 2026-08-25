package lab10a;

public class Penguin extends Bird implements Swimmable {
	public Penguin(String name) {
		super(name);
	}

	@Override
	public void makeNest() {
		System.out.println(getName() + " is building a pebble nest on the ice.");
	}

	@Override
	public void move() {
		System.out.println(getName() + " is waddling on the ice!");
	}

	@Override
	public void swim() {
		System.out.println(getName() + " is diving and swimming gracefully under ice!");
	}
}
