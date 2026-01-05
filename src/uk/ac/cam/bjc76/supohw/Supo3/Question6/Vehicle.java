package uk.ac.cam.bjc76.supohw.Supo3.Question6;

public abstract class Vehicle {
    private int horsepower;
    protected int maxSpeed;
    private String driver;

    public Vehicle (int horsepower) {this.horsepower = horsepower;}
    public void setDriver (String driver) {this.driver = driver;}
    public String getDriver() {return driver;}

    public int getHorsepower() {
        return horsepower;
    }
}
