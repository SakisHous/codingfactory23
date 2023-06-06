package gr.aueb.cf.ch11;

/**
 * Immuatable 3D point
 */
public final class Point3D {

    private final Point point;
    private final int z;

    public Point3D() {
        point = new Point();
        z = 0;
    }

    public Point3D(Point point, int z) {
//        this.point = point; είναι λάθος δεν είναι immutable τα περιεχόμενα μπορούν να αλλάξουν πχ απο την Main
        this.point = new Point(point.getX(), point.getY());
        this.z = z;
    }

    public Point getPoint() {
//        return point;
        return new Point(this.point.getX(), this.point.getY());
    }

    public int getZ() {
        return z;
    }
}
