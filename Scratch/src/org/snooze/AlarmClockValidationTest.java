package org.snooze;

class AlarmClockValidationTest {

    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();

        clock.setSnoozeInterval(1);
        System.out.println(clock);
        System.out.println();

        clock.setSnoozeInterval(20);
        System.out.println(clock);
        System.out.println();

        clock.setSnoozeInterval(0);
        System.out.println(clock);
        System.out.println();

        clock.setSnoozeInterval(21);
        System.out.println(clock);


}
}