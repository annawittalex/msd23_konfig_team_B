package at.fhj.msd;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class DrinkQueue {
<<<<<<< HEAD
    //Adds a Drink object to the queue

    public boolean offer(Drink drink) {

        return drinks.offer(drink);

    }

    //Removes and returns the first Drink object in the queue

    public Drink poll() {

        return drinks.poll();

    }
=======
    private Queue<Drink> drinks;
    public DrinkQueue() {
        drinks = new LinkedList<>();
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

>>>>>>> d2eafda437f900f5125ed109a597e182320eaf9e
}
