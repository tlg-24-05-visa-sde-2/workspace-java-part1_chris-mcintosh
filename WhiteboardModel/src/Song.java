class Song {
    // "properties or attributes" - "instance variables" or "fields"
    private String songName; //default value when client doesn't specify will be null
   private  double songLength;
   private Boolean isExplicit;
   private String artist;
   private Genre genre;

      //constructors these get call when the client says "new"
     public Song (String songNAme){
       this.setSongName(songName);
   }
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
                " by "+ getArtist() +
                " for the next " +
                getSongLength() + " minutes");
    }


   public void kidFriendly () {
        System.out.println("Is " + getSongName() + " Family Friendly = " + getExplicit());
    }

   public void speedup () {
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
       } else {this.songLength = songLength;}

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
    public String toString(){
        return "Song: name = " +
                getSongName() + " by "+
                getArtist() +
                ", Song Length = " + getSongLength() + " minutes" +
                ", isExplicit = " + getExplicit() +
                ", Genre = " + getGenre();
    }
}