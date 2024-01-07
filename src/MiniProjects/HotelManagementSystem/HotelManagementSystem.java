package MiniProjects.HotelManagementSystem;
import java.util.*;

public class HotelManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Room> rooms = createRooms(); // Create some rooms

        int choice;
        do {
            System.out.println("----- Hotel Management System Menu -----");
            System.out.println("1. Book a Room");
            System.out.println("2. Check Out");
            System.out.println("3. Display Rooms");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    bookRoom(rooms, scanner);
                    break;
                case 2:
                    checkOut(rooms, scanner);
                    break;
                case 3:
                    displayRooms(rooms);
                    break;
                case 4:
                    System.out.println("Exiting the system. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 4);

        scanner.close();
    }

    // Create some sample rooms
    private static List<Room> createRooms() {
        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room(101, 100.0));
        rooms.add(new Room(102, 150.0));
        rooms.add(new Room(103, 120.0));
        return rooms;
    }

    private static void bookRoom(List<Room> rooms, Scanner scanner) {
        System.out.println("Available Rooms:");
        displayRooms(rooms);

        System.out.print("Enter Room Number to book: ");
        int roomNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        Room roomToBook = findRoomByNumber(rooms, roomNumber);
        if (roomToBook != null && !roomToBook.isOccupied()) {
            System.out.print("Enter guest name: ");
            String guestName = scanner.nextLine();
            System.out.print("Enter guest phone number: ");
            String guestPhone = scanner.nextLine();
            System.out.print("Enter guest email: ");
            String guestEmail = scanner.nextLine();

            Guest guest = new Guest(guestName, guestPhone, guestEmail);
            roomToBook.bookRoom(guest);
        } else {
            System.out.println("Room " + roomNumber + " is not available or already occupied.");
        }
    }

    private static void checkOut(List<Room> rooms, Scanner scanner) {
        System.out.print("Enter Room Number to check out: ");
        int roomNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        Room roomToCheckOut = findRoomByNumber(rooms, roomNumber);
        if (roomToCheckOut != null && roomToCheckOut.isOccupied()) {
            roomToCheckOut.checkOut();
        } else {
            System.out.println("Room " + roomNumber + " is not occupied.");
        }
    }

    private static void displayRooms(List<Room> rooms) {
        for (Room room : rooms) {
            String status = room.isOccupied() ? "Occupied" : "Available";
            System.out.println("Room " + room.getRoomNumber() + " | Status: " + status);
            if (room.isOccupied()) {
                System.out.println("  Occupied by: " + room.getOccupant());
            }
        }
    }

    private static Room findRoomByNumber(List<Room> rooms, int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }
}