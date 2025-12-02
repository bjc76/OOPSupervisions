package uk.ac.cam.bjc76.supohw.Supo2.Question9;

public class IntegerToGuess {
    private final int value;

    public IntegerToGuess(int value) {
        this.value = value;
    }

    public boolean isCorrect(int a) {
        return value == a;
    }

    public String getDirection(int a) {
        if (a < value) {
            return "Go higher";
        } else {
            return "Go lower";
        }
    }

    public int getValue() {
        return value;
    }



}
