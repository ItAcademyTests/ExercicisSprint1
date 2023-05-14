package n3exercici1.enums;

public enum EPuntuacionsTenis {

    TENIS(4),
    GRAND_SLAM(5),
    WIMBLENDON(6),
    FEDERER(3),
    NADAL(3),
    DJOKOVIC(3);

    private int punts;

    EPuntuacionsTenis(int punts) {
        this.punts = punts;
    }

    public int getPunts() {
        return punts;
    }

}
