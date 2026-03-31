class Ticket {
    String id;
    double price;
    
    public Ticket(String id, double price) {
        this.id = id;
        this.price = price;
    }
}

class EventManager {
    private Ticket[] tickets;
    private int count;
    
    public EventManager(int capacity) {
        tickets = new Ticket[capacity];
        count = 0;
    }
    
    public void addTicket(String id, double price) {
        tickets[count++] = new Ticket(id, price);
    }
    
    // quicksort implementation
    private void quickSort(int low, int high) {
        if(low < high) {
            int pi = partition(low, high);
            quickSort(low, pi - 1);
            quickSort(pi + 1, high);
        }
    }
    
    private int partition(int low, int high) {
        double pivot = tickets[high].price;
        int i = low - 1;
        
        for(int j = low; j < high; j++) {
            if(tickets[j].price < pivot) {
                i++;
                Ticket temp = tickets[i];
                tickets[i] = tickets[j];
                tickets[j] = temp;
            }
        }
        Ticket temp = tickets[i + 1];
        tickets[i + 1] = tickets[high];
        tickets[high] = temp;
        return i + 1;
    }
    
    public void sortByPrice() {
        quickSort(0, count - 1);
        System.out.println("Tickets sorted by price");
    }
    
    public void showTop(int n) {
        System.out.println("\nTop " + n + " cheapest tickets:");
        for(int i = 0; i < n && i < count; i++) {
            System.out.println(tickets[i].id + " - Rs." + tickets[i].price);
        }
    }
    
    public static void main(String[] args) {
        EventManager manager = new EventManager(10);
        
        manager.addTicket("T1", 1500);
        manager.addTicket("T2", 800);
        manager.addTicket("T3", 2000);
        manager.addTicket("T4", 500);
        manager.addTicket("T5", 1200);
        
        manager.sortByPrice();
        manager.showTop(3);
    }
}