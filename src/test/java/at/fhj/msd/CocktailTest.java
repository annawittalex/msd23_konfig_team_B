package at.fhj.msd;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
public class CocktailTest {
    private Cocktail cocktail;
    private List<Liquid> ingredients;

    @Before
    public void setUp() {
        ingredients = new ArrayList<>();
        ingredients.add(new Liquid("Vodka", 50, 40));
        ingredients.add(new Liquid("Orange Juice", 100, 0));
        cocktail = new Cocktail("Screwdriver", ingredients);
    }

    @Test
    public void testGetVolume() {
        assertEquals(150, cocktail.getVolume(), 0.01);
    }

    @Test
    public void testGetAlcoholPercent() {
        assertEquals(20, cocktail.getAlcoholPercent(), 0.01);
    }

    @Test
    public void testIsAlcoholic() {
        assertTrue(cocktail.isAlcoholic());
    }

    @Test
    public void testGetName() {
        assertEquals("Screwdriver", cocktail.getName());
    }

    @Test
    public void testSetName() {
        cocktail.setName("New Name");
        assertEquals("New Name", cocktail.getName());
    }

    @Test
    public void testGetIngredients() {
        assertEquals(ingredients, cocktail.getIngredients());
    }

    @Test
    public void testSetIngredients() {
        List<Liquid> newIngredients = new ArrayList<>();
        newIngredients.add(new Liquid("Rum", 60, 35));
        newIngredients.add(new Liquid("Coke", 120, 0));
        cocktail.setIngredients(newIngredients);
        assertEquals(newIngredients, cocktail.getIngredients());
    }
}
