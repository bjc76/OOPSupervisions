package uk.ac.cam.bjc76.supohw.Supo2.Question4;

public class Child extends Parent{
    int a = 5;

    public void times2() {
        System.out.println("Calculating times2 in child class");
        this.a = this.a * 10;
    }
}
