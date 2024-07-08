package net.flix;

public enum Genre {
 ANIME("Anime"),
 DRAMA("Drama..."),
 HORROR("HORROR!!!"),
 ROMANTIC_COMEDY("Romantic comedy"),
 DOCUMENTARY("Documentary"),
 MYSTERY("Mystery"),
 SCI_FI("Sci-Fi"),
 INTERNATIONAL("International"),;

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