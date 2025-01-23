import com.example.movieseatingtask.Theater;

import java.util.Scanner;

/**
 * A simple console-based driver to test our Movie Theater system.
 * This class will let us:
 *  - Reserve seats
 *  - Cancel seats
 *  - View the seating chart
 *  - Exit
 */
public class Main {
    public static void main(String[] args) {
        // Create a Theater instance, which automatically sets up some seats
        Theater theater = new Theater();

        // We'll use a Scanner to read input from the console
        Scanner scanner = new Scanner(System.in);

        // We'll keep running until the user chooses to exit
        boolean running = true;

        while (running) {
            // Display a menu of options
            System.out.println("\n--- MOVIE THEATER MENU ---");
            System.out.println("1. Reserve a seat");
            System.out.println("2. Cancel reservation");
            System.out.println("3. View seating chart");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            // Read the user's choice
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline in the buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter Row (e.g. A, B, C): ");
                    String row = scanner.nextLine();
                    System.out.print("Enter Seat Number (e.g. 1-5): ");
                    int seatNumber = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    // Try to reserve the seat
                    boolean reserved = theater.reserveSeat(row, seatNumber);
                    if (reserved) {
                        System.out.println("Reservation successful for " + row + seatNumber);
                    } else {
                        System.out.println("Seat is already reserved or invalid seat.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Row (e.g. A, B, C): ");
                    String rowCancel = scanner.nextLine();
                    System.out.print("Enter Seat Number (e.g. 1-5): ");
                    int seatNumCancel = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    // Try to cancel the reservation
                    boolean canceled = theater.cancelSeat(rowCancel, seatNumCancel);
                    if (canceled) {
                        System.out.println("Cancellation successful for " + rowCancel + seatNumCancel);
                    } else {
                        System.out.println("Seat was not reserved or invalid seat.");
                    }
                    break;

                case 3:
                    // Print the entire seating chart
                    System.out.println("--- Seating Chart ---");
                    System.out.print(theater.getSeatingChart());
                    break;

                case 4:
                    // Exit the program
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        // Close the scanner to free up resources
        scanner.close();
    }
}
