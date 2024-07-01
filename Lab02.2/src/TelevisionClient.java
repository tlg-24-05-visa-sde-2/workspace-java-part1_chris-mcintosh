/*
 * Application main-class
 * In the main() method, we will create a few television objects and give them a basic test-drive.
 */
class TelevisionClient {

    public static void main(String[] args) {
       //create an instance of Television and set its properties
       Television tv1 = new Television();
       tv1.setBrand("Samsung");;
       tv1.setVolume(32);

       Television tv2 = new Television();
       tv2.setBrand("Sony");
       tv2.setVolume(50);

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
        System.out.println();

        //toString
        System.out.println(tv1.toString());
        System.out.println(tv2);//toString method not necessary it is automatic once set
        System.out.println(tv3);

    }
}
