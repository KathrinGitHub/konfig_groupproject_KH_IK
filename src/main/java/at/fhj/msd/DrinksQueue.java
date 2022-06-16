package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DrinksQueue implements IDQueue{
    private List<Drink> elements = new ArrayList<Drink>();
    private int maxSize;

    public DrinksQueue(int maxSize) {
        this.maxSize = maxSize;
    }       //maxsize -> maxSize; other maxSize -> this.maxSize

    @Override
    public boolean offer(Drink drink) {
        if (elements.size() != maxSize)
            elements.add(drink);
        else
            return false;

        return true;
    }

    @Override
    public String poll() {
        String element = peek();

        if (elements.size() == 0) {
            return "String is empty";                                   //can't remove an element if nothing is there
        }

        return element;
    }

    @Override
    public String remove() {
        String element = poll();                                    //if you poll you shouldn't override it with ""
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }

    @Override
    public String peek() {
        Drink element;
        if (elements.size() > 0)
            element = elements.get(0);
        else
            element = null;

        return element;
    }

    @Override
    public String element() {
        String element = peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }

}
