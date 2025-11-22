package uk.ac.cam.bjc76.supohw.Supo1.Question67;

public class Question6 {
    public static void main (String[] args) {
        SingleLinkedListHead a = new SingleLinkedListHead(new int[] {1,2,3,4,5});
        a.append(13);
        a.remove(2);
        System.out.println(a.get(4));
        a.insert(100, 0);
        System.out.println(a.length());
    }


}
