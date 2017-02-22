package jukebox;

/**
 * Class representing a jukebox which contains albums. Utilises an AbstractStack. Has a composition relationship with AbstractStack interface/implementations
 *
 * @author Chris Brown
 * @version 0.2
 * @since 01/02/2017
 */
public class JukeBox {
    private AbstractStack<Album> albums;

    // Constructor for jukebox - can use StackAsArray or StackAsLinked
    public JukeBox() {
//        albums = new StackAsArray<>();
        albums = new StackAsLinked<>();
    }

    // Implements size method of AbstractStack
    public int getNumberOfAlbums() {
        return albums.size();
    }

    // Implements isEmpty method of AbstractStack
    public boolean hasNext() {
        return !albums.isEmpty();
    }

    // Implements pop method of AbstractStack
    public Album getNext() {
        return albums.pop();
    }

    // Implements peek method of AbstractStack
    public Album peekNext() {
        return albums.peek();
    }

    // Implements push method of AbstractStack
    public void addAlbum(Album album) {
        albums.push(album);
    }
}
