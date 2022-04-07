package at.campus02.iwi.hiking;

import java.util.Arrays;

public class HikingApp {
    public static void main(String[] args) {
        Hiking a = new Hiking();
        a.print();
        System.out.println(a.totalNrObstacles('H'));
        System.out.println(Arrays.toString(a.countObstaclesPerRow(0)));
        System.out.println(a.ableToFinishHiking(10));

    }
}
