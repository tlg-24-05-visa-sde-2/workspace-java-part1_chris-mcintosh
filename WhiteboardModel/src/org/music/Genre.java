package org.music;

public enum Genre {
    // Added the display function to get the string returns that we want
    RAP("Rap"),
    ROCK("Rock"),
    POP("Pop"),
    CLASSICAL("Classical"),
    COUNTRY("Country");

    //everything under here is just regular class definition stuff, i.e., fields, conductors, methods
    private String output;

    // implicitly private, no "new" from outside
    Genre(String output) {
        System.out.println("Genre ctor called");
        this.output = output;

    }

    public String getDisplay() {
        return output;
    }

    public String toString() {
        return getDisplay();
    }
}