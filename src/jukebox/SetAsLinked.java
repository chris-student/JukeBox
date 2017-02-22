package jukebox;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Implementation of ADT 'AbstractSet' utilising Linked List.
 *
 * @author Chris Brown
 * @version 0.2
 * @since 08/02/2017
 */
public class SetAsLinked<E> implements AbstractSet<E>, Iterable<E> {
    private LinkedList<E> data = new LinkedList<>();

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
        return data.size() <=0;
    }

    // Implements iterator method of AbstractSet
    @Override
    public Iterator<E> iterator() {
        return data.iterator();
    }
}
