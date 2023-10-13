package Interface_Comparator;

import Interface_Comparable.Circle;

import java.util.Arrays;


public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle();
        circles[1] = new Circle(3.6);
        circles[2] = new Circle(3.5);

        System.out.println("Pre-sorted");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        var circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

    }
}
