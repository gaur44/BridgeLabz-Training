package fileprocessor;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileProcessor {

    public void writeToFile(String filename, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
        }
    }

    public String readFromFile(String filename) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filename)));
    }

    public boolean fileExists(String filename) {
        return new File(filename).exists();
    }
}