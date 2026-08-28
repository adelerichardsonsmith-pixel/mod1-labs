package javaimprovements;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.Instant;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class FixedAuditApp {

    static Path OUTPUT_FILE = Path.of("stage0_output.txt");
    static String TEAM_NAME = "AuthTeam";

    private static final Set<String> KNOWN_USERS = Set.of(
            "user-100",
            "user-200",
            "user-300");

    public record Attempt(String userId, boolean successful) {}

    public record AuditEvent(
            String eventId,
            Instant timestamp,
            String team,
            String userId,
            String result,
            boolean knownUser) {}

    static List<Attempt> getDefaultAttempts() {
        return List.of(
                new Attempt("user-100", true),
                new Attempt("user-200", false),
                new Attempt("user-100", false),
                new Attempt("user-999", true));
    }

    static AuditEvent createAuditEvent(Attempt attempt) {
        String result = attempt.successful() ? "OK" : "NOT_OK";
        boolean knownUser = isKnownUser(attempt.userId());

        return new AuditEvent(
                UUID.randomUUID().toString().substring(0, 8),
                Instant.now(),
                TEAM_NAME,
                attempt.userId(),
                result,
                knownUser);
    }

    static boolean isKnownUser(String userId) {
        return KNOWN_USERS.contains(userId);
    }

    // Opens stream ONCE for the whole list of events
    static void writeAuditEvents(List<AuditEvent> events) throws IOException {
        boolean needsHeader = !Files.exists(OUTPUT_FILE) || Files.size(OUTPUT_FILE) == 0;

        try (BufferedWriter writer = Files.newBufferedWriter(
                OUTPUT_FILE,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND)) {

            if (needsHeader) {
                // Adjust header string to match your desired format (CSV vs Key-Value)
                writer.write("id date team user result known");
                writer.newLine();
            }

            for (AuditEvent event : events) {
                writer.write(formatAuditEvent(event));
                writer.newLine();
            }
        }
    }

    static String formatAuditEvent(AuditEvent event) {
        return "id=" + event.eventId()
                + " date=" + event.timestamp()
                + " team=" + event.team()
                + " user=" + event.userId()
                + " result=" + event.result()
                + " known=" + event.knownUser();
    }

    static void run() throws IOException {
        List<Attempt> attempts = getDefaultAttempts();
        
        // Convert all attempts to AuditEvents
        List<AuditEvent> events = attempts.stream()
                .map(FixedAuditApp::createAuditEvent)
                .toList();

        // Write all events in a single file session
        writeAuditEvents(events);
    }

    public static void main(String[] args) {
        try {
            run();
        } catch (IOException e) {
            System.err.println("Could not write audit log: " + e.getMessage());
            System.exit(1);
        }
    }
}