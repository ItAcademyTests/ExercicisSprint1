package n3exercici1;

import java.util.HashMap;
import java.util.Map;

public class AssignacioPunts {

    public Map<String, Integer> assignarPunts() {
        Map<String, Integer> assignacioPunts = new HashMap<>();
        assignacioPunts.put("Futbol", 5);
        assignacioPunts.put("Lliga de campions", 3);
        assignacioPunts.put("Lliga", 2);
        assignacioPunts.put("Barça", 1);
        assignacioPunts.put("Madrid", 1);
        assignacioPunts.put("Ferran Torres", 1);
        assignacioPunts.put("Benzema", 1);
        return assignacioPunts;
    }
}