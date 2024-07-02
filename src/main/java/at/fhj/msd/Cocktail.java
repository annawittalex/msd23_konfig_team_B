package at.fhj.msd;

import java.util.List;

/**
 * Represents a cocktail which is a type of drink composed of various liquids.
 * Extends the Drink class and provides specific implementations for volume,
 * alcohol percentage, and whether the drink is alcoholic.
 */
public class Cocktail extends Drink {

    private String name;
    private List<Liquid> ingredients;

    /**
     * Constructs a new Cocktail with the specified name and ingredients.
     *
     * @param name the name of the cocktail
     * @param ingredients the list of liquids that make up the cocktail
     */
    public Cocktail(String name, List<Liquid> ingredients) {
        super(name); 
        this.ingredients = ingredients;
    }

    /**
     * Calculates the total volume of the cocktail by summing the volumes of all ingredients.
     *
     * @return the total volume of the cocktail in milliliters
     */
    @Override
    public double getVolume() {
        double totalVolume = 0.0;
        for (Liquid liquid : ingredients) {
            totalVolume += liquid.getVolume();
        }
        return totalVolume;
    }

    /**
     * Calculates the average alcohol percentage of the cocktail.
     *
     * @return the average alcohol percentage of the cocktail
     */
    @Override
    public double getAlcoholPercent() {
        double totalAlcoholPercent = 0.0;
        for (Liquid liquid : ingredients) {
            totalAlcoholPercent += liquid.getAlcoholPercent();
        }
        return totalAlcoholPercent / ingredients.size();
    }

    /**
     * Determines if the cocktail is alcoholic by checking if any of the ingredients contain alcohol.
     *
     * @return true if any ingredient has an alcohol percentage greater than 0, false otherwise
     */
    @Override
    public boolean isAlcoholic() {
        for (Liquid liquid : ingredients) {
            if (liquid.getAlcoholPercent() > 0) {
                return true;
            }
        }
        return false;
    }

    // Getter und Setter Methoden
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the list of ingredients in the cocktail.
     *
     * @return the list of ingredients
     */
    public List<Liquid> getIngredients() {
        return ingredients;
    }

    /**
     * Sets the list of ingredients in the cocktail.
     *
     * @param ingredients the new list of ingredients
     */
    public void setIngredients(List<Liquid> ingredients) {
        this.ingredients = ingredients;
    }
}
