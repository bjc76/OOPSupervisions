package uk.ac.cam.bjc76.supohw.Supo3.Question6;

public class Bike extends Vehicle{
    public Bike (int horsepower) {
        super(horsepower);
        this.maxSpeed = Math.toIntExact(Math.round(horsepower * 0.5));
    }
}
