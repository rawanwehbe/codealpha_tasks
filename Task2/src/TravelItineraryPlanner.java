import java.util.Scanner;

public class TravelItineraryPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TravelItinerary travelItinerary = new TravelItinerary(scanner);

        while (true) {
            System.out.println("1. Add Destination");
            System.out.println("2. View Itinerary");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    travelItinerary.addDestination();
                    break;
                case 2:
                    travelItinerary.generateItinerary();
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}