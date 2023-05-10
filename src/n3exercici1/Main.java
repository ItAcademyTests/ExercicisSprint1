package n3exercici1;

import java.util.Scanner;

public class Main {

    static Redaccio redaccio = new Redaccio();
    //static Noticia noticia = new Noticia(titular, preu);

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
                    calcularPuntuacioNoticia("Futbol", "Ferran Torres", "Barça", "Lliga de campions", "", "");
                    break;
                case 7:
                    calcularPreuNoticia("Futbol", "Ferran Torres", "Barça", "Lliga de campions", "", "");
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

    private static void calcularPreuNoticia(String tipusNoticia, String jugador, String club, String lliga, String cotxe, String moto) {
        int puntuacio = 0;

        //Noticies de Futbol
        if (tipusNoticia.equals("Futbol")) puntuacio += EPreu.FUTBOL.getPreu();
        if (lliga.equals("Lliga de campions")) puntuacio += EPreu.LLIGA_DE_CAMPIONS.getPreu();
        if (lliga.equals("Lliga")) puntuacio += EPreu.LLIGA_DE_CAMPIONS.getPreu();
        if (club.equals("Barça")) puntuacio += EPreu.BARCA_FUTBOL.getPreu();
        if (club.equals("Madrid")) puntuacio += EPreu.MADRID_FUTBOL.getPreu();
        if (jugador.equals("Ferran Torres")) puntuacio += EPreu.FERRAN_TORRES.getPreu();
        if (jugador.equals("Benzema")) puntuacio += EPreu.BENZEMA.getPreu();

        //Noticies de Basquet
        if (tipusNoticia.equals("Basquet")) puntuacio += EPreu.BASQUET.getPreu();
        if (lliga.equals("Eurolliga")) puntuacio += EPreu.EUROLLIGA.getPreu();
        if (club.equals("Marça")) puntuacio += EPreu.BARCA_BASQUET.getPreu();
        if (club.equals("Madrid")) puntuacio += EPreu.MADRID_BASQUET.getPreu();

        //Noticies de Tenis
        if (tipusNoticia.equals("Tenis")) puntuacio += EPreu.TENIS.getPreu();
        if (jugador.equals("Federer")) puntuacio += EPreu.FEDERER.getPreu();
        if (jugador.equals("Nadal")) puntuacio += EPreu.NADAL.getPreu();
        if (jugador.equals("DJokovic")) puntuacio += EPreu.DJOKOVIC.getPreu();

        //Noticies de F1
        if (tipusNoticia.equals("F1")) puntuacio += EPreu.F1.getPreu();
        if (cotxe.equals("Ferrari")) puntuacio += EPreu.FERRARI.getPreu();
        if (cotxe.equals("Mercedes")) puntuacio += EPreu.MERCEDES.getPreu();

        //Noticies de Motociclisme
        if (tipusNoticia.equals("Motociclisme")) puntuacio += EPreu.MOTOCICLISME.getPreu();
        if (moto.equals("Honda")) puntuacio += EPreu.HONDA.getPreu();
        if (cotxe.equals("Yamaha")) puntuacio += EPreu.YAMAHA.getPreu();

        System.out.println("Puntuació noticia: " + puntuacio);
    }

    private static void calcularPuntuacioNoticia(String tipusNoticia, String jugador, String club, String lliga, String cotxe, String moto) {
        int puntuacio = 0;

        //Noticies de Futbol
        if (tipusNoticia.equals("Futbol")) puntuacio += EPuntuacions.FUTBOL.getPunts();
        if (lliga.equals("Lliga de campions")) puntuacio += EPuntuacions.LLIGA_DE_CAMPIONS.getPunts();
        if (lliga.equals("Lliga")) puntuacio += EPuntuacions.LLIGA.getPunts();
        if (club.equals("Barça")) puntuacio += EPuntuacions.BARCA.getPunts();
        if (club.equals("Madrid")) puntuacio += EPuntuacions.MADRID.getPunts();
        if (jugador.equals("Ferran Torres")) puntuacio += EPuntuacions.FERRAN_TORRES.getPunts();
        if (jugador.equals("Benzema")) puntuacio += EPuntuacions.BENZEMA.getPunts();

        //Noticies de Basquet
        if (tipusNoticia.equals("Basquet")) puntuacio += EPuntuacions.BASQUET.getPunts();
        if (lliga.equals("Eurolliga")) puntuacio += EPuntuacions.EUROLLIGA.getPunts();
        if (lliga.equals("ACB")) puntuacio += EPuntuacions.ACB.getPunts();

        //Noticies de Tenis
        if (tipusNoticia.equals("Tenis")) puntuacio += EPuntuacions.TENIS.getPunts();
        if (jugador.equals("Federer")) puntuacio += EPuntuacions.FEDERER.getPunts();
        if (jugador.equals("ACB")) puntuacio += EPuntuacions.NADAL.getPunts();
        if (jugador.equals("DJokovic")) puntuacio += EPuntuacions.DJOKOVIC.getPunts();

        //Noticies de F1
        if (tipusNoticia.equals("F1")) puntuacio += EPuntuacions.F1.getPunts();
        if (cotxe.equals("Ferrari")) puntuacio += EPuntuacions.FERRARI.getPunts();
        if (cotxe.equals("Mercedes")) puntuacio += EPuntuacions.MERCEDES.getPunts();

        //Noticies de Motociclisme
        if (tipusNoticia.equals("Motociclisme")) puntuacio += EPuntuacions.MOTOCICLISME.getPunts();
        if (moto.equals("Honda")) puntuacio += EPuntuacions.HONDA.getPunts();
        if (cotxe.equals("Yamaha")) puntuacio += EPuntuacions.YAMAHA.getPunts();

        System.out.println("Puntuació noticia: " + puntuacio);
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
        Noticia noticia1 = new Noticia("El nuevo gol de Ramos");
        Noticia noticia2 = new Noticia("El nuevo gol de Benzema");
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
