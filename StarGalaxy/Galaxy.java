import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Galaxy {
    private List<CelestialObject> celestialObjects;

    public Galaxy() {
        celestialObjects = new ArrayList<CelestialObject>();
    }

    public List<CelestialObject> getCelestialObjects() {
        return celestialObjects;
    }

    public void addCelestialObject(CelestialObject celestialObject) {
        this.celestialObjects.add(celestialObject);
    }

    public Map<String, Integer> computeMassRepartition() {
        Map<String, Integer> res = new HashMap<>();
        res.put("Star", 0);
        res.put("Planet", 0);
        res.put("Other", 0);
        for (CelestialObject obj : celestialObjects) {
            if (obj instanceof Star) {
                res.put("Star", res.get("Star") + obj.getMass());
            } else if (obj instanceof Planet) {
                res.put("Planet", res.get("Planet") + obj.getMass());
            } else {
                res.put("Other", res.get("Other") + obj.getMass());
            }
        }
        return res;
    }

}