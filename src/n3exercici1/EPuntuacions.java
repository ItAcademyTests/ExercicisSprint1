package n3exercici1;

public enum EPuntuacions {

    FUTBOL(5),
    LLIGA_DE_CAMPIONS(3),
    LLIGA(2),
    BARCA(1),
    MADRID(1),
    FERRAN_TORRES(1),
    BENZEMA(1),
    BASQUET(4),
    EUROLLIGA(3),
    ACB(2),
    TENIS(4),
    FEDERER(3),
    NADAL(3),
    DJOKOVIC(3),
    F1(4),
    FERRARI(2),
    MERCEDES(3),
    MOTOCICLISME(3),
    HONDA(3),
    YAMAHA(3);


    private int punts;

    private EPuntuacions(int punts) {
        this.punts = punts;
    }

    public int getPunts() {
        return punts;
    }

}