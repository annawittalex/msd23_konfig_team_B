package at.fhj.msd;

import java.util.LinkedList;

import java.util.NoSuchElementException;

import java.util.Queue;

/**
 * Represents a queue of Drink objects.
 */

public class DrinkQueue {

    private Queue<Drink> drinks;
    public DrinkQueue() {
        drinks = new LinkedList<>();
    }


    /**
     * Retrieves, but does not remove, the first Drink object in the queue.
     *
     * @return the first Drink object in the queue, or null if the queue is empty
     */
    public Drink peek() {

        return drinks.peek();

    }


    /**
     * Returns the number of Drink objects in the queue.
     *
     * @return the number of Drink objects in the queue
     */
    public int size() {

        return drinks.size();

    }

    /**
     * Checks if the queue is empty.
     *
     * @return true if the queue contains no Drink objects, otherwise false
     */
    public boolean isEmpty() {

        return drinks.isEmpty();

    }


    /**
     * Adds a Drink object to the end of the queue.
     *
     * @param drink the Drink object to be added
     * @return true if the Drink object was successfully added to the queue
     */
    public boolean offer(Drink drink) {

        return drinks.offer(drink);

    }

    /**
     * Retrieves and removes the first Drink object from the queue.
     *
     * @return the first Drink object from the queue, or null if the queue is empty
     */
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
