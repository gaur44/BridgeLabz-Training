public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        // Enqueue operations
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        // Show
        queue.display();

        // Dequeue
        queue.dequeue();

        queue.peek();

        queue.dequeue();

        queue.display();
    }
}