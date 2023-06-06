package gr.aueb.cf.ch1;

import gr.aueb.cf.ch1.model.Point;
import static java.lang.Math.abs;

/**
 * This class computes the area of a circle.
 * @author sakis
 */
public class HelloWorld {

    private Point point;

    public static void main(String[] args) {
        final double PI = 3.1415931;
        double radius = 1.5d;
        double area = 0;

        area = PI * radius*radius;

        //int abs = java.lang.Math.abs(-4); without import static
        int x = abs(-5);
        System.out.println(area);

    }
}
