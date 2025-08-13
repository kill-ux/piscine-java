import java.util.Objects;

public class Planet extends CelestialObject {
    private Star centerStar;

    public Planet() {
        super();
        this.centerStar = new Star();
    }

    public Planet(String name, double x, double y, double z,  Star centerStar) {
        super(name, x, y, z);
        this.centerStar = centerStar;
    }

    public Planet(String name, double x, double y, double z, Star centerStar, int mass) {
        super(name, x, y, z, mass);
        this.centerStar = centerStar;
    }

    public Star getCenterStar() {
        return centerStar;
    }

    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), centerStar.hashCode());
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Planet) {
            Planet planet = (Planet) object;
            return super.equals(planet) && this.centerStar.equals(planet.getCenterStar());
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("%s circles around %s at the %.3f AU", this.getName(), this.centerStar.getName(),
                this.getDistanceBetween(this.centerStar, this));
    }

}
