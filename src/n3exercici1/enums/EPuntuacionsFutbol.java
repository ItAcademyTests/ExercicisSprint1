package n3exercici1.enums;

public enum EPuntuacionsFutbol {
    FUTBOL(5),
    LLIGA_CAMPIONS(3),
    LLIGA(2),
    BARCA(1),
    MADRID(1),
    FERRAN_TORRES(1),
    BENZEMA(1);

    private int punts;

    EPuntuacionsFutbol(int punts) {
        this.punts = punts;
    }

    public int getPunts() {
        return punts;
    }
}
