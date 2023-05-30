package gr.aueb.cf.ch1;

/**
 * Εκτυπώνει το Hello World
 * στο standard output
 * @author sakis
 */
public class HelloWorld {
    public static void main(String[] args) {
        final double PI = 3.1415931;
        double radius = 1.5d;
        double area = 0;

        area = PI * radius*radius;
        System.out.println(area);

    }
}
