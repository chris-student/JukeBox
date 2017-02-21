package jukebox;

/**
 * Abstract Data Type interface for a stack collection.
 *
 * @author Chris Brown
 * @version 0.2
 * @since 01/02/2017
 */
public interface AbstractStack<E> {
    void push(E o);
    E pop();
    E peek();
    int size();
    boolean isEmpty();
}
