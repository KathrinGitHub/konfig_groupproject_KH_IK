package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;


public class StringQueueTest {

    private int maxSize = 3;
    private StringQueue stringQueue = new StringQueue(maxSize);
    private StringQueue stringQueue1 = new StringQueue(0);


    /**
     * tests adding strings to Queue with one element more than size
     */
    @Test
    void offer1() {
        Assertions.assertEquals(true, stringQueue.offer("first"));
        Assertions.assertEquals(true, stringQueue.offer("second"));
        Assertions.assertEquals(true, stringQueue.offer("third"));
        Assertions.assertEquals(false, stringQueue.offer("fourth"));
    }

    /**
     * tests adding an element to Queue wit Queue size 0
     */
    @Test
    void offer2() {
        Assertions.assertEquals(false, stringQueue1.offer("first"));
    }


    /**
     * tests peek methode by looking at first element
     */
    @Test
    void peek1() {
        stringQueue.offer("first");
        stringQueue.offer("second");
        stringQueue.offer("third");
        Assertions.assertEquals("first", stringQueue.peek());
    }

    /**
     * tests peek methode by looking at first element in Queue with size 0
     */
    @Test
    void peek2() {
        Assertions.assertEquals(null, stringQueue1.peek());
    }


    /**
     * tests element methode by looking at first element
     */
    @Test
    void element1() {
        stringQueue.offer("first");
        stringQueue.offer("second");
        stringQueue.offer("third");
        Assertions.assertEquals("first", stringQueue.element());
    }

    /**
     * tests element methode by looking at first element in Queue with size 0
     */
    @Test
    void element2() {
        Assertions.assertThrows(NoSuchElementException.class, () -> {
            stringQueue1.element();
        });
    }

    /**
     * tests poll methode and if it removes looked at object from Queue
     */
    @Test
    void poll1() {
        stringQueue.offer("first");
        stringQueue.offer("second");
        stringQueue.offer("third");
        Assertions.assertEquals("first", stringQueue.poll());
        Assertions.assertEquals("second", stringQueue.poll());
        Assertions.assertEquals("third", stringQueue.poll());
        Assertions.assertEquals(null, stringQueue.poll());
    }

    /**
     * tests poll methode with Queue size 0
     */
    @Test
    void poll2() {
        Assertions.assertEquals(null, stringQueue1.poll());
    }


    /**
     * tests remove methode and if it removes looked at object from Queue
     */
    @Test
    void remove1() {
        stringQueue.offer("first");
        stringQueue.offer("second");
        stringQueue.offer("third");
        Assertions.assertEquals("first", stringQueue.remove());
        Assertions.assertEquals("second", stringQueue.remove());
        Assertions.assertEquals("third", stringQueue.remove());
        Assertions.assertThrows(NoSuchElementException.class, () -> {
            stringQueue.remove();
        });
    }

    /**
     * tests remove methode with Queue size 0
     */
    @Test
    void remove2() {
        Assertions.assertThrows(NoSuchElementException.class, () -> {
            stringQueue1.remove();
        });
    }

}
