import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Galaxy {
    private List<CelestialObject> celestialObjects;
    private int mass;

    public Galaxy(){
        this.celestialObjects = new ArrayList<>();
    }

    public List<CelestialObject> getCelestialObjects() {
        return celestialObjects;
    }

    public void addCelestialObject(CelestialObject obj) {
        this.celestialObjects.add(obj);
    }

    public Map<String,Double> computeMassRepartition(){
        HashMap res = new HashMap<>();
        for (CelestialObject obj : this.celestialObjects) {
            String key = if (obj instanceof Planet) {
                "Planet"
            } else {
                "Other"
            };
        }
        return new HashMap<>();
    }
}
