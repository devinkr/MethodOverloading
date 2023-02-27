public class OverloadChallenge {

    public static void main(String[] args) {

        System.out.println("100 inches is " + convertToCentimeters(100) + "cm");
        System.out.println("5 feet 10 inches is " + convertToCentimeters(5, 10) + "cm");

    }

    public static double convertToCentimeters(int heightInInches) {
        return heightInInches * 2.54d;
    }

    public static double convertToCentimeters(int heightInFeet, int remainingInches) {
        int totalInches = (heightInFeet * 12) + remainingInches;
        return convertToCentimeters(totalInches);
    }
}
