package uk.ac.cam.bjc76.supohw.Supo3.Question6;

public class BikeRace extends Race{
    private int avgHorsepower;

    @Override
    protected Vehicle makeVehicle() {
        return new Bike((int) Math.round(avgHorsepower*(Math.random()+2)));
    }

    public BikeRace(int avgHorsepower) {
        this.avgHorsepower = avgHorsepower;
    }
}