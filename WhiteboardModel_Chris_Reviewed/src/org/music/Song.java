package org.music;

/**
 * JR: Demonstrates good understanding of program concepts, with a few improvements needed.
 *
 * See comments below and in the other classes.
 *
 * Code is clean, readable, well-formatted.
 *
 * Class participation has been very good, keep it up.
 *
 * Class names, package names, and overall structure are correct.
 */
public class Song {
    // "properties or attributes" - "instance variables" or "fields"

    // JR: naming - since this is already a Song object, you could just call these 'name' and 'length'
    // For example, the other fields are not named 'songArtist' or 'songGenre'
    // Minor point, but naming is important - keep it as short as possible, without sacrificing clarity
    private String songName; //default value when client doesn't specify will be null

    // JR: since songLength must be greater than 0 (0 is not considered valid),
    // set a default value here to be something like 1.0 (instead of the language default of 0.0).
    private double songLength;

    // JR: using boolean instead of Boolean would mean a default value of false (instead of null),
    // which might be better, since most songs are not explicit
    private Boolean isExplicit;
    private String artist;
    private Genre genre;

    //constructors these get call when the client says "new"
    public Song(String songName) {
        this.setSongName(songName);
    }

    public Song(String songName, double songLength, String artist, Genre genre) {
        this.setSongName(songName);
        this.setSongLength(songLength);
        this.setArtist(artist);
        this.setGenre(genre);

    }

    /*
     * JR: delegate to ctor above for all common parameters, shown below:
     *  this(songName, songLength, artist, genre)
     *  then handle isExplicit here, via call to setExplicit()
     *
     * Also, sequence the parameters here to be consistent with the ctor above:
     *  songName, songLength, artist, genre, isExplicit
     */
    public Song(String songName, double songLength, Boolean isExplicit, String artist, Genre genre) {
        this.setSongName(songName);
        this.setSongLength(songLength);
        this.setExplicit(isExplicit);
        this.setArtist(artist);
        setGenre(genre);
    }


    //functions  - these are called " action methods" in Java
    public void play() {
        System.out.println("Playing " + getSongName() +
                " by " + getArtist() +
                " for the next " +
                getSongLength() + " minutes");
    }

    /*
     * JR: bug in the display output here.
     * If isExplicit is true, it's NOT kid-friendly, right?
     * Add a "not" in front of getExplicit(), i.e., !getExplicit() and run SongClient to see.
     *
     * Additional (minor) points:
     *  - method could be named isKidFriendly()
     *  - output says "family friendly" instead of "kid friendly" (again, minor point)
     */
    public void kidFriendly() {
        System.out.println("Is " + getSongName() + " Family Friendly = " + getExplicit());
    }

    public void speedup() {
        System.out.println(getSongName() + " is now being sped up");
    }

    // accessor methods - provide controlled access with validation checking to the objects fields
    //getters and setters

    public String getSongName() {
        return songName;
    }

    //contains if else statement
    public void setSongName(String songName) {
        this.songName = songName;

    }

    public double getSongLength() {
        return songLength;
    }

    //contains if else statement
    public void setSongLength(double songLength) {
        if (songLength < 0) {
            System.out.println("Error: Song length cannot be negative");
        } else {
            this.songLength = songLength;
        }

    }

    public Boolean getExplicit() {
        return isExplicit;
    }

    public void setExplicit(Boolean explicit) {
        isExplicit = explicit;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    // To string
    public String toString() {
        return "Song: name = " +
                getSongName() + " by " +
                getArtist() +
                ", Song Length = " + getSongLength() + " minutes" +
                ", isExplicit = " + getExplicit() +
                ", Genre = " + getGenre();
    }
}