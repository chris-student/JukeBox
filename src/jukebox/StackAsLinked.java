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

    @Override
    public void push(E o) {
        data.add(o);
    }

    // Throws NoSuchElementException if list is empty
    @Override
    public E pop() {
        return data.pop();
    }

    // Returns null if list is empty
    @Override
    public E peek() {
        return data.peek();
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.size() <=0;
    }
}
