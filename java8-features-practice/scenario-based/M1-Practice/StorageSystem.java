import java.util.*;

public class StorageSystem {

    static class Version {
        String name;
        int size;

        Version(String name, int size) {
            this.name = name;
            this.size = size;
        }
    }

    static class FileData {
        Map<String, Version> versions = new HashMap<>();
        List<Version> uploadOrder = new ArrayList<>();
    }

    private static Map<String, FileData> storage = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");

            String operation = parts[0];

            if (operation.equals("UPLOAD")) {
                upload(parts[1], parts[2], Integer.parseInt(parts[3]));
            } else if (operation.equals("FETCH")) {
                fetch(parts[1]);
            } else if (operation.equals("LATEST")) {
                latest(parts[1]);
            } else if (operation.equals("TOTAL_STORAGE")) {
                totalStorage(parts[1]);
            }
        }

        sc.close();
    }

    private static void upload(String fileName, String versionName, int size) {
        storage.putIfAbsent(fileName, new FileData());
        FileData file = storage.get(fileName);

        if (file.versions.containsKey(versionName)) {
            return;
        }

        Version v = new Version(versionName, size);
        file.versions.put(versionName, v);
        file.uploadOrder.add(v);
    }

    private static void fetch(String fileName) {
        if (!storage.containsKey(fileName)) {
            System.out.println("File Not Found");
            return;
        }

        FileData file = storage.get(fileName);
        List<Version> list = new ArrayList<>(file.versions.values());

        Collections.sort(list, new Comparator<Version>() {
            public int compare(Version a, Version b) {
                if (a.size != b.size) {
                    return a.size - b.size;
                }
                return a.name.compareTo(b.name);
            }
        });

        for (Version v : list) {
            System.out.println(fileName + " " + v.name + " " + v.size);
        }
    }

    private static void latest(String fileName) {
        if (!storage.containsKey(fileName)) {
            System.out.println("File Not Found");
            return;
        }

        FileData file = storage.get(fileName);

        if (file.uploadOrder.isEmpty()) {
            System.out.println("File Not Found");
            return;
        }

        Version v = file.uploadOrder.get(file.uploadOrder.size() - 1);
        System.out.println(fileName + " " + v.name + " " + v.size);
    }

    private static void totalStorage(String fileName) {
        if (!storage.containsKey(fileName)) {
            System.out.println("File Not Found");
            return;
        }

        FileData file = storage.get(fileName);
        int sum = 0;

        for (Version v : file.versions.values()) {
            sum += v.size;
        }

        System.out.println(fileName + " " + sum);
    }
}
