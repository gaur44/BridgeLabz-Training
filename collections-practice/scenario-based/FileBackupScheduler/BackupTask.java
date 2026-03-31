public class BackupTask implements Comparable<BackupTask> {
    String path;
    int priority;

    public BackupTask(String path, int priority) {
        this.path = path;
        this.priority = priority;
    }

    @Override
    public int compareTo(BackupTask other) {
        return Integer.compare(other.priority, this.priority); // higher first
    }
}
