package uk.ac.cam.bjc76.supohw.Supo3.Question6;

public class Event {
    public static void main (String[] args) {
        CarRace carRace = new CarRace(200);
        BikeRace bikeRace = new BikeRace(150);
        carRace.doRace();
        System.out.println(carRace.getWinner().get());
        bikeRace.doRace();
        System.out.println(bikeRace.getWinner().get());
    }
}
