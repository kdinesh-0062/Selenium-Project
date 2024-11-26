package FirstSelenium;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class EventManagement {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Create a HashSet to track unique attendees
        Set<String> uniqueAttendees = new HashSet<>();
        
        // Create a List to store activities and their attendees
        List<String> activities = new ArrayList<>();
        
        // Variable to store input activity
        String activity;
        
        // Collect activity names and attendees
        while (true) {
            System.out.println("Enter activity name (or type 'done' to finish):");
            activity = scanner.nextLine();
            
            if (activity.equalsIgnoreCase("done")) {
                break; // Exit the loop if user types 'done'
            }
            
            activities.add(activity); // Add activity to the list
            
            // Collect attendees for the current activity
            System.out.println("Enter attendees for " + activity + " (type 'done' when finished):");
            while (true) {
                String attendee = scanner.nextLine();
                
                if (attendee.equalsIgnoreCase("done")) {
                    break; // Exit the loop if user types 'done'
                }
                
                uniqueAttendees.add(attendee); // Add attendee to the HashSet
            }
        }
        
        // Close the Scanner
        scanner.close();
        
        // Display activities
        System.out.println("\nActivities:");
        for (String act : activities) {
            System.out.println(act);
        }
        
        // Display unique attendees
        System.out.println("\nUnique attendees:");
        for (String attendee : uniqueAttendees) {
            System.out.println(attendee);
        }
    }
}
