package week1review;

public class Person {

	private String name;
	private String email;
	
	public Person(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	
	public String getDetails() {
        return name + " " + email;
    }

}
