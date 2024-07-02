class MovieClient {
    public static void main(String[] args) {
        // Blank movie category
        Movie movie1 = new Movie();
        System.out.println(movie1);// toString automatically called
        System.out.println();


        Movie movie2 = new Movie();
        movie2.setTitle("Dune");
        movie2.setReleaseYear(2021);
        movie2.setRevenue(407_000_000.0);// .0 to make it clear that it is a double
        movie2.setGenre("Action");
        System.out.println(movie2); //toString() automatically called
        System.out.println();


        //new movie object
        Movie movie3 = new Movie();
        movie3.setTitle("The Batman");
        movie3.setReleaseYear(2022);
        movie3.setRevenue(770_000_000.90); // remember this is a double
        movie3.setGenre("Action");
        System.out.println(movie3);
        System.out.println();

        //shortened movie object
        Movie movie4 = new Movie("Finding Nemo", 2003, 940_000_000.0, "Adventure");
        System.out.println(movie4);
        System.out.println();
    }

}