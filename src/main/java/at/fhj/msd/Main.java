package at.fhj.msd;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        // Create some Liquid objects
        Liquid vodka = new Liquid("Vodka", 0.5, 40.0);
        Liquid orangeJuice = new Liquid("Orange Juice", 0.5, 0.0);
        Liquid gin = new Liquid("Gin", 0.4, 37.5);

        // Create a SimpleDrink object
        SimpleDrink simpleDrink = new SimpleDrink("Vodka Shot", vodka);
        System.out.println("SimpleDrink Name: " + simpleDrink.getName());
        System.out.println("SimpleDrink Volume: " + simpleDrink.getVolume() + "L");
        System.out.println("SimpleDrink Alcohol Percentage: " + simpleDrink.getAlcoholPercent() + "%");
        System.out.println("Is SimpleDrink Alcoholic? " + simpleDrink.isAlcoholic());

        // Create a Cocktail object
        List<Liquid> ingredients = Arrays.asList(vodka, orangeJuice);
        Cocktail cocktail = new Cocktail("Screwdriver", ingredients);
        System.out.println("Cocktail Name: " + cocktail.getName());
        System.out.println("Cocktail Volume: " + cocktail.getVolume() + "L");
        System.out.println("Cocktail Alcohol Percentage: " + cocktail.getAlcoholPercent() + "%");
        System.out.println("Is Cocktail Alcoholic? " + cocktail.isAlcoholic());

        // Create a DrinkQueue and add drinks to it
        DrinkQueue drinkQueue = new DrinkQueue();
        drinkQueue.offer(simpleDrink);
        drinkQueue.offer(cocktail);

        System.out.println("\nDrinkQueue size: " + drinkQueue.size());
        System.out.println("First drink in queue: " + drinkQueue.peek().getName());
        System.out.println("Removing drink: " + drinkQueue.poll().getName());
        System.out.println("DrinkQueue size after removal: " + drinkQueue.size());

        // Create a DoubleQueue and add some doubles to it
        DoubleQueue doubleQueue = new DoubleQueue();
        doubleQueue.offer(3.14);
        doubleQueue.offer(2.71);
        doubleQueue.offer(1.61);

        System.out.println("\nDoubleQueue size: " + doubleQueue.size());
        System.out.println("First double in queue: " + doubleQueue.peek());
        System.out.println("Removing double: " + doubleQueue.poll());
        System.out.println("DoubleQueue size after removal: " + doubleQueue.size());

        // Create a StringQueue and add some strings to it
        StringQueue stringQueue = new StringQueue(5);
        stringQueue.offer("Hello");
        stringQueue.offer("World");
        stringQueue.offer("!");

        System.out.println("\nStringQueue size: " + stringQueue.elements.size());
        System.out.println("First string in queue: " + stringQueue.peek());
        System.out.println("Removing string: " + stringQueue.poll());
        System.out.println("StringQueue size after removal: " + stringQueue.elements.size());

    }
}