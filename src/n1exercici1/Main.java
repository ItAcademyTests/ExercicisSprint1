package n1exercici1;

public class Main {

    public static void main(String[] args) {

        InstrumentVent instrumentVent = new InstrumentVent("Flauta", 12.5);
        InstrumentCorda instrumentCorda = new InstrumentCorda("Baix elèctric", 295.0);
        InstrumentPercusio instrumentPercusio = new InstrumentPercusio("Caixa", 25.5);

        instrumentVent.tocar();
        instrumentCorda.tocar();
        instrumentPercusio.tocar();

    }

}


