package lab8;

import java.util.ArrayList;

public class Manager extends Employee {

	public Manager(String name, String jobTitle) {
		super(name, jobTitle);
	}

	private ArrayList<Employee> employees = new ArrayList<>();

	public void addEmployee(Employee emp) {
		employees.add(emp);
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public String getInfo() {
		String info = super.getInfo();
		for (Employee e : employees) {
			info += e.getInfo();
		}
		return info;
	}

}
