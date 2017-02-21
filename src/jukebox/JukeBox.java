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

    public JukeBox() {
//        albums = new StackAsArray<>();
        albums = new StackAsLinked<>();
    }

    public int getNumberOfAlbums() {
        return albums.size();
    }

    public boolean hasNext() {
        return !albums.isEmpty();
    }

    public Album getNext() {
        return albums.pop();
    }

    public Album peekNext() {
        return albums.peek();
    }

    public void addAlbum(Album album) {
        albums.push(album);
    }
}
