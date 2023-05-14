package n3exercici1.enums;

public enum EPreuF1 {

    PREU_INICIAL(100),
    FERRARI(50),
    MERCEDES(50);

    private int preu;

    EPreuF1(int preu) {
        this.preu = preu;
    }

    public int getPreu() {
        return preu;
    }

}
