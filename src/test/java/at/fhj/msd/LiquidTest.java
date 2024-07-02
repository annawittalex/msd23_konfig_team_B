package at.fhj.msd;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LiquidTest {
    private Liquid liquid;

    @Before
    public void setUp() {
        liquid = new Liquid("Whiskey", 0.5, 40);
    }

    @Test
    public void testGetName() {
        assertEquals("Whiskey", liquid.getName());
    }

    @Test
    public void testSetName() {
        liquid.setName("Vodka");
        assertEquals("Vodka", liquid.getName());
    }

    @Test
    public void testGetVolume() {
        assertEquals(0.5, liquid.getVolume(), 0.01);
    }

    @Test
    public void testSetVolume() {
        liquid.setVolume(1.0);
        assertEquals(1.0, liquid.getVolume(), 0.01);
    }

    @Test
    public void testGetAlcoholPercent() {
        assertEquals(40, liquid.getAlcoholPercent(), 0.01);
    }

    @Test
    public void testSetAlcoholPercent() {
        liquid.setAlcoholPercent(50);
        assertEquals(50, liquid.getAlcoholPercent(), 0.01);
    }
}
