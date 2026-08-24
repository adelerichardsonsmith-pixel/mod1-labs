package lab8;

import java.util.ArrayList;

public class SkilledWorker extends Employee{
	private ArrayList<String> skills;

	public SkilledWorker(String name, String jobTitle) {
		super(name, jobTitle);
		this.skills = new ArrayList<>();
	}
	
	public ArrayList<String> getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}
	
	public void addSkill(String skill) {
		skills.add(skill);
	}
	
	@Override
    public String getInfo() {
        String info = super.getInfo();
        info += skills.toString();
        return info;
    }

}
