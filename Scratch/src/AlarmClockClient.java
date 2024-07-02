/*
 * Client side "main-class," i.e., the class definition with main()
 * That's the ONLY thing in here.
 * We will create a few Alarm Clock objects and give them a basic test-drive
 */
class AlarmClockClient {

    // starting point or "entry" point for every standalone Java application
    public static void main(String[] args) {
        //create an instance (or object) of AlarmClock and set its snoozeInterval
        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(7);
        clock1.toString();

        //create a second alarm clock object and set its snoozeInterval, also
        AlarmClock clock2 = new AlarmClock(10);

        //create a 3rd AlarmClock object, but this time DON'T give it a snooze interval
        AlarmClock clock3 = new AlarmClock();


        // make them snooze()
        clock1.snooze();
        clock2.snooze();
        clock3.snooze();
        //show their toString() methods in action
        System.out.println(clock1.toString());
        System.out.println(clock2.toString());
        System.out.println(clock3.toString());
    }
}



