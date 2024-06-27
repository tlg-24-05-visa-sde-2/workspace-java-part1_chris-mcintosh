/*
 *Application or system class model the workings of a television
 * It has properties/attributes, it has business methods, but NO main() method.
 */
class Television {
    // properties or attributes - "fields" or "instance variables"
    String brand = "Toshiba"; //brand name
    int volume = 1; //current volume

    //functions or operations - "methods"
    void turnOn() {
        System.out.println("Turning on your " + brand + " TV to volume " + volume);
    }


    void turnOff() {
        System.out.println("Shutting down...goodbye");
    }
}