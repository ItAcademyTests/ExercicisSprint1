package n3exercici1.models;

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
