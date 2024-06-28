class Song {
    // properties or attributes - these are called "instance variables" or "fields" in Java
    private String songName; //default value when client doesn't specify one (instead of 0)
   private  double songLength;
   private Boolean isExplicit;

    //functions or operations - these are called "methods" in Java
    public void play() {
        System.out.println("Playing " + songName + " for the next " + songLength + " minutes");
    }


   public void kidFriendly () {
        System.out.println("Is " + songName + "Family Friendly = " + isExplicit);
    }

   public void speedup () {
        System.out.println(songName + " is now being sped up");
    }

    // accessor methods - provide controlled access with validation checking to the objects fields

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public double getSongLength() {
        return songLength;
    }

    public void setSongLength(double songLength) {
        this.songLength = songLength;
    }

    public Boolean getExplicit() {
        return isExplicit;
    }

    public void setExplicit(Boolean explicit) {
        isExplicit = explicit;
    }
}