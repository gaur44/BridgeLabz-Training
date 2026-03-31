public class BackupApp {
    public static void main(String[] args) {

        User user = new User("Alice");
        LogFile log = new LogFile("app.log");

        processBackup(user);
        processBackup(log);
    }

    static void processBackup(Object obj) {
        if (obj instanceof BackupSerializable) {
            System.out.println("Backing up: " + obj.getClass().getSimpleName());
        } else {
            System.out.println("Object not eligible for backup");
        }
    }
}
