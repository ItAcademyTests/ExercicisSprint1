package n3exercici1.enums;

public enum EPreuTenis {

    PREU_INICIAL(150),
    FEDERER(100),
    NADAL(100),
    DJOKOVIC(100),
    GRAND_SLAM(600),
    WIMBLENDON(700);

    private int preu;

    EPreuTenis(int preu) {
        this.preu = preu;
    }

    public int getPreu() {
        return preu;
    }

}
