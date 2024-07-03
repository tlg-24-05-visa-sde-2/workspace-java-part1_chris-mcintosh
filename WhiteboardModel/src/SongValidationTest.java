class SongValidationTest {
    public static void main(String[] args) {
        Song song = new Song("Highway to hell",
                -2.04,
                true,
                "AC/DC",
                Genre.ROCK );
        System.out.println(song);
    }

}