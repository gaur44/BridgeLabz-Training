public class Main {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();

        restaurant.addTable(new Table(1, 4));
        restaurant.addTable(new Table(2, 2));
        restaurant.addTable(new Table(3, 6));

        try {
            restaurant.reserveTable(1, "7-8 PM", "Alice");
            restaurant.reserveTable(2, "7-8 PM", "Bob");

            // This will throw exception
            restaurant.reserveTable(1, "7-8 PM", "Charlie");

        } catch (TableAlreadyReservedException e) {
            System.out.println(e.getMessage());
        }

        restaurant.showAvailableTables("7-8 PM");

        restaurant.cancelReservation(1, "7-8 PM");

        restaurant.showAvailableTables("7-8 PM");
    }
}

