public class CelestialObject {
    private double x;
    private double y;
    private double z;
    private String name;
    private int mass;

    static final double KM_IN_ONE_AU = 150_000_000;

    public CelestialObject() {
        name = "Soleil";
    }

    public CelestialObject(String name1, double x1, double y1, double z1, int mass1) {
        x = x1;
        y = y1;
        z = z1;
        mass = mass1;
        name = name1;
    }

    public int getMass() {
        return mass;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public String getName() {
        return name;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public void setX(double new_value) {
        x = new_value;
    }

    public void setY(double new_value) {
        y = new_value;
    }

    public void setZ(double new_value) {
        z = new_value;
    }

    public void setName(String new_value) {
        name = new_value;
    }

    public static double getDistanceBetween(CelestialObject obj1, CelestialObject obj2) {
        return Math.sqrt(Math.pow(obj2.x - obj1.x, 2) + Math.pow(obj2.y - obj1.y, 2) + Math.pow(obj2.z - obj1.z, 2));

    }

    public static double getDistanceBetweenInKm(CelestialObject obj1, CelestialObject obj2) {
        return getDistanceBetween(obj1, obj2) * KM_IN_ONE_AU;
    }

    public String toString() {
        return String.format("%s is positioned at (%.3f, %.3f, %.3f)", name, x, y, z);
    }

    public boolean equals(Object other) {
        CelestialObject other1 = (CelestialObject) other;
        return other == null ? false : other1.x == x && other1.y == y && other1.z == z && other1.name.equals(name);
    }

    public int hashCode() {
        return (int) ((x * y * z * name.hashCode()) % 10_000_000);
    }

}