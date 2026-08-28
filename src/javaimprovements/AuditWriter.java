package javaimprovements;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class AuditWriter {

	public record AuditItem(String username, boolean successful) {
	}
	
	//Output file setup
	private File outputFile;

	public AuditWriter(String outputFile) {
		this.outputFile = new File(outputFile);
	}
	
	//Team name setup
	private String teamName;

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	private boolean auditHeader;
	
	public AuditWriter(boolean auditHeader) {
		this.auditHeader = auditHeader;
	}
	
	public void auditHeader() {
		
	}

	//Writer method
	public void processAuditlogs(List<AuditItem> auditItems) throws IOException {
		try (FileWriter f = new FileWriter(outputFile, true)) { //added existing filewriter boolean to the end
			
			//Known users input
			Set<String> knownUsers = Set.of("user-100","user-200","user-300");
			
			for (AuditItem auditItem : auditItems) {
				
				//User status
				boolean isKnown = knownUsers.contains(auditItem.username());
				String userStatus = isKnown ? "KNOWN" : "UNKNOWN";
				
				//Id
				UUID eventId = UUID.randomUUID();
				
				//Timestamp
				String timestamp = OffsetDateTime.now(ZoneOffset.UTC).format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
				
				//Audit successful
				String outcome = auditItem.successful() ? "OK" : "NOT_OK";
				
				//Print outcome to file
				String line = String.format("uuid = %s, time = %s, user = %s, known user = %s, result = %s team = %s %n", 
						eventId,timestamp, auditItem.username(), userStatus, outcome, teamName);
				f.write(line);
			}
		}
		
		//Checking whether run has worked
		System.out.println("Audit processing complete. Output saved to: " + outputFile);
	}

}
