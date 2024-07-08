class TelevisionValidationTest {
    public static void main(String[] args) {
        Television tv = new Television();
        tv.setVolume(25);
        System.out.println(tv);
        tv.setVolume(110);
        System.out.println(tv);


        tv.setBrand("Samsung"); // should stick
        System.out.println(tv); // brand should be Samsung
        tv.setBrand("LG"); // should stick
        System.out.println(tv); // brand should be LG
        tv.setBrand("Sony"); // should stick
        System.out.println(tv); // brand should be Sony
        tv.setBrand("Toshiba"); // should stick
        System.out.println(tv); // brand should be Toshiba
        tv.setBrand("INVALID"); // error message, brand not set
        System.out.println(tv); // should still be Toshiba, from before
        System.out.println();

    }
}
