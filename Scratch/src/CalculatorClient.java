class CalculatorClient {

    public static void main(String[] args) {
        double sum = Calculator.add(1, 3); //passing ints where ints are expected
        System.out.println("sum = " + sum);

        System.out.println("difference is: " + Calculator.subtract(1.1, 3.1));

        System.out.println("product is: " + Calculator.multiply(3.0, 3.0));

        System.out.println("10 is even?" + Calculator.isEven(10));

        System.out.println();

        System.out.println(Calculator.randomInt(5,20));

        System.out.println();

        System.out.println("winner is " + Calculator.randomInt(5, 16));// calls the min, max version

        System.out.println();

        System.out.println("average is " + Calculator.average(2,2));
        System.out.println("average of a single number 12 is: " + Calculator.average(12));

    }

}