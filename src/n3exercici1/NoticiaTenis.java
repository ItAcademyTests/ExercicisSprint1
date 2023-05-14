package n3exercici1;

import java.util.HashMap;
import java.util.Map;

public class NoticiaTenis extends Noticia {

    private String competicio;
    private String tenista;

    public NoticiaTenis(String titular, String text, String competicio, String tenista) {
        super(titular, text);
        this.competicio = competicio;
        this.tenista = tenista;
    }

    public String getCompeticio() {
        return competicio;
    }

    public String getTenista() {
        return tenista;
    }
}
