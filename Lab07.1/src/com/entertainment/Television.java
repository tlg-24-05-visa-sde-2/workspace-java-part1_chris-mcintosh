package com.entertainment;/*
 *Application or system class model the workings of a television
 * It has properties/attributes, it has business methods, but NO main() method.
 */
import java.util.Arrays;
public class Television {
    // class-level ("static") variables - these live in the "shared-area" up above
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;

    // disclaimer the proper way would be to use a brand ENUM
    //We will do it this way for the labs, just for more practice with arrays and loops
    public static final String[] VALID_BRANDS = {
            "Samsung", "LG", "Sony", "Toshiba"
    };

    private static int instanceCount = 0;

    //This method is also up there in the shared zone. It does not execute inside the Television objects
    public static int getInstanceCount(){
        return instanceCount;
    }

    public static boolean isValidBrand (String brand){
        boolean valid = false;

        for(String currentBrand: VALID_BRANDS){
           if (currentBrand.equals(brand)) {
            valid = true;
             break;
           }
        }
        return valid;
    }

    // --------------------------------------------------------

    // properties or attributes - "fields" or "instance variables"
    private String brand; //brand name
    private int volume; //current volume
    private int originalVolume;
    private DisplayType display = DisplayType.LED;
    private boolean isMuted = false;

    //Constructors
    public Television (){
        instanceCount++;
    }
    public Television(String brand){
        this();
        setBrand(brand);
    }
    public Television(String brand, int volume){
        this(brand);
        setVolume(volume);
    }

    public Television(String brand, int volume, DisplayType display){
        this(brand, volume);
        setDisplay(display);
    }

    //functions or operations - "methods"
    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + getBrand() + " TV to volume " + getVolume());
    }

    public void turnOff() {
        System.out.println("Shutting down...goodbye");
    }


    private boolean verifyInternetConnection(){
        return true;
    }


    // accessor methods - "getters, setters, toString"
    public String getBrand() {
        return brand;
    }
    // disclaimer the proper way would be to use a brand ENUM
    // VALID_BRANDS contains "Samsung", "LG", "Sony", "Toshiba"
    public void setBrand(String brand) {
        if (isValidBrand(brand)) {
            this.brand = brand;
        }
        else {
            System.out.printf("Error message-Invalid brand: %s. Valid brands are: %s.\n ",
                    brand, Arrays.toString(VALID_BRANDS));
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (MIN_VOLUME <= volume && volume <= MAX_VOLUME){
                this.volume = volume;
                isMuted = false;
                    }
                else{
            System.out.printf("Invalid volume: %s. Valid range is %s to %s (inclusive).\n ",
                    volume, MIN_VOLUME, MAX_VOLUME);
        }
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    public static void setInstanceCount(int instanceCount) {
        Television.instanceCount = instanceCount;
    }

    public void mute() {
        if (!isMuted) {
            originalVolume = volume;
            setVolume(MIN_VOLUME);
            isMuted = true;
            System.out.println("Is muted");
        }
        else {
            volume = originalVolume;
            isMuted = false;
            System.out.println("Is un-muted");
        }
    }



    // To String
    public String toString(){
//    String volumeString = isMuted()? "<muted>" : String.valueOf(getVolume());

//    return String.format("Television: brand =%s, volume=%s, display=%s");
        return "Television: brand = " + getBrand() + ", volume to " + getVolume() +
                ", display = " + getDisplay() + ", isMuted = " + isMuted;
    }
}