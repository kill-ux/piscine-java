
import java.util.Objects;

public class CelestialObject {
    private double x;
    private double y;
    private double z;
    private String name;
    private int mass;
    static final int KM_IN_ONE_AU = 150_000_000;

    public CelestialObject() {
        this.name = "Soleil";
    }

    public CelestialObject(String name, double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }

    public CelestialObject(String name1, double x1, double y1, double z1, int mass1) {
        this.x = x1;
        this.y = y1;
        this.z = z1;
        this.name = name1;
        this.mass = mass1;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public int getMass() {
        return this.mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public double getZ() {
        return this.z;
    }

    public String getName() {
        return this.name;
    }

    public void setX(double value) {
        this.x = value;
    }

    public void setY(double value) {
        this.y = value;
    }

    public void setZ(double value) {
        this.z = value;
    }

    public void setName(String value) {
        this.name = value;
    }

    public static double getDistanceBetween(CelestialObject star1, CelestialObject star2) {
        return Math.sqrt(
                Math.pow((star2.x - star1.x), 2) + Math.pow((star2.y - star1.y), 2) + Math.pow((star2.z - star1.z), 2));
    }

    public static double getDistanceBetweenInKm(CelestialObject star1, CelestialObject star2) {
        return getDistanceBetween(star1, star2) * KM_IN_ONE_AU;
    }

    @Override
    public String toString() {
        return String.format("%s is positioned at (%.3f, %.3f, %.3f)", this.name, this.x, this.y, this.z);
    }

    @Override
    public boolean equals(Object object) {
        CelestialObject star2 = (CelestialObject) object;
        return object == null ? false
                : star2.x == this.x && star2.y == this.y && star2.z == this.z && star2.name.equals(this.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.x, this.y, this.z);
    }
}