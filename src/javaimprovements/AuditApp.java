package javaimprovements;

import java.io.IOException;
import java.util.List;

import javaimprovements.AuditWriter.AuditItem;

public class AuditApp {

	private static final String outputFile = "auditfile.txt";
    static String teamName = "AuthTeam"; 
    
    //Calling methods and inputting data in main 
	public static void main(String[] args) {
		
		//Array list of data
		List<AuditItem> auditItems = List.of(
				new AuditItem("user-100", true), 
				new AuditItem("user-200", false),
				new AuditItem("user-100", false), 
				new AuditItem("user-999", true),
				new AuditItem("user-800", true)
				);

		AuditWriter auditWriter = new AuditWriter(outputFile);
		auditWriter.setTeamName(teamName);
		
		//Try and run processAuditLogs method, otherwise show error
		try {
			auditWriter.processAuditlogs(auditItems);
		} catch (IOException e) {
			System.err.println("Failed to write audit logs: " + e.getMessage());
		}
	}
}
