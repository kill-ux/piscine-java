import java.util.Objects;

public class Planet extends CelestialObject {
    private Star centerStar;

    public Planet() {
        super();
        centerStar = new Star();
    }

    public Planet(String name1, double x1, double y1, double z1, Star center, int mass1) {
        super(name1, x1, y1, z1, mass1);
        centerStar = center;
    }

    public Star getCenterStar() {
        return centerStar;
    }

    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Planet)) {
            return false;
        }
        Planet planet = (Planet) other;
        return super.equals(planet) && centerStar.equals(planet.centerStar);
    }

    @Override
    public int hashCode() {
        return (int) Objects.hash(super.hashCode(), centerStar.hashCode());
    }

    @Override
    public String toString() {
        return String.format("%s circles around %s at the %.3f AU", super.getName(), centerStar.getName(),
                super.getDistanceBetween(centerStar, this));
    }

}