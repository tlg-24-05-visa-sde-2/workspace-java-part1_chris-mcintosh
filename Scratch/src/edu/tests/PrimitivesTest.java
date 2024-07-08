package edu.tests;

class PrimitivesTest {

    public static void main(String[] args) {
        int age = 27;
        System.out.println("Age is: " + age);

        long population = 8_000_000_000L;
        System.out.println("Population is: " + population);

        double price = 799.99;
        System.out.println("Price is: " + price);

        boolean isCloudy =  false;
        System.out.println("isCloudy is: " + isCloudy);

        char size = 'S';
        System.out.println("Size is: " + size);

        String grade = "A";
        System.out.println("My grade on the test was: " + grade);

        String quote = "What's up, \"Doc\"?";
        System.out.println("Bugs Bunny says: " + quote);

        System.out.println("roses are red\nviolets are blue");
        System.out.println();

        int n = 18;
        int m = n;

        n = 19;
        System.out.println("n is: " + n ); //should say 19
        System.out.println("m is: " + m ); //is still 18
        System.out.println();

        int kids = 0;
        System.out.println("number of kids is: " + ++kids);

    }
}