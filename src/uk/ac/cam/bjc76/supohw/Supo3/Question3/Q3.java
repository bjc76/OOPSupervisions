package uk.ac.cam.bjc76.supohw.Supo3.Question3;

import java.util.ArrayList;
import java.util.Comparator;

public class Q3 {

    public static void main (String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car());
        cars.add(new Car());
        cars.sort(Comparator.comparing(Car::getManufacturer).thenComparing(Car::getAge));
    }

}
