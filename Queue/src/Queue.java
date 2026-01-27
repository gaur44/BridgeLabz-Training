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
    // if queue is full
    public void enqueue(int data) {
        if (end >= arr.length) {
            System.err.println("Error: Cannot enqueue queue is full");
            return;
        }
        System.out.println("Enqueued: " + data);
        arr[end++] = data;
    }

    public void dequeue() {
        if (end == 0) {
            System.err.println("Error: Cannot dequeue queue is empty");
            return;
        }
        System.out.println("Dequeue: " + arr[start++]);
    }

    public void peek() {
        if (end == 0) {
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