package browser;

class TabHistory {
    private Page current;

    void visit(String url) {
        Page p = new Page(url);
        if (current != null) {
            current.next = null;
            p.prev = current;
            current.next = p;
        }
        current = p;
    }

    void back() {
        if (current != null && current.prev != null)
            current = current.prev;
    }

    void forward() {
        if (current != null && current.next != null)
            current = current.next;
    }

    String getCurrent() {
        return current == null ? "No page" : current.url;
    }
}

