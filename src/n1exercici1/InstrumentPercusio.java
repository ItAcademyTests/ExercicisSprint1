package n1exercici1;

public class InstrumentPercusio extends Instrument {

    public InstrumentPercusio(String nom, Double preu) {
        super(nom, preu);
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de percussió");
    }

}
