package n3exercici1.models;

import java.util.ArrayList ;
import java.util.List;

public class Redaccio {

    private List<Redactor> redactors = new ArrayList<>();

    public void afegirRedactor(Redactor redactor) {
        redactors.add(redactor);
    }

    public void eliminarRedactorPerDNI(String DNI) {
        Redactor redactor = cercaRedactor(DNI);
        redactors.remove(redactor);
    }

    private Redactor cercaRedactor(String DNI) {
        Redactor redactor1 = null;
        for (Redactor r : redactors) {
            if (r.getDNI().equals(DNI)) {
                redactor1 = r;
                break;
            }
        }
        return redactor1;
    }

    public List<Redactor> getRedactors() {
        return redactors;
    }

    public Redactor getRedactor(int numRedactor) {
        return redactors.get(numRedactor + 1);
    }

}
