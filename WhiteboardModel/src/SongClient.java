class SongClient {

    // starting point or "entry" point for every standalone Java application
    public static void main(String[] args) {
        //create an instance (or object) of AlarmClock and set its snoozeInterval
        Song song1 = new Song();
        song1.setSongName("Hotel California");
        song1.setSongLength(6.30);
        song1.setExplicit(false);
        song1.setArtist("Eagles");


        //create a second alarm clock object and set its snoozeInterval, also
        Song song2 = new Song();
        song2.setSongName("Highway to Hell");
        song2.setSongLength(3.27);
        song2.setExplicit(true);
        song1.setArtist("AC/DC");

        //create a 3rd AlarmClock object, but this time DON'T give it a snooze interval
        Song song3 = new Song();
        song3.setSongName("Bohemian Rhapsody");
        song3.setSongLength (5.55);
        song3.setExplicit(false);
        song1.setArtist("Queen");


        // make them snooze()
        song1.play();
        song2.play();
        song3.play();
        System.out.println();
        System.out.println();
        song1.kidFriendly();
        song2.kidFriendly();
        song3.kidFriendly();
    }
}