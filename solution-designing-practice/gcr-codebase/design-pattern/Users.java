package library;

class UserFactory {
    public static User createUser(String type, String name) {
        if (type == null || name == null)
            throw new IllegalArgumentException("type and name required");
        switch (type.toLowerCase()) {
            case "student":  return new Student(name);
            case "faculty":  return new Faculty(name);
            case "librarian": return new Librarian(name);
            case "guest":    return new Guest(name);
            default:         throw new IllegalArgumentException("unknown type: " + type);
        }
    }
}

class Student implements User {
    private final String name;
    public Student(String name) { this.name = name; }
    @Override public void showRole() { System.out.println(name + " is a Student."); }
    @Override public void update(String msg) { System.out.println(name + " notified: " + msg); }
    @Override public String getName() { return name; }
}

class Faculty implements User {
    private final String name;
    public Faculty(String name) { this.name = name; }
    @Override public void showRole() { System.out.println(name + " is a Faculty."); }
    @Override public void update(String msg) { System.out.println(name + " notified: " + msg); }
    @Override public String getName() { return name; }
}

class Librarian implements User {
    private final String name;
    public Librarian(String name) { this.name = name; }
    @Override public void showRole() { System.out.println(name + " is a Librarian."); }
    @Override public void update(String msg) { System.out.println(name + " notified: " + msg); }
    @Override public String getName() { return name; }
}

class Guest implements User {
    private final String name;
    public Guest(String name) { this.name = name; }
    @Override public void showRole() { System.out.println(name + " is a Guest."); }
    @Override public void update(String msg) { System.out.println(name + " notified: " + msg); }
    @Override public String getName() { return name; }
}
