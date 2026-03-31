public class Main {
    public static void main(String[] args) {

        AuctionItem item = new AuctionItem("iPhone");

        User u1 = new User(1, "Alice");
        User u2 = new User(2, "Bob");

        try {
            item.placeBid(new Bid(u1, 100));
            item.placeBid(new Bid(u2, 120));
            item.placeBid(new Bid(u1, 110));  // lower
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        item.showHighest();
    }
}
