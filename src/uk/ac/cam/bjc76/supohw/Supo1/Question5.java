package uk.ac.cam.bjc76.supohw.Supo1;

public class Question5 {
    public static void vectorAdd(String x,String y,char dx, char dy) {
        x=x+dx;
        y=y+dy;
//        return new String[]{x,y};
    }
    public static void main(String[] args) {
        String a="0";
        String b="2";
        vectorAdd(a,b,'a','b');
//        a = ab[0];
//        b = ab[1];
        System.out.println(a+"   "+b);
    }
}
