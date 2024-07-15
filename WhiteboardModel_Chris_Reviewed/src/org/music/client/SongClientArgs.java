package org.music.client;

import org.music.Genre;
import org.music.Song;

/**
 * JR: works as intended, with a few improvements needed in the usage notes.
 *
 * Usage notes should include all supported genres.
 *
 * Great that you quoted the "Stairway to Heaven" and "Led Zeppelin" in the example usage.
 * This example usage works correctly, exactly as suggested in the usage notes, as it should.
 *
 * Seems like the order of inputs should have songName and artist next to each other, e.g.,
 *  songName, artist, genre, songLength
 */
class SongClientArgs {
    public static void main(String[] args) {
        if (args.length < 4) {
            String usage = "Usage: \n" +
                    "Note 1 SongClientArgs <songName> <songLength> <artist> <genre>\n" +
                    "Note 2 Example: SongClientArgs \"Stairway to Heaven\" 7.55 \"Led Zeppelin\" ROCK\n" +
                    "Note 3 SongLength must be a positive double input";
            System.out.println(usage);

            return;

            // JR: remove extraneous blank lines such as these
        }

        // JR: below, why is the word "television" here?

        //STEP 1; convert argument strings for proper types for television
        String songName = args[0];

        // JR: due to autoboxing, this works, but parseDouble() returns double, not Double
        Double songLength = Double.parseDouble(args[1]);
        String artist = args[2];
        Genre genre = Genre.valueOf(args[3].toUpperCase());
        // STEP 2: create and instance for Television for these converted values
        Song song = new Song(songName, songLength, artist, genre);
        //STEP 3 : Print it and congratulate them on their order
        System.out.println("Here is your new song!!");
        System.out.println(song);

        // JR: remove extraneous blank lines such as these
    }

}