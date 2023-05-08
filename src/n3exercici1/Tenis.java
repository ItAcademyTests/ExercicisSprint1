package n3exercici1;

import java.util.HashMap;
import java.util.Map;

public class Tenis extends Noticia {

    private String competicio;
    private String tenistes;

    public Tenis(String titular, int puntuacio, int preu) {
        super(titular, puntuacio, preu);
    }

    public Map<String, Integer> assignarPunts() {
        Map<String, Integer> assignacioPunts = new HashMap<>();
        assignacioPunts.put("Tenis", 4);
        assignacioPunts.put("Federer", 3);
        assignacioPunts.put("Nadal ", 3);
        assignacioPunts.put("Djokovic", 3);
        return assignacioPunts;
    }

}
