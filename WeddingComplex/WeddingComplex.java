import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class WeddingComplex {
    public static Map<String, String> createBestCouple(Map<String, List<String>> first,
            Map<String, List<String>> second) {
        Map<String, String> engagements = new HashMap<>(); // Maps first map members to their partners
        Map<String, String> reverseEngagements = new HashMap<>(); // Maps second map members to their partners
        Map<String, List<String>> workingFirst = new HashMap<>();

        // Create working copies of preference lists
        for (Map.Entry<String, List<String>> entry : first.entrySet()) {
            workingFirst.put(entry.getKey(), new ArrayList<>(entry.getValue()));
        }

        boolean changed;
        do {
            changed = false;
            for (Map.Entry<String, List<String>> entry : workingFirst.entrySet()) {
                String person = entry.getKey();
                List<String> prefs = entry.getValue();

                // Skip if already engaged or no preferences left
                if (engagements.containsKey(person) || prefs.isEmpty()) {
                    continue;
                }

                // Propose to the top preference
                String preferred = prefs.get(0);

                // Remove the preference (simulating a proposal)
                prefs.remove(0);
                changed = true;

                // Check if preferred partner exists in second map
                if (!second.containsKey(preferred)) {
                    continue; // Invalid preference, move to next
                }

                if (!reverseEngagements.containsKey(preferred)) {
                    // Preferred is free, form engagement
                    engagements.put(person, preferred);
                    reverseEngagements.put(preferred, person);
                } else {
                    // Preferred is already engaged, check preferences
                    String currentPartner = reverseEngagements.get(preferred);
                    List<String> partnerPrefs = second.get(preferred);

                    // Find ranks in partner's preference list
                    int currentRank = partnerPrefs.indexOf(currentPartner);
                    int newRank = partnerPrefs.indexOf(person);

                    // If person is not in partner's preferences, skip
                    if (newRank == -1) {
                        continue;
                    }

                    // If new proposer is preferred over current partner
                    if (newRank < currentRank) {
                        // Break current engagement
                        engagements.remove(currentPartner);
                        reverseEngagements.remove(preferred);

                        // Form new engagement
                        engagements.put(person, preferred);
                        reverseEngagements.put(preferred, person);
                    }
                }
            }
        } while (changed && engagements.size() < first.size());

        return engagements;
    }
}