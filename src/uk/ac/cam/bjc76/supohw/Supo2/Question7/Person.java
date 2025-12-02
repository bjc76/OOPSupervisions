package uk.ac.cam.bjc76.supohw.Supo2.Question7;

public class Person {
    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return String.format(
                "Firstname: %s, Lastname: %s",
                this.firstName, this.lastName
        );
    }

}
