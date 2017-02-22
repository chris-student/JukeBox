package jukebox;

/**
 * Abstract Data Type interface for a stack collection.
 *
 * @author Chris Brown
 * @version 0.2
 * @since 01/02/2017
 */
public interface AbstractStack<E> {

    /**
     * 'Pushes' (adds) an element to the top/end of the AbstractStack
     *
     * @param o an element to be added to the top/end of the stack
     */
    void push(E o);


    /**
     * 'Pops': Returns and removes the top (last) element from an AbstractStack
     *
     * @return  the element which has been popped from the stack
     */
    E pop();

    /**
     * 'Peeks': Returns the top (last) element from an AbstractStack without removing it
     *
     * @return  the element at the top of the stack
     */
    E peek();

    /**
     * Returns the size of an AbstractStack (how many elements it contains)
     *
     * @return  size of the stack (how many elements it contains)
     */
    int size();

    /**
     * Determines whether the AbstractStack is empty
     *
     * @return  boolean representing whether the stack is empty (true if empty)
     */
    boolean isEmpty();
}
