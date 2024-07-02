package at.fhj.msd;

import java.util.List;

public class Cocktail extends Drink {

    private String name;
    private List<Liquid> ingredients;

    public Cocktail(String name, List<Liquid> ingredients) {
        super(name); 
        this.ingredients = ingredients;
    }

    @Override
    public double getVolume() {
        double totalVolume = 0.0;
        for (Liquid liquid : ingredients) {
            totalVolume += liquid.getVolume();
        }
        return totalVolume;
    }

    @Override
    public double getAlcoholPercent() {
        double totalAlcoholPercent = 0.0;
        for (Liquid liquid : ingredients) {
            totalAlcoholPercent += liquid.getAlcoholPercent();
        }
        return totalAlcoholPercent / ingredients.size();
    }

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

    public List<Liquid> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Liquid> ingredients) {
        this.ingredients = ingredients;
    }
}
