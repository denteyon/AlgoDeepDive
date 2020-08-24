public class ClockAngle {
    public static double calculateClockAngle(int hour, int minute) {
        if (hour < 0 || minute < 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        if (hour == 12) {
            hour = 0;
        }
        if (minute == 60) {
            minute = 0;
            hour++;
        }
        double minuteAngle = 6 * minute; // 60min -> 360'
        double hourAngle = ((double) minute / 2) + ((double) hour * 30); // 30min -> 15' / 1hr -> 30'
        double clockAngle = Math.abs(minuteAngle - hourAngle);
        clockAngle = Math.min(360 - clockAngle, clockAngle);
        return clockAngle;
    }

    public static void main(String[] args) {
        System.out.println(calculateClockAngle(1, 45));
        System.out.println(calculateClockAngle(3, 15));
        System.out.println(calculateClockAngle(9, 15));
    }
}
