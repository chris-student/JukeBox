package jukebox;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Implementation of ADT 'AbstractSet' utilising Array List.
 *
 * @author Chris Brown
 * @version 0.2
 * @since 08/02/2017
 */
public class SetAsArray<E> implements AbstractSet<E>, Iterable<E> {
    private ArrayList<E> data = new ArrayList<>();

    // Implements add method of AbstractSet
    @Override
    public void add(E o) {
        data.add(o);
    }

    // Implements remove method of AbstractSet
    @Override
    public E remove(E o) {
        if (data.contains(o)) {
            data.remove(o);
            return o;
        }
        throw new NoSuchElementException();
    }

    // Implements size method of AbstractSet
    @Override
    public int size() {
        return data.size();
    }

    // Implements isEmpty method of AbstractSet
    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    // Implements iterator method of AbstractSet
    @Override
    public Iterator<E> iterator() {
        return data.iterator();
    }
}
