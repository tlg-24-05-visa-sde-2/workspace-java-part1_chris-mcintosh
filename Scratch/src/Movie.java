class Movie {
    // fields or instance variables
    private String title;
    private int releaseYear;
    private double revenue;
    private Rating rating;
    private Genre genre;
    //constructors these get call when the client says "new"
       public Movie(String title) {
        setTitle(title);
    }

    public Movie (String title, Genre genre) {
           this(title);
           setGenre(genre);
    }
    public Movie(String title, int releaseYear, double revenue, Genre genre, Rating rating) {
        this(title, genre);                  //delegate to 2 argument constructor
        setReleaseYear(releaseYear);         // handle the rest of them myself
        setRevenue(revenue);
        setGenre(genre);

    }

    //business or action methods
    //play(), pause(), rewind(), fastForward(), stop(), goTo()

    //accessor methods - provide 'controlled' access to the objects (private) fields
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    //To string
      public String toString() {
        return "This movies title: " + getTitle() +
                ", release year: " + getReleaseYear() +
                ", revenue= " + getRevenue() +
                ", genre= " + getGenre() +
                ", rating= " + getRating();
    }
}