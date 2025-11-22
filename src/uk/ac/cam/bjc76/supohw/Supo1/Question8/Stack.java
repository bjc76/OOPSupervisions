package uk.ac.cam.bjc76.supohw.Supo1.Question8;

import java.util.ArrayList;

public class Stack {
    ArrayList<Object> objList;
    int topPointer;

    public Stack () {
        topPointer = -1;
        objList = new ArrayList<>();
    }

    public Object pop () {
        if (topPointer == -1) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            topPointer -= 1;
            return objList.get(topPointer+1);
        }

    }

    public Object peek () {
        if (topPointer == -1) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            return objList.get(topPointer);
        }
    }

    public void push (Object a) {
        topPointer += 1;
        objList.add(topPointer, a);
    }

    public int size () {
        return topPointer+1;
    }

    public boolean isEmpty () {
        if (topPointer == -1) {
            return true;
        } else {
            return false;
        }
    }


}
