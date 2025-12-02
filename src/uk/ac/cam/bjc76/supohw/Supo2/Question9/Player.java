package uk.ac.cam.bjc76.supohw.Supo2.Question9;

public class Player {
    String name;
    int lowestScore = -1;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void updateLowestScore(int newScore) {
        if (newScore<lowestScore || lowestScore==-1) {
            lowestScore = newScore;
        }
    }

    public int getLowestScore() {
        return lowestScore;
    }

    public String getPlayerInfo() {
        if (lowestScore != -1) {
            return String.format("Player name: %s\nLowest score: %d\n", name, lowestScore);
        } else {
            return String.format("Player name: %s\n(Not successfully guessed the number", name);
        }
    }

}
