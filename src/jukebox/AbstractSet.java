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
    void add(E o);
    E remove(E o);
    int size();
    boolean isEmpty();
    Iterator<E> iterator();
}
