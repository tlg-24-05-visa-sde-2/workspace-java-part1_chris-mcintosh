/*
 *Application or system class model the workings of a television
 * It has properties/attributes, it has business methods, but NO main() method.
 */
class Television {
    // class-level ("static") variables - these live in the "shared-area" up above
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;

    private static int instanceCount = 0;

    //This method is also up there in the shared zone. It does not execute inside the Television objects
    public static int getInstanceCount(){
        return instanceCount;
    }

    // --------------------------------------------------------

    // properties or attributes - "fields" or "instance variables"
    private String brand = "Toshiba"; //brand name
    private int volume = 1; //current volume
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

    public void setBrand(String brand) {
        if (brand.equals("Toshiba") ||
                brand.equals ("Sony") ||
                brand.equals ("APPLE") ||
                brand.equals ("Spectre")||
                brand.equals ("Samsung") ||
                brand.equals ("LG"))
        {
            this.brand = brand;
        }
       else {
            System.out.println("Error: Brand must be Toshiba, Sony, Samsung, LG, or Samsung");

        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < MIN_VOLUME || volume > MAX_VOLUME){
            System.out.println("Error: Volume must be between " + MIN_VOLUME + " and " + MAX_VOLUME);
        }
        else {
        this.volume = volume;
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

        return "Television: brand = " + getBrand() + ", volume to " + getVolume() +
                ", display = " + getDisplay() + ", isMuted = " + isMuted;
    }
}