class CalculatorClient {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        double sum = calc.add(1, 3); //passing ints where ints are expected
        System.out.println("sum = " + sum);

        System.out.println("difference is: " + calc.subtract(1.1, 3.1));

        System.out.println("product is: " + calc.multiply(3.0, 3.0));

        System.out.println("10 is even?" + calc.isEven(10));

        System.out.println(calc.randomInt(5,20));

        System.out.println(calc.rand());
    }

}