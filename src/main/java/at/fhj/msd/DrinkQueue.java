package at.fhj.msd;

public class DrinkQueue {
    //Adds a Drink object to the queue

    public boolean offer(Drink drink) {

        return drinks.offer(drink);

    }

    //Removes and returns the first Drink object in the queue

    public Drink poll() {

        return drinks.poll();

    }
}
