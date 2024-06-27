/*
 * Application main-class
 * In the main() method, we will create a few television objects and give them a basic test-drive.
 */
class TelevisionClient {

    public static void main(String[] args) {
       //create an instance of Television and set its properties
       Television tv1 = new Television();
       tv1.brand = "Samsung";
       tv1.volume = 32;

       Television tv2 = new Television();
       tv2.brand = "Sony";
       tv2.volume = 24;

       //create a third Television object but dont set it properties
       Television tv3 = new Television();


       // turn them all both on
        tv1.turnOn();
        tv2.turnOn();
        tv3.turnOn();

        //turn them all both off
        tv1.turnOff();
        tv2.turnOff();
        tv3.turnOff();
    }
}
