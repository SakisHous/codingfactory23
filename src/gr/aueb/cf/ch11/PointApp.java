package gr.aueb.cf.ch11;

public class PointApp {

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(1, 2);
        Point p3 = new Point();

        Point p4 = Point.getRandomPoint();

        p1.setX(3);
        p1.setY(12);

        System.out.println(p1.pointToString());
        System.out.println(p2.pointToString());
        System.out.println(p4.pointToString());
    }
}
