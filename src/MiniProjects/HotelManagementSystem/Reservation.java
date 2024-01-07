package MiniProjects.HotelManagementSystem;
import java.util.*;
class Reservation {
    private Guest guest;
    private Room room;
    private Date checkInDate;
    private Date checkOutDate;

    public Reservation(Guest guest, Room room, Date checkInDate, Date checkOutDate) {
        this.guest = guest;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public double calculateTotalBill() {
        // Dummy calculation for total bill (assuming each day has a constant price)
        long diffInMillies = Math.abs(checkOutDate.getTime() - checkInDate.getTime());
        long diffInDays = diffInMillies / (24 * 60 * 60 * 1000);
        return room.getPrice() * diffInDays;
    }

    @Override
    public String toString() {
        return "Reservation Details: " + guest.getName() + " booked Room " + room.getRoomNumber() +
                " from " + checkInDate + " to " + checkOutDate;
    }
}
