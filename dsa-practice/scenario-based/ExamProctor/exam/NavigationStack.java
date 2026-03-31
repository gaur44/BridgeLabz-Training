package exam;

class NavigationStack {
    private int[] stack = new int[10];
    private int top = -1;

    void visitQuestion(int qid) {
        if (top < stack.length - 1)
            stack[++top] = qid;
    }

    int lastVisited() {
        if (top == -1)
            return -1;
        return stack[top--];
    }
}

