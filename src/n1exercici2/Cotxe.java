package n1exercici2;

public class Cotxe {

    private static final String MARCA = "SEAT";
    private static String model;
    private final int potencia = 150;

    public Cotxe(String model) {
        this.model = model;
    }

    public static void frenar() {
        System.out.println("El vehicle està frenant");
    }

    public void accelerar() {
        System.out.println("El vehicle està accelerant");
    }

}
