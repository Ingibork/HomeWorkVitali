package habr;

public class Vector {

    private double x;
    private double y;
    private double z;


    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);

    }

    public double scalProiz(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    public Vector vectorProiz(Vector vector) {
        return new Vector(
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);
    }


}
