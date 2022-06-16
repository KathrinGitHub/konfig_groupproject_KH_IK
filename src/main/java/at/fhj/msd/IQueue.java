package at.fhj.msd;

/**
 * @author Isabella Kainer, Kathrin Hubmann
 *
 */
public interface IQueue {
  /**
  add object to queue, return true if works, otherwise false
   @param obj
   @return boolean
  */
  public abstract boolean offer(String obj);

  /**
  returns and deletes first element; null if no element in there
   @return String
   */
  public abstract String poll();

  /**
  like poll but if no elment exists NoSuchElementException is throwin instead of null return value
   @return String
   */
  public abstract String remove();

  /**
  gives first element but does not delete, null if nothing there
   @return String
   */
  public abstract String peek();

  /**
  like peek but NoSuchElementException instead of null
   @return String
   */
  public abstract String element();
}