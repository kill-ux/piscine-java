
public class CelestialObject {
    public double x;
    public double y;
    public double z;
    public String name;

    public CelestialObject() {
        this.name = "Soleil";
    }

    public CelestialObject(double x, double y, double z, String name) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }
}