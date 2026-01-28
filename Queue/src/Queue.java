public class Queue {
    int[] arr;
    int SIZE = 10;
    int start = 0;
    int end = 0;

    public Queue(int size) {
        arr = new int[size];
    }

    public Queue() {
        arr = new int[SIZE];
    }

    // Enqueue
    public void enqueue(int data) {
        if (end >= arr.length) {
            System.err.println("Error: Cannot enqueue, queue is full");
            return;
        }
        arr[end++] = data;
        System.out.println("Enqueued: " + data);
    }

    // Dequeue
    public void dequeue() {
        if (start == end) {
            System.err.println("Error: Cannot dequeue, queue is empty");
            return;
        }
        System.out.println("Dequeued: " + arr[start++]);

        // reset pointers when queue is empty
        if (start == end) {
            start = 0;
            end = 0;
        }
    }

    public void peek() {
        if (start == end) {
            System.err.println("Queue is empty");
            return;
        }
        System.out.println("Peek: " + arr[start]);
    }

    public void display() {
        System.out.print("Queue: ");
        for (int i = start; i < end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
