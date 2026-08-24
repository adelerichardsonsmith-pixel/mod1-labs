package week1review;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		Course javaCourse = new Course("Java Programming");
        Course webCourse = new Course("Web Development");

        ArrayList<Course> courses = new ArrayList<>();
        courses.add(javaCourse);
        courses.add(webCourse);

        Student s1 = new Student("Adele Smith", "adele@university.ac.uk", "ST1001");
        Student s2 = new Student("David Noone", "david@university.ac.uk", "ST1002");
        Student s3 = new Student("Marie Smith", "marie@university.ac.uk", "ST1003");

        javaCourse.addStudent(s1, 85);
        javaCourse.addStudent(s2, 72);

        webCourse.addStudent(s2, 68);
        webCourse.addStudent(s3, 91);

        for (Course c : courses) {
            c.printStudentList();
        }
    }
}