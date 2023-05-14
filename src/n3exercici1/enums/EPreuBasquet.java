package n3exercici1.enums;

public enum EPreuBasquet {

    PREU_INICIAL(250),
    EUROLLIGA(75),
    BARCA(75),
    MADRID(75);

    private int preu;

    EPreuBasquet(int preu) {
        this.preu = preu;
    }

    public int getPreu() {
        return preu;
    }

}
