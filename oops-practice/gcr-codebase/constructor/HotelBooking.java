public class HotelBooking {
    String guestName;
    String roomType;
    int numNights;

    public HotelBooking() {
        this.guestName = "Guest";
        this.roomType = "Standard";
        this.numNights = 1;
    }

    // Parameterized
    public HotelBooking(String guestName, String roomType, int numNights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.numNights = numNights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.numNights = other.numNights;
    }

    // display booking details
    public void displayBooking() {
        System.out.println("Guest: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + numNights);
        System.out.println();
    }

    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking();
        booking1.displayBooking();

        HotelBooking booking2 = new HotelBooking("Rohan", "Deluxe", 3);
        booking2.displayBooking();

        HotelBooking booking3 = new HotelBooking(booking2);
        booking3.displayBooking();
    }
}
