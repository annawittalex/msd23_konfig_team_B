package at.fhj.msd;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class DoubleQueue {
    private Queue<Double> doubles;

    public DoubleQueue() {
        doubles = new LinkedList<>();
    }

    /**
     * Adds a Double value to the queue.
     */
    public boolean offer(Double value) {
        return doubles.offer(value);
    }

    /**
     * Removes and returns the first Double value in the queue.
     */
    public Double poll() {
        return doubles.poll();
    }

    /**
     * Removes and returns the first Double value in the queue.
     * @throws NoSuchElementException if the queue is empty
     */
    public Double remove() {
        return doubles.remove();
    }

    /**
     * Returns the first Double value in the queue without removing it.
     */
    public Double peek() {
        return doubles.peek();
    }

    /**
     * Returns the first Double value in the queue without removing it.
     * @throws NoSuchElementException if the queue is empty
     */
    public Double element() {
        return doubles.element();
    }

    /**
     * Returns the number of Double values in the queue.
     */
    public int size() {
        return doubles.size();
    }

    /**
     * Checks if the queue is empty.
     */
    public boolean isEmpty() {
        return doubles.isEmpty();
    }
}
