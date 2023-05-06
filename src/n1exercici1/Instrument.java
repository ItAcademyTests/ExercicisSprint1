package n1exercici1;

public abstract class Instrument {

    private String nom;
    private Double preu;

    public Instrument(String nom, Double preu) {
        this.nom = nom;
        this.preu = preu;
    }

    public abstract void tocar();

}
