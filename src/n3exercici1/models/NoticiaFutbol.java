package n3exercici1.models;

public class NoticiaFutbol extends Noticia {

    private String competicio;
    private String club;
    private String jugador;

    public NoticiaFutbol(String titular, String text, String competicio, String club, String jugador) {
        super(titular, text);
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;
    }

    public String getCompeticio() {
        return competicio;
    }

    public String getClub() {
        return club;
    }

    public String getJugador() {
        return jugador;
    }

}
