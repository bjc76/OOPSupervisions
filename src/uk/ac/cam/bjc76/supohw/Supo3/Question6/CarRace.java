package uk.ac.cam.bjc76.supohw.Supo3.Question6;

public class CarRace extends Race{
    private int avgHorsepower;

    @Override
    protected Vehicle makeVehicle() {
        return new Car((int) Math.round(avgHorsepower*(Math.random()+1)));
    }

    public CarRace(int avgHorsepower) {
        this.avgHorsepower = avgHorsepower;
    }
}
