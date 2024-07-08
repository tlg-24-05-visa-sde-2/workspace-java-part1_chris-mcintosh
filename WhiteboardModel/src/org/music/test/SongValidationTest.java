package org.music.test;

import org.music.Genre;
import org.music.Song;

class SongValidationTest {

    //Testing the if statement from Client on making all negative values as "0.0"
    // Should reject the negative double input and replace with 0.0
    public static void main(String[] args) {
        Song song = new Song("Highway to hell",
                -2.04,
                true,
                "AC/DC",
                Genre.ROCK);
        System.out.println(song);
    }

}