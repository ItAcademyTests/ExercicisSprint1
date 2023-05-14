package n3exercici1.enums;

public enum EPuntuacions {

    //Futbol
    FUTBOL(5),
    LLIGA_DE_CAMPIONS(3),
    LLIGA(2),
    BARCA(1),
    MADRID(1),
    FERRAN_TORRES(1),
    BENZEMA(1),

    //Basquet
    BASQUET(4),
    EUROLLIGA(3),
    ACB(2),

    //Tenis
    TENIS(4),
    FEDERER(3),
    NADAL(3),
    DJOKOVIC(3),

    //F1
    F1(4),
    FERRARI(2),
    MERCEDES(3),

    //Motociclisme
    MOTOCICLISME(3),
    HONDA(3),
    YAMAHA(3);


    private int punts;

    EPuntuacions(int punts) {
        this.punts = punts;
    }

}
