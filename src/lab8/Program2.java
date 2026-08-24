package lab8;

public class Program2 {

	public static void main(String[] args) {

		Manager mgr = new Manager("Adele Smith", "Engineering Manager");

		Employee emp1 = new Employee("Marie Smith", "QA Tester");
		Employee emp2 = new Employee("David Noone", "Junior Developer");
		mgr.addEmployee(emp1);
		mgr.addEmployee(emp2);

		SkilledWorker worker = new SkilledWorker("Phil Smith", "Senior Software Engineer");
		worker.addSkill("Java");
		worker.addSkill("Spring Boot");
		worker.addSkill("Docker");
		mgr.addEmployee(worker);

		System.out.println(mgr.getInfo());
	}

}
