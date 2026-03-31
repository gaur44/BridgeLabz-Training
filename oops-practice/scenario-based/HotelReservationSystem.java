class RoomNotAvailableException extends Exception {
    public RoomNotAvailableException(String msg) {
        super(msg);
    }
}

interface PricingStrategy {
    double getPrice(double base, int days);
}

class NormalPricing implements PricingStrategy {
    public double getPrice(double base, int days) {
        return base * days;
    }
}

class SeasonalPricing implements PricingStrategy {
    public double getPrice(double base, int days) {
        return base * days * 1.5;
    }
}

class Room {
    protected String no;
    protected double price;
    protected boolean free;
    
    public Room(String no, double price) {
        this.no = no;
        this.price = price;
        this.free = true;
    }
}

class StandardRoom extends Room {
    public StandardRoom(String no) {
        super(no, 1000);
    }
}

class DeluxeRoom extends Room {
    public DeluxeRoom(String no) {
        super(no, 2500);
    }
}

class Guest {
    String name;
    
    public Guest(String name) {
        this.name = name;
    }
}

class Reservation {
    private Room room;
    private double bill;
    
    public Reservation(Room room, int days, PricingStrategy pricing) {
        this.room = room;
        this.bill = pricing.getPrice(room.price, days);
    }
    
    public void checkIn(Guest g) {
        System.out.println(g.name + " checked in to " + room.no);
    }
    
    public void checkOut() {
        room.free = true;
        System.out.println("Bill: Rs." + bill);
    }
}

class Hotel {
    private Room[] rooms = new Room[10];
    private int count = 0;
    
    public void addRoom(Room r) {
        rooms[count++] = r;
    }
    
    public Reservation book(String type, int days, PricingStrategy pricing) throws RoomNotAvailableException {
        for(int i = 0; i < count; i++) {
            if(rooms[i].free && 
               ((type.equals("deluxe") && rooms[i] instanceof DeluxeRoom) ||
                (type.equals("standard") && rooms[i] instanceof StandardRoom))) {
                rooms[i].free = false;
                return new Reservation(rooms[i], days, pricing);
            }
        }
        throw new RoomNotAvailableException("No room available");
    }
}

public class HotelReservationSystem {
    public static void main(String[] args) {
        Hotel h = new Hotel();
        h.addRoom(new StandardRoom("101"));
        h.addRoom(new DeluxeRoom("201"));
        
        Guest g = new Guest("Neha");
        
        try {
            Reservation r = h.book("deluxe", 3, new SeasonalPricing());
            r.checkIn(g);
            r.checkOut();
        } catch(RoomNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}