package n3exercici1.models;

import java.util.ArrayList;
import java.util.List;

public class Redactor {

    private String nom;
    private final String DNI;
    private int sou;
    private List<Noticia> noticies = new ArrayList<>();

    public Redactor(String nom, String DNI) {
        this.nom = nom;
        this.DNI = DNI;
        this.sou = 1500;
    }

    public void afegirNoticia(Noticia noticia) {
        noticies.add(noticia);
    }

    public String getNom() {
        return nom;
    }

    public String getDNI() {
        return DNI;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getSou() {
        return sou;
    }

    public void setSou(int sou) {
        this.sou = sou;
    }

    public Noticia cercaNoticia(String titular) {
        Noticia noticia = null;
        for (Noticia n : noticies) {
            if (n.getTitular().equals(titular)) {
                noticia = n;
                break;
            }
        }
        return noticia;
    }

    public void eliminarNoticia(Noticia noticia) {
        noticies.remove(noticia);
    }

    public List<Noticia> getNoticies() {
        return noticies;
    }
}
