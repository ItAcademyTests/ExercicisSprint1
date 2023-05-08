package n3exercici1;

import java.util.HashMap;
import java.util.Map;

public class Basquet extends Noticia {

    private String competicio;
    private String club;

    public Basquet(String titular, int puntuacio, int preu) {
        super(titular, puntuacio, preu);
    }

    public Map<String, Integer> assignarPunts() {
        Map<String, Integer> assignacioPunts = new HashMap<>();
        assignacioPunts.put("Basquet", 4);
        assignacioPunts.put("Eurolliga", 3);
        assignacioPunts.put("ACB", 2);
        assignacioPunts.put("Barça", 1);
        assignacioPunts.put("Madrid", 1);
        return assignacioPunts;
    }

}
