package n3exercici1.enums;

public enum EPuntuacionsMotociclisme {

    MOTOCICLISME(4),
    HONDA(5),
    YAMAHA(6);

    private int punts;

    EPuntuacionsMotociclisme(int punts) {
        this.punts = punts;
    }

    public int getPunts() {
        return punts;
    }

}
