
import java.util.Objects;

public class Star extends CelestialObject {
    private double magnitude;

    public Star() {
        // super();
    }

    // public Star(String name, double x, double y, double z, double mass1) {
    //     super(name, x, y, z, (int) mass1);
    //     this.magnitude = 0.0;
    // }

    public Star(String name, double x, double y, double z, double magnitude, int mass1) {
        super(name, x, y, z, mass1);
        this.magnitude = magnitude;
    }

    public double getMagnitude() {
        return this.magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    @Override
    public int hashCode() {
        return (int) Objects.hash(super.hashCode(), this.magnitude);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Star) {
            Star star1 = (Star) object;
            return super.equals(star1) && this.magnitude == star1.magnitude;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("%s shines at the %.3f magnitude", super.getName(), this.magnitude);
    }
}
