package MiniProjects.HotelManagementSystem;

class Room {
    private int roomNumber;
    private double price;
    private boolean isOccupied;
    private Guest occupant; // Details of the guest occupying the room

    public Room(int roomNumber, double price) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.isOccupied = false;
        this.occupant = null; // Initially, no one is occupying the room
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public Guest getOccupant() {
        return occupant;
    }

    public void bookRoom(Guest guest) {
        isOccupied = true;
        occupant = guest; // Set the guest details for the occupied room
        System.out.println("Room " + roomNumber + " has been booked by " + guest.getName());
    }

    public void checkOut() {
        isOccupied = false;
        occupant = null; // Clear the guest details on check-out
        System.out.println("Room " + roomNumber + " has been checked out.");
    }
}
