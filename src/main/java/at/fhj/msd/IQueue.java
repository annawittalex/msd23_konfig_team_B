package at.fhj.msd;

/**
 * Represents a queue data structure with basic operations for managing String elements.
 */
public interface IQueue {

  /**
   * Adds the specified object to the queue.
   *
   * @param obj the object to be added to the queue
   * @return true if the object was successfully added to the queue, false otherwise
   */
  public abstract boolean offer(String obj);


  /**
   * Retrieves and removes the first element from the queue.
   *
   * @return the first element from the queue, or null if the queue is empty
   */
  public abstract String poll();

  /**
   * Retrieves and removes the first element from the queue.
   *
   * @return the first element from the queue
   * @throws Exception if the queue is empty
   */
  public abstract String remove();

  /**
   * Retrieves, but does not remove, the first element from the queue.
   *
   * @return the first element from the queue, or null if the queue is empty
   */
  public abstract String peek();

  /**
   * Retrieves, but does not remove, the first element from the queue.
   *
   * @return the first element from the queue
   * @throws Exception if the queue is empty
   */
  public abstract String element();
}
