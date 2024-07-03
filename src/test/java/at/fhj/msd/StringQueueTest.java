package at.fhj.msd;

import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class StringQueueTest {
    private StringQueue queue;

    @Before
    public void setUp() {

        queue = new StringQueue(5);
    }

    @Test
    public void testOffer() {
        assertTrue(queue.offer("one"));
        assertTrue(queue.offer("two"));
        assertTrue(queue.offer("three"));
        assertTrue(queue.offer("four"));
        assertTrue(queue.offer("five"));
        assertFalse(queue.offer("six"));
    }

    @Test
    public void testPoll() {
        queue.offer("one");
        queue.offer("two");
        assertEquals("one", queue.poll());
        assertEquals("two", queue.poll());
        assertNull(queue.poll());
    }

    @Test
    public void testRemove() {
        queue.offer("one");
        queue.offer("two");
        assertEquals("one", queue.remove());
        assertEquals("two", queue.remove());

        try {
            queue.remove();
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {

        }
    }

    @Test
    public void testPeek() {
        assertNull(queue.peek());
        queue.offer("one");
        assertEquals("one", queue.peek());
        queue.offer("two");
        assertEquals("one", queue.peek());
    }

    @Test
    public void testElement() {
        queue.offer("one");
        assertEquals("one", queue.element());

        queue.poll();
        try {
            queue.element();
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {

        }
    }
}
