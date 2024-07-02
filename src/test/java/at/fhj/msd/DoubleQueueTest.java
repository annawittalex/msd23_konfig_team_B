package at.fhj.msd;

import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;
public class DoubleQueueTest {
    private DoubleQueue queue;

    @Before
    public void setUp() {
        queue = new DoubleQueue();
    }

    @Test
    public void testOffer() {
        assertTrue(queue.offer(1.1));
        assertTrue(queue.offer(2.2));
        assertTrue(queue.offer(3.3));
    }

    @Test
    public void testPoll() {
        queue.offer(1.1);
        queue.offer(2.2);
        assertEquals(Double.valueOf(1.1), queue.poll());
        assertEquals(Double.valueOf(2.2), queue.poll());
        assertNull(queue.poll());
    }

    @Test
    public void testRemove() {
        queue.offer(1.1);
        queue.offer(2.2);
        assertEquals(Double.valueOf(1.1), queue.remove());
        assertEquals(Double.valueOf(2.2), queue.remove());

        try {
            queue.remove();
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            // expected exception
        }
    }

    @Test
    public void testPeek() {
        assertNull(queue.peek());
        queue.offer(1.1);
        assertEquals(Double.valueOf(1.1), queue.peek());
        queue.offer(2.2);
        assertEquals(Double.valueOf(1.1), queue.peek());
    }

    @Test
    public void testElement() {
        queue.offer(1.1);
        assertEquals(Double.valueOf(1.1), queue.element());

        queue.poll();
        try {
            queue.element();
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            // expected exception
        }
    }

    @Test
    public void testSize() {
        assertEquals(0, queue.size());
        queue.offer(1.1);
        assertEquals(1, queue.size());
        queue.offer(2.2);
        assertEquals(2, queue.size());
        queue.poll();
        assertEquals(1, queue.size());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(queue.isEmpty());
        queue.offer(1.1);
        assertFalse(queue.isEmpty());
        queue.poll();
        assertTrue(queue.isEmpty());
    }
}
