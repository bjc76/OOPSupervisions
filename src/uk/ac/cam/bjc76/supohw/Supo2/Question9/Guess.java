package uk.ac.cam.bjc76.supohw.Supo2.Question9;

public class Guess {
    int guessValue;
    int guessNumber;
    String direction;

    public Guess(int guessValue, int guessNumber, String direction) {
        this.guessValue = guessValue;
        this.guessNumber = guessNumber;
        this.direction = direction;
    }

    private String calculateCardinalSuffix() {
        int r = guessNumber % 10;
        if (r == 1) {
            return "st";
        } else if (r == 2 && guessNumber != 12) {
            return "nd";
        } else {
            return "th";
        }
    }

    public String toString() {
        return String.format("You need to %s than %d, your %s guess",
                direction,
                guessValue,
                guessNumber+calculateCardinalSuffix()
                );
    }

}
