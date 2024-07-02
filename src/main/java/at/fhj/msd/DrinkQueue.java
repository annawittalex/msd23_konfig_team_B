package at.fhj.msd;

import java.util.LinkedList;

import java.util.NoSuchElementException;

import java.util.Queue;

public class DrinkQueue {

    private Queue<Drink> drinks;
    public DrinkQueue() {
        drinks = new LinkedList<>();
    }


    //Returns the first Drink object in the queue without removing it

    public Drink peek() {

        return drinks.peek();

    }

    // Returns the number of drinks in the queue

    public int size() {

        return drinks.size();

    }

    //Checks if the queue is empty

    public boolean isEmpty() {

        return drinks.isEmpty();

    }

    //Adds a Drink object to the queue

    public boolean offer(Drink drink) {

        return drinks.offer(drink);

    }

    //Removes and returns the first Drink object in the queue

    public Drink poll() {

        return drinks.poll();

    }

    /**
     * Removes and returns the first Drink object in the queue.
     * @return the Drink object removed
     * @throws NoSuchElementException if the queue is empty
     */
    public Drink remove() {
        return drinks.remove();
    }

    /**
     * Returns the first Drink object in the queue without removing it.
     * @return the first Drink object
     * @throws NoSuchElementException if the queue is empty
     */
    public Drink element() {
        return drinks.element();
    }


}
