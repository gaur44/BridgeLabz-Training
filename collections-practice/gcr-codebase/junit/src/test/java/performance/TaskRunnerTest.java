package performance;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.TimeUnit;

public class TaskRunnerTest {

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    public void testLongRunningTaskFails() {
        TaskRunner runner = new TaskRunner();
        runner.longRunningTask();
    }

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    public void testQuickTaskPasses() {
        TaskRunner runner = new TaskRunner();
        String result = runner.quickTask();
        assertEquals("Task completed", result);
    }
}