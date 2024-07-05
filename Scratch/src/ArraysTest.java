import java.util.Arrays;

class ArraysTest {


    public static void main(String[] args) {
        int [] ages = new int[4];
        ages[0] = 27;
        ages[1] = 32;
        ages[2] = 6;
        ages[3] = 27;
        System.out.println(Arrays.toString(ages));  //toString() automatically called
        System.out.println();

        double[] temps = {97.4, 130.2,95.0, 86.0 };
        System.out.println(Arrays.toString(temps));

        for (double temp : temps) {
            System.out.printf("Temperature is: %s\n", temp);
        }
        System.out.println();

        String[] cities = {"WashingtonDC", "Seattle", "Atlanta", "Austin"};//slots 0 through 3
        System.out.println("There are " + cities.length + " cities in the Array");
        System.out.println(Arrays.toString(cities));

        for (String city : cities) {
            System.out.println("I live in: " + city);
        }
        System.out.println();

        for (int i = 0; i < cities.length; i++){
            System.out.println("I live in: " + cities[i]);

        }
    }
}