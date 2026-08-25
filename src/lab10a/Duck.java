package lab10a;

public class Duck extends Bird implements Flyable, Swimmable{
	public Duck(String name) {
        super(name);
    }

    @Override
    public void makeNest() {
        System.out.println(getName() + " is making a nest near the pond.");
    }

    @Override
    public void move() {
        System.out.println(getName() + " is waddling like a Duck!");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying like a Duck!");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is paddling in the water like a Duck!");
    }
}
