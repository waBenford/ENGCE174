package javaLab4.lab4_15;
import java.util.Scanner;

class AuditRecord {
    private final String user;
    private final String[] logMessages;
    private static int maxMessages = 3;

    public AuditRecord(String user) {
        this(user, new String[0]);
    }

    public AuditRecord(String user, String[] logs) {
        this.user = user;
        int count = Math.min(logs.length, maxMessages);
        this.logMessages = new String[count];
        for (int i = 0; i < count; i++) {
            this.logMessages[i] = logs[logs.length - count + i];
        }
    }

    public static void setPolicy(int max) {
        if (max > 0) {
            maxMessages = max;
            System.out.println("Policy set to " + max);
        } else {
            System.out.println("Invalid policy.");
        }
    }

    public AuditRecord addMessage(String message) {
        if (logMessages.length < maxMessages) {
            String[] newLogs = new String[logMessages.length + 1];
            for (int i = 0; i < logMessages.length; i++) {
                newLogs[i] = logMessages[i];
            }
            newLogs[logMessages.length] = message;
            System.out.println(message + " added.");
            return new AuditRecord(this.user, newLogs);
        } else {
            System.out.println("Log is full.");
            return this;
        }
    }

    public void displayLog() {
        System.out.print("User: " + user + ", Logs: " + logMessages.length + " [");
        for (int i = 0; i < logMessages.length; i++) {
            System.out.print(logMessages[i] + (i == logMessages.length - 1 ? "" : ", "));
        }
        System.out.println("]");
    }
}

public class Lab4_15 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        System.out.println( "Max:" );
        int initialMax = getValue.nextInt();
        AuditRecord.setPolicy(initialMax);

        String userName = getValue.next();
        AuditRecord record = new AuditRecord(userName);

        int n = getValue.nextInt();
        for (int i = 0; i < n; i++) {
            String cmd = getValue.next();
            if (cmd.equals("SET_POLICY")) {
                int newMax = getValue.nextInt();
                AuditRecord.setPolicy(newMax);
            } else {
                record = record.addMessage(cmd);
            }
        }

        record.displayLog();
        getValue.close();
    }
}