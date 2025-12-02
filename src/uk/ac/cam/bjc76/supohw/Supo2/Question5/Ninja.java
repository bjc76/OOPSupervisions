package uk.ac.cam.bjc76.supohw.Supo2.Question5;

public interface Ninja {
    default void throwKnife() {
        System.out.println("Thrown knife");
    }

    default void blockSomething() {
        System.out.println("Something blocked");
    }
}
