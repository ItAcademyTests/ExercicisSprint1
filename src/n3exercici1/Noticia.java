package n3exercici1;

public class Noticia extends Redaccio {

    private String titular;
    private String texto;
    private int puntuacio;
    private int preu;

    public Noticia(String titular, int puntuacio, int preu) {
    }

    public Noticia(String titular) {
        this.titular = titular;
        this.texto = "";
    }


    /*public static int calcularPuntuacioNoticia(String tipusNoticia, String jugador, String club, String lliga) {
        if ()
        return EPuntuacions.FUTBOL.getPunts() + club + lliga;
    }*/

    /*public int calcularPuntuacioNoticia2(String tipusEsport, String club, String lliga) {
        if (tipusEsport.equals(EPuntuacions.FUTBOL)) {

        }
        return EPuntuacions.FUTBOL.getPunts() + club + lliga;
    }*/

    /*public int calcularPreuNoticia(String tipusNoticia) {
        var totalPunts = 0;
        switch (tipusNoticia) {
            case "Futbol":
                totalPunts: EPuntuacions.FUTBOL.getPunts();
                break;
        }
        if (tipusNoticia.equals("Futbol")) {
            return EPuntuacions.FUTBOL.getPunts();
        }
        if ()
    }*/

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(int puntuacio) {
        this.puntuacio = puntuacio;
    }

    public int getPreu() {
        return preu;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    @Override
    public String toString() {
        return "Noticia{" +
                "titular='" + titular + '\'' +
                ", texto='" + texto + '\'' +
                ", puntuacio=" + puntuacio +
                ", preu=" + preu +
                '}';
    }
}
