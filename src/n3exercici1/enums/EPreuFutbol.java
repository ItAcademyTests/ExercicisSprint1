package n3exercici1.enums;

public enum EPreuFutbol {

    PREU_INICIAL(300),
    LLIGA_CAMPIONS(100),
    BARCA(100),
    MADRID(100),
    FERRAN_TORRES(50),
    BENZEMA(50);

    private int preu;

    EPreuFutbol(int preu) {
        this.preu = preu;
    }

    public int getPreu() {
        return preu;
    }

}
