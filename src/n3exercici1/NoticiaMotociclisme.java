package n3exercici1;

import java.util.HashMap;
import java.util.Map;

public class NoticiaMotociclisme extends Noticia {

    private String equip;

    public NoticiaMotociclisme(String titular, String text, String equip) {
        super(titular, text);
        this.equip = equip;
    }

    public String getEquip() {
        return equip;
    }
}
