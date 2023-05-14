package n3exercici1;

public class NoticiaBasquet extends Noticia {

    private String competicio;
    private String club;

    public NoticiaBasquet(String titular, String text, String competicio, String club) {
        super(titular, text);
        this.competicio = competicio;
        this.club = club;
    }

    public String getCompeticio() {
        return competicio;
    }

    public String getClub() {
        return club;
    }
}
