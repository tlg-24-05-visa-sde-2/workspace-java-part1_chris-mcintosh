class Song {
    // properties or attributes - these are called "instance variables" or "fields" in Java
    private String songName; //default value when client doesn't specify one (which in this instance will be null)
   private  double songLength;
   private Boolean isExplicit;
   private String artist;

    //functions  - these are called " action methods" in Java
    public void play() {
        System.out.println("Playing " + getSongName() + " by the "+ getArtist() + " for the next " + getSongLength() + " minutes");
    }


   public void kidFriendly () {
        System.out.println("Is " + getSongName() + "Family Friendly = " + getExplicit());
    }

   public void speedup () {
        System.out.println(getSongName() + " is now being sped up");
    }

    // accessor methods - provide controlled access with validation checking to the objects fields
    //getters and setters

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

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String toString(){
        return "Song: name = " + getSongName() + ", Length = " + getSongLength();
    }
}