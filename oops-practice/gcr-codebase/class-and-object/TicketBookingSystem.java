public class TicketBookingSystem {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket();
        movieTicket.bookTicket("Dragon", 45, 120);
        movieTicket.showTicketDetails();
    }
}

class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    // method to book a ticket
    public void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // display ticket details
    public void showTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: " + price);
    }
}