package browser;

class ClosedTabs {
    private String[] stack = new String[5];
    private int top = -1;

    void close(String url) {
        if (top < stack.length - 1)
            stack[++top] = url;
    }

    String reopen() {
        if (top == -1)
            return null;
        return stack[top--];
    }
}

