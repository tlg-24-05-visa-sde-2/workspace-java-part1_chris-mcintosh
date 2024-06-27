class Song {
    // properties or attributes - these are called "instance variables" or "fields" in Java
    String songName; //default value when client doesn't specify one (instead of 0)
    double songLength;
    Boolean isExplicit;

    //functions or operations - these are called "methods" in Java
    void play() {
        System.out.println("Playing " + songName + " for the next " + songLength + " minutes");
    }


    void kidFriendly () {
        System.out.println("Is " + songName + "Family Friendly = " + isExplicit);
    }

    void speedup () {
        System.out.println(songName + " is now being sped up");
    }
}