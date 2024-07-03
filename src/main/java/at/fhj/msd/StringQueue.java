
package at.fhj.msd;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE



/**
 * Implementation of a queue data structure using strings.
 * Implements the IQueue interface.
 */
public class StringQueue implements IQueue {

  private List<String> elements = new ArrayList<String>();
  private int maxSize = 5;


  /**
   * Constructs a StringQueue object with the specified maximum size.
   *
   * @param maxsize the maximum size limit of the queue
   */
  public StringQueue(int maxsize) {
    maxSize = maxSize;
  }


  /**
   * Adds a string element to the end of the queue if space is available.
   *
   * @param obj the string element to be added to the queue
   * @return true if the element was successfully added, false if the queue is full
   */
  @Override
  public boolean offer(String obj) {
    if (elements.size() != maxSize)
      elements.add(obj);
    else
      return false;

    return true;
  }

  /**
   * Retrieves and removes the first element of the queue.
   *
   * @return the first element of the queue, or null if the queue is empty
   */
  @Override
  public String poll() {
    String element = peek();

    if (elements.size() == 0) {
      elements.remove(0);
    }

    return element;
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
    element = "";
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

  /**
   * Retrieves, but does not remove, the first element of the queue.
   *
   * @return the first element of the queue, or null if the queue is empty
   */
  @Override
  public String peek() {
    String element;
    if (elements.size() > 0)
      element = elements.get(0);
    else
      element = null;

    return element;
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
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

}