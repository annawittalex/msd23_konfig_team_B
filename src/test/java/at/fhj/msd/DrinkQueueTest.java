package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;


import java.util.NoSuchElementException;

public class DrinkQueueTest {

    @Test
    public void testPeek() {
        DrinkQueue dq = new DrinkQueue();
        Drink drink = new Drink("Coke");
        dq.offer(drink);
        assertEquals(drink, dq.peek());
    }

    @Test
    public void testSize() {
        DrinkQueue dq = new DrinkQueue();
        assertEquals(0, dq.size());
        dq.offer(new Drink("Coke"));
        assertEquals(1, dq.size());
    }

    @Test
    public void testIsEmpty() {
        DrinkQueue dq = new DrinkQueue();
        assertTrue(dq.isEmpty());
        dq.offer(new Drink("Coke"));
        assertFalse(dq.isEmpty());
    }

    @Test
    public void testOffer() {
        DrinkQueue dq = new DrinkQueue();
        Drink drink = new Drink("Coke");
        assertTrue(dq.offer(drink));
        assertEquals(drink, dq.peek());
    }

    @Test
    public void testPoll() {
        DrinkQueue dq = new DrinkQueue();
        Drink drink = new Drink("Coke");
        dq.offer(drink);
        assertEquals(drink, dq.poll());
        assertNull(dq.poll());
    }

    @Test
    public void testRemove() {
        DrinkQueue dq = new DrinkQueue();
        Drink drink = new Drink("Coke");
        dq.offer(drink);
        assertEquals(drink, dq.remove());
        assertThrows(NoSuchElementException.class, () -> dq.remove());
    }

    @Test
    public void testElement() {
        DrinkQueue dq = new DrinkQueue();
        Drink drink = new Drink("Coke");
        dq.offer(drink);
        assertEquals(drink, dq.element());
        dq.poll();
        assertThrows(NoSuchElementException.class, () -> dq.element());
    }

}
