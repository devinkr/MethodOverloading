public class SecondAndMinutes {

    public static void main(String[] args) {
        System.out.printf(getDurationString(5000));
    }

    public static String getDurationString(int seconds) {
        int finalHours = 0;
        int finalMinutes = 0;
        int finalSeconds = seconds;
        if (finalSeconds < 0) return "Invalid Input: Seconds must be >= 0";
        if (finalSeconds >= 3600) {
            finalHours = finalSeconds / 3600;
            finalSeconds = finalSeconds % 3600;
        }
        if (finalSeconds >= 60) {
            finalMinutes = finalSeconds / 60;
            finalSeconds = finalSeconds % 60;
        }
        return finalHours + "h " + finalMinutes + "m " + finalSeconds + "s";
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) return "Invalid Input: Minutes must be >= 0";
        if (seconds < 0 || seconds > 60) return "Invalid Input: Seconds must be between 0 and 60";
        int totalSeconds = (minutes * 60) + seconds;
        return getDurationString(totalSeconds);
    }
}
