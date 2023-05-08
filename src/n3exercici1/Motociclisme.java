package n3exercici1;

import java.util.HashMap;
import java.util.Map;

public class Motociclisme extends Noticia {

    private String equip;

    public Motociclisme(String titular, int puntuacio, int preu) {
        super(titular, puntuacio, preu);
    }

    public Map<String, Integer> assignarPunts() {
        Map<String, Integer> assignacioPunts = new HashMap<>();
        assignacioPunts.put("Motociclisme", 3);
        assignacioPunts.put("Honda", 3);
        assignacioPunts.put("Yamaha ", 3);
        return assignacioPunts;
    }

}
