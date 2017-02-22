package jukebox;

/**
 * Class representing an individual music track on an album. Has a composition relationship with the Album class.
 *
 * @author Chris Brown
 * @version 0.1
 * @since 21/02/2017
 */
public class Track {
    private int trackNo;
    private String name;
    private String artist;

    // Constructor
    public Track(int trackNo, String name, String artist) {
        this.trackNo = trackNo;
        this.name = name;
        this.artist = artist;
    }

    // Getter for trackNo
    public int getTrackNo() {
        return trackNo;
    }

    // Getter for track name
    public String getName() {
        return name;
    }

    // Getter for track artist
    public String getArtist() {
        return artist;
    }

    // toString method for a track - prints the trackNo and track name
    @Override
    public String toString() {
        return getTrackNo() + ". " + getName();
    }
}
