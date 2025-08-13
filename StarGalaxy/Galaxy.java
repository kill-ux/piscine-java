import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Galaxy {
    private List<CelestialObject> celestialObjects;

    public Galaxy() {
        this.celestialObjects = new ArrayList<>();
    }

    public List<CelestialObject> getCelestialObjects() {
        return celestialObjects;
    }

    public void addCelestialObject(CelestialObject obj) {
        this.celestialObjects.add(obj);
    }

    public Map<String, Integer> computeMassRepartition() {
        HashMap<String, Integer> map = new HashMap<>();
        for (CelestialObject obj : this.celestialObjects) {
            String key = (obj instanceof Planet) ? "Planet" : (obj instanceof Star) ? "Star" : "Other";
            // map.compute(key, (k, v) -> v == null ? 0 : v + obj.getMass());
            map.merge(key, obj.getMass(), Integer::sum);
        }
        return map;
    }
}
