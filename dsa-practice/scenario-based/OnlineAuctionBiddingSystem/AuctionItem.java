import java.util.*;

public class AuctionItem {

    String itemName;

    TreeMap<Integer, User> bids = new TreeMap<>();

    public AuctionItem(String itemName) {
        this.itemName = itemName;
    }

    public void placeBid(Bid bid) throws InvalidBidException {

        if (!bids.isEmpty() && bid.amount <= bids.lastKey()) {
            throw new InvalidBidException("Bid must be higher than current highest");
        }

        bids.put(bid.amount, bid.user);
    }

    public void showHighest() {
        if (bids.isEmpty()) {
            System.out.println("No bids yet");
            return;
        }

        int amount = bids.lastKey();
        User user = bids.get(amount);

        System.out.println("Highest: " + user + " -> " + amount);
    }
}
