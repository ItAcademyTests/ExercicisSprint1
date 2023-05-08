package n3exercici1;

import java.util.HashMap;
import java.util.Map;

public class F1 extends Noticia {

    private String escuderia;

    public F1(String titular, int puntuacio, int preu) {
        super(titular, puntuacio, preu);
    }

    public Map<String, Integer> assignarPunts() {
        Map<String, Integer> assignacioPunts = new HashMap<>();
        assignacioPunts.put("F1", 4);
        assignacioPunts.put("Ferrari", 2);
        assignacioPunts.put("Mercedes ", 3);
        return assignacioPunts;
    }

}
