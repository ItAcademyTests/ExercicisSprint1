package n3exercici1.models;

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
