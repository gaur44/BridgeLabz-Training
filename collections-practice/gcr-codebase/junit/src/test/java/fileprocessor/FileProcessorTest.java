package fileprocessor;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

public class FileProcessorTest {

    private final String testFile = "test.txt";

    @AfterEach
    public void cleanup() {
        new File(testFile).delete(); // Clean up after each test
    }

    @Test
    public void testWriteAndRead() throws IOException {
        FileProcessor processor = new FileProcessor();
        String content = "Hello, JUnit!";

        processor.writeToFile(testFile, content);
        String readContent = processor.readFromFile(testFile);

        assertEquals(content, readContent);
    }

    @Test
    public void testFileExists() throws IOException {
        FileProcessor processor = new FileProcessor();

        processor.writeToFile(testFile, "Test content");
        assertTrue(processor.fileExists(testFile));
    }

    @Test
    public void testReadNonExistentFile() {
        FileProcessor processor = new FileProcessor();

        assertThrows(IOException.class, () -> {
            processor.readFromFile("nonexistent.txt");
        });
    }
}