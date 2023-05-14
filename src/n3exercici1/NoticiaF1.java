package n3exercici1;

import java.util.HashMap;
import java.util.Map;

public class NoticiaF1 extends Noticia {

    private String escuderia;

    public NoticiaF1(String titular, String text, String escuderia) {
        super(titular, text);
        this.escuderia = escuderia;
    }

    public String getEscuderia() {
        return escuderia;
    }
}
