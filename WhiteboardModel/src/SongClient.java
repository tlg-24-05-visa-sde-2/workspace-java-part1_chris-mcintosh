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
        song2.setArtist("AC/DC");

        //create a 3rd AlarmClock object, but this time DON'T give it a snooze interval
        Song song3 = new Song();
        song3.setSongName("Bohemian Rhapsody");
        song3.setSongLength (5.55);
        song3.setExplicit(false);
        song3.setArtist("Queen");
        System.out.println();

        // Using the 4-line constructor
        Song song4 = new Song("what a wonderful world",
                2.21, true, "Louis Armstrong");

        // Using the 1-line constructor that contains an if else statement
        Song song5 = new Song();
        System.out.println(song5);
        System.out.println();



        // make them play and find out kid friendly()
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

        //showing toString
        System.out.println(song1.toString());
    }
}