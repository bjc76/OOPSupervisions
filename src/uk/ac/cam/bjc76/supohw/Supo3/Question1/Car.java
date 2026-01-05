package uk.ac.cam.bjc76.supohw.Supo3.Question1;

public class Car {
    private int horsepower;
    private String numberPlate;
    public static int numberOfCars;

    public Car (int horsepower, String numberPlate) {
        this.horsepower = horsepower;
        this.numberPlate = numberPlate;
        numberOfCars++;
    }

    public int getHorsepower () {
        return horsepower;
    }

    public static int getNumberOfCars () {
        return numberOfCars;
    }

    public static void deleteCars () {
        numberOfCars--;
    }

    public static void main (String [] args) {
        Car aPorsche = new Car(500, "asdfas");
        System.out.println(aPorsche.getHorsepower());
        System.out.println(Car.getNumberOfCars());
    }
}
