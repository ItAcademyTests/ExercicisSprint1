package n1exercici1;

public class InstrumentCorda extends Instrument {

    public InstrumentCorda(String nom, Double preu) {
        super(nom, preu);
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de corda");
    }


}
