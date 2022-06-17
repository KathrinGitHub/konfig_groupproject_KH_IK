package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

/**
 * Tests the class DrinksQueue
 *
 * @author Isabella Kainer
 */
public class DrinksQueueTest {
    private DrinksQueue drinksQueue;
    private SimpleDrink water;
    private SimpleDrink orangeJuice;

    /**
     * Creates a new Drinksqueue, 2 Liquids and 2 SimpleDrinks before every test
     */
    @BeforeEach
    public void setup() {
        drinksQueue = new DrinksQueue(5); //creates a DrinksQueue with the maximum size of 5 Drinks
        Liquid waterLiquid = new Liquid("Water", 0.25, 0);
        Liquid orangeJuiceLiquid = new Liquid("Orange Juice", 0.25, 0);
        water = new SimpleDrink("Water", waterLiquid);
        orangeJuice = new SimpleDrink("Orange Juice", orangeJuiceLiquid);
    }

    /**
     * Tests to insert a new Drink into the DrinksQueue, when the DrinksQueue is empty
     * Method to test should return true
     */
    @Test
    public void offerFirstDrink() {
        Assertions.assertTrue(drinksQueue.offer(water));
    }

    /**
     * Tests to insert a new Drink into the DrinksQueue, when there is already 1 Drink in the DrinksQueue
     * Method to test should return true
     */
    @Test
    public void offerSecondDrink() {
        drinksQueue.offer(water); //insert first Drink into DrinksQueue
        Assertions.assertTrue(drinksQueue.offer(orangeJuice));
    }

    /**
     * Tests to insert a Drink into the DrinksQueue, when the DrinksQueue is already full
     * Method to test should return false
     */
    @Test
    public void offerTooManyDrinks() {
        //adds maximum amount of Drinks to the DrinksQueue
        drinksQueue.offer(water);
        drinksQueue.offer(orangeJuice);
        drinksQueue.offer(water);
        drinksQueue.offer(orangeJuice);
        drinksQueue.offer(water);
        //tries to insert one more Drink into the DrinksQueue
        Assertions.assertFalse(drinksQueue.offer(orangeJuice));
    }

    /**
     * Tests to poll a Drink from the DrinksQueue
     * Method to test should return the element that has been removed
     */
    @Test
    public void pollADrink() {
        drinksQueue.offer(water); //adds water to drinksQueue
        drinksQueue.offer(orangeJuice);
        Assertions.assertEquals(water, drinksQueue.poll()); //removes water from drinksQueue and returns the water object
    }

    /**
     * Tests to remove a Drink from an empty DrinksQueue
     * Method to test should throw a NoSuchElementException
     */
    @Test
    public void removeANonExistingDrink() {
        Assertions.assertThrows(NoSuchElementException.class, () -> {drinksQueue.remove();});
    }

    /**
     * Tests to remove a Drink from the DrinksQueue
     * Method to test should return the element that has been removed
     */
    @Test
    public void removeADrink() {
        drinksQueue.offer(orangeJuice);
        Assertions.assertEquals(orangeJuice, drinksQueue.remove());
    }

    /**
     * Tests to get (method peek()) a Drink from the DrinksQueue
     * Method to test should return the first element of DrinksQueue
     */
    @Test
    public void peekADrink() {
        drinksQueue.offer(water);
        drinksQueue.offer(orangeJuice);
        Assertions.assertEquals(water, drinksQueue.peek());
    }

    /**
     * Tests to get (method element()) a Drink from an empty DrinksQueue
     * Method to test should throw a NoSuchElementException
     */
    @Test
    public void getANonExistingDrink() {
        Assertions.assertThrows(NoSuchElementException.class, () -> {drinksQueue.element();});
    }

    /**
     * Tests to get (method element()) a Drink from the DrinksQueue
     * Method to test should return the first element of DrinksQueue
     */
    @Test
    public void getADrink() {
        drinksQueue.offer(orangeJuice);
        Assertions.assertEquals(orangeJuice, drinksQueue.element());
    }
}
