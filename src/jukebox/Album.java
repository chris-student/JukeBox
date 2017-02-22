package jukebox;

import java.util.Iterator;

/**
 * Class representing a music album which contains 'tracks'. Utilises an AbstractSet. Has an aggregation relationship with the JukeBox class and a composition relationship with AbstractSet interface/implementations.
 *
 * @author Chris Brown
 * @version 0.2
 * @since 01/02/2017
 */
public class Album implements Iterable<Track> {
    private String name;
    private String artist;
    private AbstractSet<Track> tracks;

    // Constructor for album - can use a SetAsArray or SetAsLinked
    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
//        tracks = new SetAsArray<>();
        tracks = new SetAsLinked<>();
    }

    // Implements size method of AbstractSet
    public int getNumberOfTracks() {
        return tracks.size();
    }

    // Returns the instance of the AbstractSet collection 'tracks'
    public AbstractSet<Track> getTracks() {
        return tracks;
    }

    // Implements isEmpty method of AbstractSet
    public boolean isEmpty() {
        return tracks.isEmpty();
    }

    // Implements add method of AbstractSet
    public void addTrack(Track track) {
        tracks.add(track);
    }

    // Implements remove method of AbstractSet
    public void removeTrack(Track track) {
        tracks.remove(track);
    }

    // getter for Album name attribute
    public String getName() {
        return name;
    }

    // getter for Album artist attribute
    public String getArtist() {
        return artist;
    }

    // toString method for displaying track information
    @Override
    public String toString() {
        return "\"" + getName() + "\" by " + getArtist();
    }

    // Implements iterator method of AbstractSet
    public Iterator<Track> iterator() {
        return tracks.iterator();
    }
}
