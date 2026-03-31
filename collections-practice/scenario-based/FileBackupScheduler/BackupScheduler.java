import java.util.PriorityQueue;

public class BackupScheduler {

    PriorityQueue<BackupTask> queue = new PriorityQueue<>();

    public void addTask(BackupTask task) throws InvalidBackupPathException {
        if (task.path == null || task.path.isEmpty()) {
            throw new InvalidBackupPathException("Invalid backup path");
        }
        queue.add(task);
    }

    public void executeBackups() {
        while (!queue.isEmpty()) {
            BackupTask task = queue.poll();
            System.out.println("Backing up: " + task.path +
                               " | Priority: " + task.priority);
        }
    }
}
