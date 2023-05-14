package n3exercici1;

import n3exercici1.models.Noticia;
import n3exercici1.models.NoticiaFutbol;
import n3exercici1.models.Redaccio;
import n3exercici1.models.Redactor;
import n3exercici1.service.NoticiaService;

import java.util.Scanner;

public class Main {

    static Redaccio redaccio = new Redaccio();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("===== MENÚ =====");
            System.out.println("1.- Introduir redactor");
            System.out.println("2.- Eliminar redactor");
            System.out.println("3.- Introduir notícia a un redactor");
            System.out.println("4.- Eliminar notícia (ha de demanar redactor i titular de la notícia)");
            System.out.println("5.- Mostrar totes les notícies per redactor");
            System.out.println("6.- Calcular puntuació de la notícia");
            System.out.println("7.- Calcular preu-notícia");
            System.out.println("Escull una opcio!");
            opcion = sc.nextInt();
            switch(opcion) {
                case 1:
                    crearRedactor("Redactor1", "87963577L");
                    crearRedactor("Redactor2", "89745587R");
                    crearRedactor("Redactor3", "65451628G");
                    crearRedactor("Redactor4", "16598544E");
                    break;
                case 2:
                    eliminarRedactorPerDNI("65451628G");
                    break;
                case 3:
                    afegirNoticiaARedactor(1);
                    break;
                case 4:
                    eliminarNoticia(1, "El nuevo gol de Benzema");
                    break;
                case 5:
                    mostrarNoticiesPerRedactor();
                    break;
                case 6:
                    calcularPuntuacioNotica("Futbol", new NoticiaFutbol("El nuevo gol de Benzema", "Texto noticia", "Lliga de campions", "Barça", "Ferran Torres"));
                    break;
                case 7:
                    calcularPreuNoticia("Futbol", new NoticiaFutbol("El nuevo gol de Benzema", "Texto noticia", "Lliga de campions", "Barça", "Ferran Torres"));
                    break;
                case 8:
                    System.out.println("¡Adeu!");
                    break;
                default:
                    System.out.println("Opció no válida");
            }
            System.out.println();
        } while(opcion != 8);

    }

    private static void calcularPuntuacioNotica(String tipusNoticia, Noticia noticia) {
        int puntuacio = NoticiaService.calcularPuntuacio(tipusNoticia, noticia);
        System.out.println("Puntuació noticia: " + puntuacio);
    }

    private static void calcularPreuNoticia(String tipusNoticia, Noticia noticia) {
        int preu = NoticiaService.calcularPreu(tipusNoticia, noticia);
        System.out.println("Preu noticia: " + preu);
    }

    private static void eliminarNoticia(int redactorId, String titularNoticia) {
        Noticia noticia = redaccio.getRedactor(redactorId).cercaNoticia(titularNoticia);
        redaccio.getRedactor(redactorId).eliminarNoticia(noticia);
    }

    private static void crearRedactor(String nom, String DNI) {
        Redactor redactor = new Redactor(nom, DNI);
        redaccio.afegirRedactor(redactor);
    }

    private static void eliminarRedactorPerDNI(String DNI) {
        redaccio.eliminarRedactorPerDNI(DNI);
    }

    private static void afegirNoticiaARedactor(int idRedactor) {
        Redactor redactor = redaccio.getRedactor(idRedactor);
        Noticia noticia1 = new Noticia("El nuevo gol de Ramos", "Texto noticia 1");
        Noticia noticia2 = new Noticia("El nuevo gol de Benzema", "Texto noticia 2");
        redactor.afegirNoticia(noticia1);
        redactor.afegirNoticia(noticia2);
    }

    private static void mostrarNoticiesPerRedactor() {
        String noticiesPerRedactor = null;
        for (Redactor r : redaccio.getRedactors()) {
            for (Noticia n : r.getNoticies()) {
                noticiesPerRedactor = "Redactor: " + r.getNom() + "\n" +
                                            "Noticies: " + n.toString();
            }
        }
        System.out.println(noticiesPerRedactor);
    }

}
