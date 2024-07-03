/*
 * Application main-class
 * In the main() method, we will create a few television objects and give them a basic test-drive.
 */
class TelevisionClient {

    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances");
        System.out.println();

       //create an instance of Television and set its properties
       Television tv1 = new Television();
       tv1.setBrand("Samsung");;
       tv1.setVolume(32);

       Television tv2 = new Television("Sony", 50, DisplayType.OLED);



       //create a Television objects using constants
       Television tv3 = new Television("LG", Television.MAX_VOLUME);
       Television tv4 = new Television("Spectre", Television.MIN_VOLUME);
       Television tv5 = new Television("APPLE", Television.MAX_VOLUME);


       // turn them on
        tv1.turnOn();
        tv2.turnOn();
        tv3.turnOn();
        System.out.println();

        //turn them  off
        tv1.turnOff();
        tv2.turnOff();
        tv3.turnOff();
        System.out.println();

        //toString
        System.out.println(tv1.toString());
        System.out.println(tv2);//toString method not necessary it is automatic once set
        System.out.println(tv3);
        System.out.println(tv4);
        System.out.println();

        System.out.println(Television.getInstanceCount() + " instances");
    }
}
