package browser;

public class Main {
    public static void main(String[] args) {

        TabHistory tab = new TabHistory();
        ClosedTabs closed = new ClosedTabs();

        tab.visit("google.com");
        tab.visit("github.com");
        tab.visit("stackoverflow.com");

        tab.back();
        System.out.println(tab.getCurrent());

        closed.close(tab.getCurrent());
        String reopened = closed.reopen();
        if (reopened != null)
            tab.visit(reopened);

        System.out.println(tab.getCurrent());
    }
}

