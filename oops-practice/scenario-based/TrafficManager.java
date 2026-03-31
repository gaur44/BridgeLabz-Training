class QueueOverflowException extends Exception {
    public QueueOverflowException(String msg) {
        super(msg);
    }
}

class Vehicle {
    String id;
    Vehicle next;
    
    public Vehicle(String id) {
        this.id = id;
    }
}

class Roundabout {
    private Vehicle head;
    
    public void add(String id) {
        Vehicle v = new Vehicle(id);
        if(head == null) {
            head = v;
            head.next = head;
        } else {
            Vehicle temp = head;
            while(temp.next != head) temp = temp.next;
            temp.next = v;
            v.next = head;
        }
        System.out.println(id + " entered");
    }
    
    public void remove(String id) {
        if(head == null) return;
        
        if(head.id.equals(id) && head.next == head) {
            head = null;
            System.out.println(id + " exited");
            return;
        }
        
        Vehicle curr = head, prev = null;
        do {
            if(curr.id.equals(id)) {
                if(curr == head) {
                    Vehicle temp = head;
                    while(temp.next != head) temp = temp.next;
                    head = head.next;
                    temp.next = head;
                } else {
                    prev.next = curr.next;
                }
                System.out.println(id + " exited");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while(curr != head);
    }
    
    public void display() {
        if(head == null) {
            System.out.println("Empty");
            return;
        }
        Vehicle temp = head;
        System.out.print("State: ");
        do {
            System.out.print(temp.id + " ");
            temp = temp.next;
        } while(temp != head);
        System.out.println();
    }
}

class WaitQueue {
    private String[] q;
    private int front = 0, rear = -1, size = 0, cap;
    
    public WaitQueue(int cap) {
        this.cap = cap;
        q = new String[cap];
    }
    
    public void add(String id) throws QueueOverflowException {
        if(size == cap) throw new QueueOverflowException("Queue full");
        rear = (rear + 1) % cap;
        q[rear] = id;
        size++;
    }
    
    public String remove() {
        if(size == 0) return null;
        String id = q[front];
        front = (front + 1) % cap;
        size--;
        return id;
    }
}

class TrafficManager {
    public static void main(String[] args) {
        Roundabout r = new Roundabout();
        WaitQueue wq = new WaitQueue(3);
        
        try {
            wq.add("C1");
            wq.add("C2");
            
            r.add(wq.remove());
            r.add(wq.remove());
            r.add("C3");
            r.display();
            
            r.remove("C1");
            r.display();
            
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}