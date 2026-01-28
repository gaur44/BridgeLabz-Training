public class Main {
    public static void main(String[] args) {

        BackupScheduler scheduler = new BackupScheduler();

        try {
            scheduler.addTask(new BackupTask("home", 2));
            scheduler.addTask(new BackupTask("system", 5));   // critical
            scheduler.addTask(new BackupTask("logs", 3));
            scheduler.addTask(new BackupTask("", 1));       // error

        } catch (InvalidBackupPathException e) {
            System.out.println(e.getMessage());
        }

        scheduler.executeBackups();
    }
}
