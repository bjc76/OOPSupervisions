package uk.ac.cam.bjc76.supohw.Supo2.Question4;

import java.util.ArrayList;

public class DynamicPolymorphism {
    public ArrayList<Parent> myArray = new ArrayList<>();

    public DynamicPolymorphism(int a) {
        if (a > 0) {
            myArray.addLast(new Parent());
        } else {
            myArray.addLast(new Child());
        }
    }



    public static void main(String[] args) {
        DynamicPolymorphism myObj = new DynamicPolymorphism(0);
        for (Parent a: myObj.myArray) {
            a.times2();
        }
    }
}
