package n3exercici1.enums;

public enum EPuntuacionsF1 {

    F1(4),
    FERRARI(2),
    MERCEDES(2);

    private int punts;

    EPuntuacionsF1(int punts) {
        this.punts = punts;
    }

    public int getPunts() {
        return punts;
    }

}
