package uk.ac.cam.bjc76.supohw.Supo3.Question6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public abstract class Race {
    protected Optional<Vehicle> winner = Optional.empty();
    private ArrayList<Vehicle> listOfVehicles = new ArrayList<>();

    public Race() {
        for (int i=0;i<4;i++) {
            Vehicle v = makeVehicle();
            listOfVehicles.add(v);
            v.setDriver("Driver n. "+i);
        }
    }

    public void doRace() {
        listOfVehicles.sort(Comparator.comparing(Vehicle::getHorsepower));
        winner = Optional.of(listOfVehicles.getFirst());
    }

    public Optional<Vehicle> getWinner() {
        return winner;
    }

    protected abstract Vehicle makeVehicle ();

}
