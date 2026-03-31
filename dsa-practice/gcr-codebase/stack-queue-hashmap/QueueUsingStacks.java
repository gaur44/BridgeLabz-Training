// Implement a queue using two stacks
import java.util.Stack;

public class QueueUsingStacks {
    private Stack<Integer> inboxStack;
    private Stack<Integer> outboxStack;

    public QueueUsingStacks() {
        inboxStack = new Stack<>();
        outboxStack = new Stack<>();
    }

    public void enqueue(int data) {
        inboxStack.push(data);
    }

    private void populateOutbox() {
        if (outboxStack.isEmpty()) {
            while (!inboxStack.isEmpty()) {
                outboxStack.push(inboxStack.pop());
            }
        }
    }

    public int dequeue() {
        if (inboxStack.isEmpty() && outboxStack.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        if (outboxStack.isEmpty()) {
            populateOutbox();
        }
        return outboxStack.pop();
    }

    public int peek() {
        if (inboxStack.isEmpty() && outboxStack.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        if (outboxStack.isEmpty()) {
            populateOutbox();
        }
        return outboxStack.peek();
    }

    public int size() {
        return inboxStack.size() + outboxStack.size();
    }

    public boolean isEmpty() {
        return inboxStack.isEmpty() && outboxStack.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();

        System.out.println("Adding 1, 2, 3 to queue");
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Front element: " + queue.peek());
        System.out.println("Removing: " + queue.dequeue());
        System.out.println("Removing: " + queue.dequeue());

        System.out.println("\nAdding 4, 5 to queue");
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("\nRemoving all elements:");
        while (!queue.isEmpty()) {
            System.out.println("Removed: " + queue.dequeue());
        }
    }
}
