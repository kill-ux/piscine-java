import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class WeddingComplex {
    public static Map<String, String> createBestCouple(Map<String, List<String>> first,
            Map<String, List<String>> second) {
        Map<String, String> map = new HashMap<>();

        // Create working copies to avoid modifying original lists
        Map<String, List<String>> workingFirst = new HashMap<>();
        for (Map.Entry<String, List<String>> entry : first.entrySet()) {
            workingFirst.put(entry.getKey(), new ArrayList<>(entry.getValue()));
        }

        boolean changed;
        do {
            changed = false;

            for (Map.Entry<String, List<String>> entry : workingFirst.entrySet()) {
                String person = entry.getKey();
                List<String> prefs = entry.getValue();

                if (map.containsKey(person))
                    continue; // Already engaged

                if (!prefs.isEmpty()) {
                    String preferred = prefs.get(0);

                    // Check if preferred partner exists in second map
                    if (!second.containsKey(preferred)) {
                        prefs.remove(0); // Remove invalid preference
                        changed = true;
                        continue;
                    }

                    if (!map.containsKey(preferred)) {
                        // No conflict
                        map.put(person, preferred);
                        // map.put(preferred, person);
                        changed = true;
                    } else {
                        String currentPartner = map.get(preferred);
                        List<String> partnerPrefs = second.get(preferred);

                        // Check if preferences exist
                        if (partnerPrefs == null) {
                            prefs.remove(0); // Remove invalid preference
                            changed = true;
                            continue;
                        }

                        int currentRank = partnerPrefs.indexOf(currentPartner);
                        int newRank = partnerPrefs.indexOf(person);

                        // Handle case where person is not in partner's preferences
                        if (newRank == -1) {
                            prefs.remove(0); // Remove invalid preference
                            changed = true;
                            continue;
                        }

                        if (currentRank == -1 || newRank < currentRank) {
                            // Reassign engagement
                            map.remove(currentPartner);
                            map.remove(preferred);

                            map.put(person, preferred);
                            map.put(preferred, person);

                            // The rejected person needs to propose again
                            if (workingFirst.containsKey(currentPartner)) {
                                // Remove the failed preference and mark for reproposal
                                List<String> rejectedPrefs = workingFirst.get(currentPartner);
                                if (!rejectedPrefs.isEmpty()) {
                                    rejectedPrefs.remove(0);
                                }
                            }
                            changed = true;
                        }
                    }
                }
            }

        } while (changed);

        return map;
    }
}