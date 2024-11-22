import java.util.ArrayList;
import java.util.Scanner;

public class TicketReservationSystem {
    private static ArrayList<Ticket> tickets = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n1. Book a Ticket");
            System.out.println("2. View All Tickets");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline

            switch (choice) {
                case 1:
                    bookTicket();
                    break;
                case 2:
                    viewAllTickets();
                    break;
                case 3:
                    System.out.println("Thank you for using the Ticket Reservation System!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 3);
    }

    private static void bookTicket() {
        System.out.print("Enter passenger name: ");
        String name = scanner.nextLine();

        System.out.print("Enter base fare: ");
        double baseFare = scanner.nextDouble();

        System.out.println("Select Class:");
        System.out.println("1. Economy");
        System.out.println("2. Business");
        System.out.println("3. First Class");
        System.out.print("Your choice: ");
        int classChoice = scanner.nextInt();

        Ticket ticket = null;
        switch (classChoice) {
            case 1:
                ticket = new EconomyTicket(name, baseFare);
                break;
            case 2:
                ticket = new BusinessTicket(name, baseFare);
                break;
            case 3:
                ticket = new FirstClassTicket(name, baseFare);
                break;
            default:
                System.out.println("Invalid class choice!");
                return;
        }

        tickets.add(ticket);
        System.out.println("Ticket booked successfully!");
    }

    private static void viewAllTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No tickets booked yet!");
        } else {
            for (Ticket ticket : tickets) {
                System.out.println("-------------------------------");
                System.out.println("Passenger: " + ticket.getPassengerName());
                System.out.println(ticket.getDetails());
                System.out.println("Base Fare: " + ticket.baseFare);
                System.out.println("Final Fare: " + ticket.calculateFare());
            }
            System.out.println("-------------------------------");
        }
    }
}
