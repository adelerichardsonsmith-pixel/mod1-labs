package lab12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		try {

            String[] courses = readCSV("src/course.txt");
            String[] trainers = readCSV("src/trainer.txt");


            try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/trainersAndCourses.txt"))) {
                

                writer.write(String.join(",", courses));
                writer.newLine();

                writer.write(String.join(",", trainers));
                writer.newLine();
            }

            System.out.println("Successfully created 'trainersAndCourses.txt'!");

        } catch (IOException e) {
            System.err.println("An error occurred during file operations: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * @param inFile The relative or absolute path to the file.
     * @return String array of delimited values.
     * @throws IOException If file access or reading fails.
     */
    private static String[] readCSV(String inFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inFile))) {
            String line = reader.readLine();
            if (line != null) {
                return line.split(",");
            }
            return new String[0];
        }
    }
   
}
