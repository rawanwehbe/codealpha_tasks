import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TravelItinerary {
    private List<Destination> destinations;
    private Scanner scanner;

    public TravelItinerary(Scanner scanner) {
        this.destinations = new ArrayList<>();
        this.scanner = scanner;
    }

    public void addDestination() {
            System.out.print("Enter destination name: ");
            String name = scanner.nextLine();

            System.out.print("Enter date (yyyy-MM-dd): ");
            String dateStr = scanner.nextLine();
            Date date = parseDate(dateStr);

            System.out.print("Enter preferences: ");
            String preferences = scanner.nextLine();

            Destination destination = new Destination(name, date, preferences);
            destinations.add(destination);
            System.out.println("Destination added successfully!");
    }
    private static Date parseDate(String dateStr) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            return dateFormat.parse(dateStr);
        } catch (Exception e) {
            System.out.println("Please enter a valid date format (yyyy-MM-dd).");
            return null;
        }
    }
    public void generateItinerary() {
        if (destinations.isEmpty()) {
            System.out.println("No destinations added.");
            return;
        }
        System.out.println("Travel Itinerary:");
        for (Destination destination : destinations) {
            System.out.println("Destination: " + destination.getName());
            System.out.println("Date: " + destination.getDate());
            System.out.println("Preferences: " + destination.getPreferences());
            System.out.println("------------");
        }
    }
}
