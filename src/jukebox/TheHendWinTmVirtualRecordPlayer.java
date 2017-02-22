package jukebox;

/**
 * Simple sequential program which tests the functionality of ADT implementations via the Album & JukeBox classes.
 *
 * @author Chris Brown
 * @version 0.2
 * @since 02/02/2017
 */
public class TheHendWinTmVirtualRecordPlayer {

    public static void main(String[] args) {
        System.out.println("DJ Brown in the house!");

        // Create a new JukeBox
        JukeBox juke = new JukeBox();
        System.out.println("Jukebox created");
        // Test isEmpty method of AbstractStack
        System.out.println("\nDoes jukebox have another album: " + juke.hasNext());
        // Test size method of AbstractStack
        System.out.println("Number of albums in jukebox: " + juke.getNumberOfAlbums());

        System.out.println("Creating album");
        String artist = "Girls Aloud";
        Album album = new Album("Sound of the Underground", artist);

        // Tests add method of AbstractSet
        album.addTrack(new Track(1, "Sound of the Underground", artist));
        album.addTrack(new Track(2, "No Good Advice", artist));
        album.addTrack(new Track(3, "Some Kind of Miracle", artist));
        album.addTrack(new Track(4, "All I Need (All I Don't)", artist));
        album.addTrack(new Track(5, "Life Got Cold", artist));
        album.addTrack(new Track(6, "Mars Attack", artist));
        album.addTrack(new Track(7, "Stop", artist));
        album.addTrack(new Track(8, "Girls Allowed", artist));
        album.addTrack(new Track(9, "Forever and a Night", artist));
        album.addTrack(new Track(10, "Love/Hate", artist));
        album.addTrack(new Track(11, "Boogie Down Love", artist));
        album.addTrack(new Track(12, "Don't Want You Back", artist));

        Track track13 = new Track(13, "White Lies", artist);
        album.addTrack(track13);

        System.out.println("Creating and adding a 2nd album...");
        artist = "Prince";
        Album album2 = new Album("Purple Rain", artist);
        album2.addTrack(new Track(1, "Let's Go Crazy", "Prince and The Revolution"));
        album2.addTrack(new Track(2, "Take Me with U", "Prince and The Revolution"));
        album2.addTrack(new Track(3, "The Beautiful Ones", artist));
        album2.addTrack(new Track(4, "Computer Blue", "Prince and The Revolution"));
        album2.addTrack(new Track(5, "Darling Nikki", artist));
        album2.addTrack(new Track(6, "When Doves Cry", artist));
        album2.addTrack(new Track(7, "I Would Die 4 U", "Prince and The Revolution"));
        album2.addTrack(new Track(8, "Baby I'm a Star", "Prince and The Revolution"));
        album2.addTrack(new Track(9, "Purple Rain", "Prince and The Revolution"));

        // Test push method of AbstractStack
        juke.addAlbum(album);
        juke.addAlbum(album2);

        System.out.println("\nDoes jukebox have another album: " + juke.hasNext());
        System.out.println("Number of albums in jukebox: " + juke.getNumberOfAlbums());
        // Test peek method of AbstractStack  - should show the last album added (album2)
        System.out.println("Next album in jukebox: " + juke.peekNext());

        System.out.println("Retrieving next album from jukebox...");
        // Test pop method of AbstractStack - ALSO ENSURES THAT pop method is 'popping' the last album added (album2)
        Album current = juke.getNext();
        System.out.println("Current album: " + current);

        // Test isEmpty method of AbstractSet
        System.out.println("Is the album empty of tracks: " + current.isEmpty());
        // Test size method of AbstractSet
        System.out.println("Number of tracks in album: " + current.getNumberOfTracks());
        // Test iterator method of AbstractSet
        System.out.println("Tracklist: ");
        printTracks(current);



        System.out.println("\nDoes jukebox have another album: " + juke.hasNext());
        System.out.println("Number of albums in jukebox: " + juke.getNumberOfAlbums());
        System.out.println("Next album in jukebox: " + juke.peekNext());
        System.out.println("Retrieving next album from jukebox...");
        current = juke.getNext();
        System.out.println("Current album: " + current);
        System.out.println("Is the album empty of tracks: " + current.isEmpty());
        System.out.println("Number of tracks in album: " + current.getNumberOfTracks());
        System.out.println("Tracklist: ");
        printTracks(current);

        // Test remove method of AbstractSet by removing track from 'album'
        System.out.println("Removing track from current album");
        album.removeTrack(track13);
        System.out.println("Number of tracks in album: " + current.getNumberOfTracks());
        System.out.println("Tracklist: ");
        printTracks(current);

        // Should no longer be any albums in the jukebox...
        System.out.println("\nDoes jukebox have another album: " + juke.hasNext());
        System.out.println("Number of albums in jukebox: " + juke.getNumberOfAlbums());
        System.out.println("Goodbye.");
    }

    // static method used to iterate through each track of an album and print it
    private static void printTracks(Album album) {
        for (Track track : album) {
            System.out.println(track);
        }

        // Iterator method that was previously used
        //        System.out.println("Obtaining tracks...");
        //        AbstractSet<Track> currentTracks = album.getTracks();
        //        Iterator<Track> iter = currentTracks.iterator();
        //        while (iter.hasNext()) {
        //            Track track = iter.next();
        //            System.out.println(track.getTrackNo() + ". " + track.getName());
        //        }
    }
}
