class SongClient {

    // starting point or "entry" point for every standalone Java application
    public static void main(String[] args) {
        //create an instance (or object) of AlarmClock and set its snoozeInterval
        Song song1 = new Song();
        song1.songName = "Hotel California";
        song1.songLength = 6.30;
        song1.isExplicit = false;


        //create a second alarm clock object and set its snoozeInterval, also
        Song song2 = new Song();
        song2.songName = "Highway to Hell";
        song2.songLength = 3.27;
        song2.isExplicit = true;

        //create a 3rd AlarmClock object, but this time DON'T give it a snooze interval
        Song song3 = new Song();
        song3.songName = "Bohemian Rhapsody";
        song3.songLength = 5.55;
        song3.isExplicit = false;


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