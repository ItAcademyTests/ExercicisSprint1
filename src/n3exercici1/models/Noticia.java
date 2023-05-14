package n3exercici1.models;

public class Noticia extends Redaccio {

    private String titular;
    private String text;
    private int puntuacio;
    private int preu;

    public Noticia(String titular, String text) {
        this.titular = titular;
        this.text = text;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    public int getPreu() {
        return preu;
    }

    public String getTitular() {
        return titular;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(int puntuacio) {
        this.puntuacio = puntuacio;
    }

    @Override
    public String toString() {
        return "Noticia{" +
                "titular='" + titular + '\'' +
                ", texto='" + text + '\'' +
                ", puntuacio=" + puntuacio +
                ", preu=" + preu +
                '}';
    }
}
