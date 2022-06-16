package at.fhj.msd;

/**
 * Represents the interface for a DrinksQueue
 *
 * @author Kathrin Hubmann
 * @author Isabella Kainer
 */
public interface IDQueue {

    /**
     * Adds Drink to queue, returns true if works, otherwise false
     *
     * @return boolean
     */
    public abstract boolean offer(Drink obj);

    /**
     * Returns and deletes first element; returns null if no element in there
     *
     * @return Drink
     */
    public abstract Drink poll();

    /**
     * Returns and deletes first element; if no element exists NoSuchElementException is thrown
     *
     * @throws java.util.NoSuchElementException
     * @return Drink
     */
    public abstract Drink remove();

    /**
     * Returns first element of the queue but does not delete it; returns null if nothing there
     *
     * @return Drink
     */
    public abstract Drink peek();

    /**
     * Returns first element of the queue but does not delete it; throws NoSuchElementException if nothing there
     *
     * @throws java.util.NoSuchElementException
     * @return Drink
     */
    public abstract Drink element();

}
