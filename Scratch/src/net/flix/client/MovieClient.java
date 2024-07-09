package net.flix.client;

import net.flix.Genre;
import net.flix.Movie;
import net.flix.Rating;

class MovieClient {

    public static void main(String[] args) {
        Movie movie1 = new Movie("Dune");
        movie1.setReleaseYear(2021);
        movie1.setRevenue(407_000_000.0);
        movie1.setRating(Rating.PG_13);
        movie1.setGenre(Genre.SCI_FI);
        System.out.println(movie1); //toString() automatically called
        System.out.println();

        //shortened movie object
        Movie movie2 = new Movie("Finding Nemo", 2003, 940_000_000.0, Genre.ANIME, Rating.G);
        System.out.println(movie2);
        System.out.println();

        //new movie object
        Movie movie3 = new Movie("The Batman", Genre.MYSTERY);
        movie3.setReleaseYear(2022);
        movie3.setRevenue(770_000_000.90); // remember this is a double
        System.out.println(movie3);
        System.out.println();



    }

}