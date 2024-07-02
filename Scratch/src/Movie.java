class Movie {
    // fields or instance variables
    private String title;
    private int releaseYear;
    private double revenue;
    private String genre;

    //constructors these get call when the client says "new"
    public Movie() {
        //no-op
    }
    public Movie(String title, int releaseYear, double revenue, String genre) {
        this.setTitle(title);
        this.setReleaseYear(releaseYear);
        this.setRevenue(revenue);
        this.setGenre(genre);
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

      public String toString() {
        return "This movies title: " + getTitle() +
                ", release year: " + getReleaseYear() +
                ", revenue= " + getRevenue() +
                ", genre= " + getGenre();
    }
}