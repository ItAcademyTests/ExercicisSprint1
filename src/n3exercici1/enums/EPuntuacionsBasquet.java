package n3exercici1.enums;

public enum EPuntuacionsBasquet {

    BASQUET(4),
    EUROLLIGA(3),
    ACB(2),
    BARCA(1),
    MADRID(1);

    private int punts;

    EPuntuacionsBasquet(int punts) {
        this.punts = punts;
    }

    public int getPunts() {
        return punts;
    }

}
