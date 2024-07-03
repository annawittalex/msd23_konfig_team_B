package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DrinkQueueTest {

    private DrinkQueue drinkQueue;
    private Drink vodka;

    @BeforeEach
    public void setUp() {
        drinkQueue = new DrinkQueue();
        // Erstellen eines konkreten Drinks, z.B. SimpleDrink
        vodka = new SimpleDrink("Vodka Shot", new Liquid("Vodka", 0.5, 40.0));
    }

    @Test
    public void testOfferAndPoll() {
        drinkQueue.offer(vodka);
        assertEquals(1, drinkQueue.size());
        assertEquals(vodka, drinkQueue.poll());
        assertTrue(drinkQueue.isEmpty());
    }
}
