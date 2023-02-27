public class SecondAndMinutes {

    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(-10));
        System.out.println(getDurationString(-10, 20));
        System.out.println(getDurationString(65, 61));
        System.out.println(getDurationString(65, -10));
        System.out.println(getDurationString(65, 60));


    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) return "Invalid Input: Seconds must be >= 0";

        int minutes = seconds / 60;
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) return "Invalid Input: Minutes must be >= 0";
        if (seconds < 0 || seconds > 60) return "Invalid Input: Seconds must be between 0 and 60";
        int totalSeconds = (minutes * 60) + seconds;
        return getDurationString(totalSeconds);
    }
}
