package org.music.test;

import org.music.Genre;
import org.music.Song;

/**
 * JR: does the job.
 * The validation constraint is simple, but this demonstrates that it's implemented correctly.
 * For completeness, should also try a positive value and make sure it "sticks" to the instance,
 * but SongClient already demonstrates that it does.
 */
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