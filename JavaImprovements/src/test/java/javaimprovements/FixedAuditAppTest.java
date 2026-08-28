package javaimprovements;

// JUnit 5 Imports
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Instant;
import org.junit.jupiter.api.Test;

public class FixedAuditAppTest {

	// Checks that the formatted log line matches expectations exactly
	@Test
	void formatAuditWorksCorrectly() {
		FixedAuditApp.AuditEvent event = new FixedAuditApp.AuditEvent("abc12345",
				Instant.parse("2026-08-27T14:22:46.977271725Z"), "AuthTeam", "user-100", "OK", true);

		String actualResult = FixedAuditApp.formatAuditEvent(event);

		String expectedString = "id=abc12345" + " date=2026-08-27T14:22:46.977271725Z" + " team=AuthTeam"
				+ " user=user-100" + " result=OK" + " known=true";

		// JUnit 5 format: assertEquals(expected, actual)
		assertEquals(expectedString, actualResult);
	}

	@Test
	public void timestampFormatTest() {

		FixedAuditApp.Attempt attempt = new FixedAuditApp.Attempt("user-100", true);

		Instant before = Instant.now();

		FixedAuditApp.AuditEvent event = FixedAuditApp.createAuditEvent(attempt);

		Instant after = Instant.now();

		assertFalse(event.timestamp().isBefore(before));
		assertFalse(event.timestamp().isAfter(after));

		assertTrue(event.timestamp().toString().endsWith("Z"));

	}
	
	@Test
    public void setsResultToOKWhenAttemptIsSuccessful() {

		FixedAuditApp.Attempt successfulAttempt = new FixedAuditApp.Attempt("user-100", true);


        FixedAuditApp.AuditEvent event = FixedAuditApp.createAuditEvent(successfulAttempt);

        assertEquals("OK", event.result());
    }

    @Test
    public void setsResultToNotOKWhenAttemptFails() {

        FixedAuditApp.Attempt failedAttempt = new FixedAuditApp.Attempt("user-200", false);

        FixedAuditApp.AuditEvent event = FixedAuditApp.createAuditEvent(failedAttempt);

        assertEquals("NOT_OK", event.result());
    }
}