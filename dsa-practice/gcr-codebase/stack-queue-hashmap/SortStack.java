import java.util.Stack;

public class SortStack {
    public static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        // remove the top element
        int top = stack.pop();

        // sort the remaining stack
        sortStack(stack);

        insertInSortedOrder(stack, top);
    }

    public static void insertInSortedOrder(Stack<Integer> stack, int element) {
        // if stack is empty or element is greater than top
        if (stack.isEmpty() || element > stack.peek()) {
            stack.push(element);
            return;
        }

        int top = stack.pop();

        insertInSortedOrder(stack, element);

        // push back the removed element
        stack.push(top);
    }

    public static void printStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        Stack<Integer> temp = new Stack<>();
        System.out.print("Stack (top to bottom): ");

        // move elements to temp stack while printing
        while (!stack.isEmpty()) {
            int element = stack.pop();
            System.out.print(element + " ");
            temp.push(element);
        }
        System.out.println();

        // restore original stack
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // add elements to stack
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(8);
        stack.push(3);

        System.out.println("Original Stack:");
        printStack(stack);

        // sort the stack
        sortStack(stack);

        System.out.println();
        System.out.println("Sorted Stack (ascending order):");
        printStack(stack);
    }
}
