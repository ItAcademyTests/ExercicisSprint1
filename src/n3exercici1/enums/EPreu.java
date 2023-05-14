package n3exercici1.enums;

public enum EPreu {

    //Futbol
    FUTBOL(300),
    LLIGA_DE_CAMPIONS(100),
    BARCA_FUTBOL(100),
    MADRID_FUTBOL(100),
    FERRAN_TORRES(50),
    BENZEMA(50),

    //Basquet
    BASQUET(250),
    EUROLLIGA(75),
    BARCA_BASQUET(100),
    MADRID_BASQUET(100),

    //Tenis
    TENIS(150),
    FEDERER(100),
    NADAL(100),
    DJOKOVIC(100),

    //F1
    F1(100),
    FERRARI(50),
    MERCEDES(50),

    //Motociclisme
    MOTOCICLISME(100),
    HONDA(50),
    YAMAHA(50);


    private int preu;

    private EPreu(int preu) {
        this.preu = preu;
    }

    public int getPreu() {
        return preu;
    }
}
