package lab12;

import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;

public class Program2 {

	public static void main(String[] args) throws Exception{
		Gson gson = new Gson();
		String fileName = "/Users/adelerichardson-smith/eclipse-workspace/mod1_2025-main/Resources/customers.json";
		String content = new String(Files.readAllBytes(Paths.get(fileName)));
		Customer[] customers = gson.fromJson(content, Customer[].class);
		System.out.println("Customer List (" + customers.length + " total)");
        for (Customer c : customers) {
            System.out.println("ID: " + c.CustomerID + 
                               " Company: " + c.CompanyName + 
                               " Contact: " + c.ContactName);
        }
	}

}
