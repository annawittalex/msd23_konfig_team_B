
package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


/**
 * Implementation of a queue data structure using strings.
 * Implements the IQueue interface.
 */
public class StringQueue implements IQueue {


    public List<String> elements;
    private int maxSize;


    /**
     * Constructs a StringQueue object with the specified maximum size.
     *
     * @param maxSize the maximum size limit of the queue
     */
    public StringQueue(int maxSize) {

        this.maxSize = maxSize;
        this.elements = new ArrayList<>();
    }


    /**
     * Adds a string element to the end of the queue if space is available.
     *
     * @param obj the string element to be added to the queue
     * @return true if the element was successfully added, false if the queue is full
     */
    @Override
    public boolean offer(String obj) {
        if (elements.size() != maxSize) {
            elements.add(obj);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Retrieves and removes the first element of the queue.
     *
     * @return the first element of the queue, or null if the queue is empty
     */
    @Override
    public String poll() {
        if (elements.size() == 0) {
            return null;
        }
        return elements.remove(0);
    }

    /**
     * Retrieves and removes the first element of the queue.
     *
     * @return the first element of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    @Override
    public String remove() {
        String element = poll();
        if (element == null) {
            throw new NoSuchElementException("there's no element any more");
        }
        return element;
    }

    /**
     * Retrieves, but does not remove, the first element of the queue.
     *
     * @return the first element of the queue, or null if the queue is empty
     */
    @Override
    public String peek() {
        if (elements.size() > 0) {
            return elements.get(0);
        } else {
            return null;
        }
    }

    /**
     * Retrieves, but does not remove, the first element of the queue.
     *
     * @return the first element of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    @Override
    public String element() {
        String element = peek();
        if (element == null) {
            throw new NoSuchElementException("there's no element any more");
        }
        return element;
    }

}