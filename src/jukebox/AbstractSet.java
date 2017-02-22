package jukebox;

import java.util.Iterator;

/**
 * Abstract Data Type interface for a Set collection.
 *
 * @author Chris Brown
 * @version 0.3
 * @since 01/02/2017
 */
public interface AbstractSet<E> {

    /**
     * Adds an element to the end of the AbstractSet
     *
     * @param o an element to be added to the end of the set
     */
    void add(E o);

    /**
     * Returns and removes a specified element from an AbstractSet
     *
     * @param o the element to be removed from the set
     * @return  the element which was removed from the set
     */
    E remove(E o);

    /**
     * Returns the size of an AbstractSet (how many elements it contains)
     *
     * @return  size of the set (how many elements it contains)
     */
    int size();

    /**
     * Determines whether the AbstractSet is empty
     *
     * @return  boolean representing whether the set is empty (true if empty)
     */
    boolean isEmpty();

    /**
     * Returns iterator for the AbstractSet
     *
     * @return  iterator for the set
     */
    Iterator<E> iterator();
}
