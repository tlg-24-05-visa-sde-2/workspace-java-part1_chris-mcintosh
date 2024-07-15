package org.music.client;

import org.music.Genre;
import org.music.Song;

/**
 * JR: good basic test-drive of a few valid instances.
 * Note the output of the kidFriendly() calls and see comments above that method in Song.
 */
class SongClient {

    // starting point or "entry" point for every standalone Java application
    public static void main(String[] args) {
        //create an instance (or object)
        Song song1 = new Song("Hotel California");
        song1.setSongLength(6.30);
        song1.setExplicit(false);
        song1.setArtist("Eagles");
        song1.setGenre(Genre.POP);

        //Song 2  creating an instance strictly from constructors
        Song song2 = new Song("Highway to Hell", 3.27, true, "AC/DC", Genre.ROCK);

        //Song 3
        Song song3 = new Song("Bohemian Rhapsody", 5.55, false, "Queen", Genre.ROCK);
        System.out.println();

        // Using the 4-line constructor
        Song song4 = new Song("What a wonderful world", 2.21, true, "Louis Armstrong", Genre.CLASSICAL);


        // make them play and find out if they are kid friendly()
        song1.play();
        song2.play();
        song3.play();
        song4.play();
        System.out.println();
        System.out.println();
        song1.kidFriendly();
        song2.kidFriendly();
        song3.kidFriendly();
        song4.kidFriendly();
        System.out.println();

        //showing toString with or without the "toString"
        System.out.println(song1.toString());
        System.out.println(song2);
        System.out.println(song3);
        System.out.println(song4);
    }
}