package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Represents a queue that stores different Drink Objects
 *
 * @author Kathrin Hubmann
 * @author Isabella Kainer
 */
public class DrinksQueue implements IDQueue {
    private List<Drink> elements = new ArrayList<Drink>();
    private int maxSize;

    /**
     * Constructor of the DrinksQueue which defines the maximum size of the DrinksQueue
     *
     * @param maxSize maximum size of the DrinksQueue
     */
    public DrinksQueue(int maxSize) {
        this.maxSize = maxSize;
    }       //maxsize -> maxSize; other maxSize -> this.maxSize

    /**
     * Adds a new Drink to the DrinksQueue
     *
     * @param drink the drink to add to the DrinksQueue
     * @return boolean
     */
    @Override
    public boolean offer(Drink drink) {
        if (elements.size() != maxSize)
            elements.add(drink);
        else
            return false;

        return true;
    }

    /**
     * Returns and deletes first element of the DrinksQueue or returns null if there is no element in the queue
     *
     * @return Drink
     */
    @Override
    public Drink poll() {
        Drink element = peek();

        if (elements.size() != 0) {
            elements.remove(element);                                   //can't remove an element if nothing is there
        } else {
            return null;
        }

        return element;
    }

    /**
     * Returns and deletes first element of the DrinksQueue or throws NoSuchElementExeption if there is no Drink in the queue
     *
     * @throws NoSuchElementException
     * @return Drink
     */
    @Override
    public Drink remove() {
        Drink element = poll();                                    //if you poll you shouldn't override it with ""
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }

    /**
     * Returns the first element of the DrinkQueue or null, if there is no element in the DrinksQueue
     *
     * @return Drink
     */
    @Override
    public Drink peek() {
        Drink element;
        if (elements.size() > 0)
            element = elements.get(0);
        else
            element = null;

        return element;
    }

    /**
     * Returns the first element of the DrinkQueue or throws a NoSuchElementException, if there is no element in the DrinksQueue
     *
     * @throws NoSuchElementException
     * @return Drink
     */
    @Override
    public Drink element() {
        Drink element = peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }

}
