package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StringQueueTest {

    private int maxSize = 3;
    private StringQueue stringQueue = new StringQueue(maxSize);
    private StringQueue stringQueue1 = new StringQueue(0);


    @Test
    void offer1() {
        Assertions.assertEquals(true, stringQueue.offer("first"));
    }

    @Test
    void offer2() {
        Assertions.assertEquals(true, stringQueue.offer("second"));
    }

    @Test
    void offer3() {
        Assertions.assertEquals(true, stringQueue.offer("third"));
    }

    @Test
    void offer4() {
        Assertions.assertEquals(false, stringQueue.offer("fourth"));
    }


    @Test
    void peek1() {
        Assertions.assertEquals("first", stringQueue.peek());
    }

    @Test
    void peek2() {
        Assertions.assertEquals(null, stringQueue1.peek());
    }


    @Test
    void element1() {
        Assertions.assertEquals("first", stringQueue.element());
    }

    @Test
    void element2() {
        Assertions.assertEquals("there's no element any more",stringQueue1.element());
    }

    @Test
    void poll1() {
        Assertions.assertEquals("first", stringQueue.poll());
    }

    @Test
    void poll2() {
        Assertions.assertEquals("second", stringQueue.poll());
    }

    @Test
    void poll3() {
        Assertions.assertEquals(null, stringQueue1.poll());
    }


    @Test
    void remove1() {
        Assertions.assertEquals("third", stringQueue.remove());
    }

    @Test
    void remove2() {
        Assertions.assertEquals("there's no element any more", stringQueue.remove());
    }

    @Test
    void remove3() {
        Assertions.assertEquals("there's no element any more", stringQueue1.remove());
    }

}
