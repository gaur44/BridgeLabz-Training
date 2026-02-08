package library;

interface Observer {
    void update(String message);
}

public interface User extends Observer {
    void showRole();
    String getName();
}
