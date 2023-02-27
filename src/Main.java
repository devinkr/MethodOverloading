public class Main {

    public static void main(String[] args) {
        System.out.println("New score is " + calculateScore("Tim", 500));
        System.out.println("New score is " + calculateScore(10));

    }

    public static int calculateScore(String playerName, int score) {
        return score * 1000;
    }

    public static int calculateScore(int score) {
        return calculateScore("Anonymous", score);
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

//    Not overloaded because changing the return type does not change method signature.
//    public static void calculateScore() {
//        System.out.println("No player name, no player score");
//    }
}
