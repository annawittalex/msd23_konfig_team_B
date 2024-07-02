package at.fhj.msd;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleDrinkTest {
    private SimpleDrink simpleDrink;
    private Liquid liquid;

    @Before
    public void setUp() {
        liquid = new Liquid("Whiskey", 0.5, 40);
        simpleDrink = new SimpleDrink("Whiskey", liquid);
    }

    @Test
    public void testGetVolume() {
        assertEquals(0.5, simpleDrink.getVolume(), 0.01);
    }

    @Test
    public void testGetAlcoholPercent() {
        assertEquals(40, simpleDrink.getAlcoholPercent(), 0.01);
    }

    @Test
    public void testIsAlcoholic() {
        assertTrue(simpleDrink.isAlcoholic());
    }

    @Test
    public void testGetName() {
        assertEquals("Whiskey", simpleDrink.getName());
    }

    @Test
    public void testSetName() {
        simpleDrink.setName("New Whiskey");
        assertEquals("New Whiskey", simpleDrink.getName());
    }
}

