package uk.ac.cam.bjc76.supohw.Supo3.Question6;

public class Car extends Vehicle{
    public Car (int horsepower) {
        super(horsepower);
        this.maxSpeed = Math.toIntExact(Math.round(horsepower * 0.3));
    }
}
