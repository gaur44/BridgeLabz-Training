package listmanager;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ListManagerTest {

    @Test
    public void testAddElement() {
        ListManager manager = new ListManager();
        List<Integer> list = new ArrayList<>();
        manager.addElement(list, 5);
        assertEquals(1, list.size());
        assertTrue(list.contains(5));
    }

    @Test
    public void testRemoveElement() {
        ListManager manager = new ListManager();
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        manager.removeElement(list, 10);
        assertEquals(1, list.size());
        assertFalse(list.contains(10));
    }

    @Test
    public void testGetSize() {
        ListManager manager = new ListManager();
        List<Integer> list = new ArrayList<>();
        assertEquals(0, manager.getSize(list));
        list.add(1);
        list.add(2);
        assertEquals(2, manager.getSize(list));
    }
}