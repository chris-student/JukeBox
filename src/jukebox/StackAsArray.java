package jukebox;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Implementation of ADT 'AbstractStack' utilising Array List.
 *
 * @author Chris Brown
 * @version 0.2
 * @since 02/02/2017
 */
public class StackAsArray<E> implements AbstractStack<E> {
    private ArrayList<E> data = new ArrayList<>();

    // Implements push method of AbstractStack
    @Override
    public void push(E o) {
        data.add(o);
    }

    // Implements pop method of AbstractStack
    @Override
    public E pop() {
        if (isEmpty()) throw new EmptyStackException();
        else {
            int lastElement = size() - 1;
            E lastObject = data.get(lastElement);
            data.remove(lastElement);
            return lastObject;
        }
    }

    // Implements peek method of AbstractStack
    @Override
    public E peek() {
        if (isEmpty()) throw new EmptyStackException();
        else {
            int lastElement = size() - 1;
            return data.get(lastElement);
        }
    }

    // Implements size method of AbstractStack
    @Override
    public int size() {
        return data.size();
    }

    // Implements isEmpty method of AbstractStack
    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }
}
