enum Genre {
    // Added the display function to get the string returns that we want
    RAP("Rap"),
    ROCK("Rock"),
    POP("Pop"),
    CLASSICAL("Classical"),
    COUNTRY("Country");

    //everything under here is just regular class definition stuff, i.e., fields, conductors, methods
    private String display;

    // implicitly private, no "new" from outside
    Genre(String display) {
        System.out.println("Genre ctor called");
        this.display = display;

    }
    public String getDisplay() {
        return display;
    }

    public String toString() {
        return getDisplay();
    }
}