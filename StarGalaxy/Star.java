import java.util.Objects;

public class Star extends CelestialObject {
    private double magnitude;

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double new_value) {
        magnitude = new_value;
    }

    public Star() {
    }

    public Star(String name1, double x1, double y1, double z1, double magnitude1, int mass1) {
        super(name1, x1, y1, z1, mass1);
        magnitude = magnitude1;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Star)){
            return false;
        }
        Star star = (Star) other;
        return super.equals(star) && magnitude == star.magnitude;
    }

    @Override
    public String toString() {
        return String.format("%s shines at the %.3f magnitude", getName(), magnitude);
    }

    @Override
    public int hashCode() {
        return (int) Objects.hash(super.hashCode(),magnitude);
    }

}