package jukebox;

import java.util.LinkedList;

/**
 * Implementation of ADT 'AbstractStack' utilising Array List.
 *
 * @author Chris Brown
 * @version 0.2
 * @since 02/02/2017
 */
public class StackAsLinked<E> implements AbstractStack<E> {
    private LinkedList<E> data = new LinkedList<>();

    // Implements push method of AbstractStack
    @Override
    public void push(E o) {
        data.add(o);
    }

    // Implements pop method of AbstractStack
    // Throws NoSuchElementException if list is empty
    @Override
    public E pop() {
        return data.removeLast();
    }

    // Implements peek method of AbstractStack
    // Returns null if list is empty
    @Override
    public E peek() {
        return data.peekLast();
    }

    // Implements size method of AbstractStack
    @Override
    public int size() {
        return data.size();
    }

    // Implements isEmpty method of AbstractStack
    @Override
    public boolean isEmpty() {
        return data.size() <=0;
    }
}
