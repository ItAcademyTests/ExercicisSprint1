package n3exercici1.enums;

public enum EPreuMotociclisme {

    PREU_INICIAL(100),
    HONDA(100),
    YAMAHA(100);

    private int preu;

    EPreuMotociclisme(int preu) {
        this.preu = preu;
    }

    public int getPreu() {
        return preu;
    }

}
