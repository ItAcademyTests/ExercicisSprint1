package n3exercici1.enums;

public enum TipusNoticia {

    FUTBOL("Futbol"),
    BASQUET("Basquet"),
    TENIS("Tenis"),
    MOTOCICLISME("Moticiclisme"),
    F1("F1");

    private String tipusNoticia;

    TipusNoticia(String tipusNoticia) {
        this.tipusNoticia = tipusNoticia;
    }

    public String getTipusNoticia() {
        return tipusNoticia;
    }
}
