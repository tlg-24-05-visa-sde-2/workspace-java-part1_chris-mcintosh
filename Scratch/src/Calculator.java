class Calculator {

    double add(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    boolean isEven(int value){
        return (value % 2 == 0);
    }



    /*
     * Returns a random integer between 1 and 11 (inclusive).
     *
     * HINT: see a class called math (in package java.lang), look for a helpful method here.
     * NOTE: these methods are all "static" which means you call them as follows:
     *  Math.methodNAme()
     *
     * int
     */

    int randomInt(int min, int max) {
        int randomInt = (int) (Math.random() * (max - min + 1)) + min;
        return randomInt;
    }

    int rand(){
        double rand = Math.random();
        double scaled = (rand * 10) + 1;
        double result = Math.round(scaled);

        return (int) result;

    }
}