/*
 * This is an all static class, i.e., it has nothing but static methods
 */
class Calculator {

   public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

   public static double multiply(double a, double b) {
        return a * b;
    }

   public static boolean isEven(int value){
        return (value % 2 == 0);
    }
    /*
     * Returns a random integer between 1 and 11 (inclusive).
     */
    public static int randomInt(int min, int max) {
        int randomInt = (int) (Math.random() * (max - min + 1)) + min;
        return randomInt;
    }
    /*
     * Returns a random integer between 1 and 'max' (inclusive).
     */
   public static int randomInt(int max){
        return randomInt(1, max); // delegate to "min-max" version, passing 1 and "max"
    }

  public static int randomInt(){
        return randomInt(1, 10); //delegate to "min-max' version, passing 1 for min, 11 for max

    }
}