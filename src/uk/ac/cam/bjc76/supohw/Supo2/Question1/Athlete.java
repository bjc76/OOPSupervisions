package uk.ac.cam.bjc76.supohw.Supo2.Question1;

import java.util.HashMap;

abstract class Athlete {
    HashMap<String, Double> personalBestTimes;
    String name;

    public Athlete(String name) {
        this.name = name;
    }

    public Double getPersonalBest(String event) {
        return personalBestTimes.get(event);
    }

    abstract int getWorldRanking(String event);
}
