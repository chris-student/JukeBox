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

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
//        tracks = new SetAsArray<>();
        tracks = new SetAsLinked<>();
    }

    public int getNumberOfTracks() {
        return tracks.size();
    }

    public AbstractSet<Track> getTracks() {
        return tracks;
    }

    public boolean isEmpty() {
        return tracks.isEmpty();
    }

    public void addTrack(Track track) {
        tracks.add(track);
    }

    public void removeTrack(Track track) {
        tracks.remove(track);
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return "\"" + getName() + "\" by " + getArtist();
    }

    public Iterator<Track> iterator() {
        return tracks.iterator();
    }
}
