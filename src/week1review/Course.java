package week1review;

import java.util.HashMap;
import java.util.Map;

public class Course {
	
	private String courseName;
    private HashMap<Student, Integer> studentGrades;

    public Course(String courseName) {
        this.courseName = courseName;
        this.studentGrades = new HashMap<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student s, int grade) {
        studentGrades.put(s, grade);
    }

    public void printStudentList() {
        System.out.println(courseName);
        if (studentGrades.isEmpty()) {
            System.out.println("No students enrolled.");
            return;
        }

        for (Map.Entry<Student, Integer> entry : studentGrades.entrySet()) {
            Student student = entry.getKey();
            Integer grade = entry.getValue();
            System.out.println(student.getDetails()  + " " + grade);
        }
        System.out.println();
    }
}


