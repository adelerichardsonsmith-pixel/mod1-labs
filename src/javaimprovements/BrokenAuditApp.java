package javaimprovements;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDateTime;

public class BrokenAuditApp {

    static String OutputFile = "stage0_output.txt";    //no camel case here
    static String TEAMname = "AuthTeam";        //no camel case here      

    public static void doStuff() throws IOException { //more descriptive class name
        System.out.println("hello welcome to the audit thing"); //thing isn't professional

        String[] users = {"user-100", "user-200", "user-300"};  //users is never used

        Object[][] attempts = { //do we need two array boxes here?
                {"user-100", true},
                {"user-200", false},
                {"user-100", false},
                {"user-999", true}
        };
        System.out.println("Working directory output path: " + Path.of(OutputFile).toAbsolutePath()); //redundant line as its writing in the output file where the output file is
        String header = "EVENTS FOR SYSTEM";
        System.out.println(header + " " + TEAMname);
        System.out.println(header + " " + TEAMname); //why do we need two of these?

        LocalDateTime ts = LocalDateTime.now(); 

        FileWriter f = new FileWriter(OutputFile); 

        for (Object[] a : attempts) {
            String u = (String) a[0];
            boolean ok = (boolean) a[1]; //is there a cleaner way to call this boolean

            String outcome = ok ? "OK" : "NOT_OK";

            String line = "time=" + ts + " user=" + u + " result=" + outcome;

            if (ok == true) {
                System.out.println("SUCCESS happened for " + u);
            } else {
                System.out.println("fail happened for " + u); //formatting on fail/success
            }

            f.write(line); //should we add a sysout for this? file needs line breaks for readability
        }

        System.out.println("done. output file maybe created: " + OutputFile); //maybe????
    }

    public static void main(String[] args) throws IOException {
        doStuff(); 
    }
}


/*data and calling sysout methods in main class
*methods in a separate class
*main is in the same class as the methods class
*formatting inconsistencies - title, fail, done
*could data be pulled from a database, rather than using dummy data*/


