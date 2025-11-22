package uk.ac.cam.bjc76.supohw.Supo1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Question4 {
    public static void main (String[] args) {
        Question4 a = new Question4();
        int[] checksum = a.positives(new int[] {-2});
        for (int n : checksum) {
            System.out.println(n);
        }
    }

    public int sum (int[] a) {
        int total = 0;
        for (int i : a) {
            total += i;
        }
        return total;
    }

    public int[] cumsum (int[] a) {
        for (int i=1; i < a.length; i++) {
            a[i] = a[i] + a[i-1];
        }
        return a;
    }

    public int[] positives (int[] a) {
        ArrayList<Integer> accum = new ArrayList<>();
        for (int n : a) {
            if (n>0) {
                accum.add(n);
            }
        }
        int[] l = new int[accum.size()];
        for (int i = 0; i < accum.size(); i++) {
            l[i] = accum.get(i);
        }

        return l;

    }

}
