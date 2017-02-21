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

    @Override
    public void push(E o) {
        data.add(o);
    }

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

    @Override
    public E peek() {
        if (isEmpty()) throw new EmptyStackException();
        else {
            int lastElement = size() - 1;
            return data.get(lastElement);
        }
    }


    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }
}
