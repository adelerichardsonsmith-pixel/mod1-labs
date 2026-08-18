package lab1d;

public class Grades2 {

    public static void main(String[] args) {
        
        String[] names = {"Geoff", "Steve", "Maria", "Gordon", "Susan"};
        int[] marks = {-77, 88, 99, 33, 55};
                
        for (int i = 0; i < names.length; i++) {
            String grade = getGrade(marks[i]);
            System.out.println(names[i] + " - Mark: " + marks[i] + " (" + grade + ")");
        }

    }
    
    public static String getGrade(int mark) {
        if (mark < 1 || mark > 100) {
            return "Invalid Mark";
        } else if (mark >= 71) {
            return "Distinction";
        } else if (mark >= 61) {
            return "Merit";
        } else if (mark >= 50) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

}
