package at.fhj.msd;

import java.util.LinkedList;

import java.util.NoSuchElementException;

import java.util.Queue;

public class DrinkQueue {


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
}
