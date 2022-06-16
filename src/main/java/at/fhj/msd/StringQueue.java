package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE

/**
 * @author Isabella Kainer, Kathrin Hubmann
 */

public class StringQueue implements IQueue {

  private List<String> elements = new ArrayList<String>();
  private int maxSize = 5;

  /**
   * Constructor
   * @param maxSize
   */
  public StringQueue(int maxSize) {
    this.maxSize = maxSize;
  }       //maxsize -> maxSize; other maxSize -> this.maxSize

  /**
   * adds element to Queue
   * @param obj
   * @return boolean
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
   * takes element from queue and removes it - does not throw exception
   * @return String
   */
  @Override
  public String poll() {
    String element = peek();

    if (elements.size() > 0) {
      elements.remove(element);                                   //can't remove an element if nothing is there
    } else {
      return null;
    }

    return element;
  }

  /**
   * takes element from poll() - throws exception
   * @return String
   */
  @Override
  public String remove() {
    String element = poll();                                    //if you poll you shouldn't override it with ""
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

  /**
   * takes element from queue - does not throw exception
   * @return String
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
   * takes element from peek() - throws exception
   * @return String
   */
  @Override
  public String element() {
    String element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

}                                                                               //removed s