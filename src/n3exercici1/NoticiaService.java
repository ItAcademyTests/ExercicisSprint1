package n3exercici1;

import n3exercici1.enums.*;

public class NoticiaService {

    public static int calcularPuntuacio(String tipusNoticia, Noticia noticia) {
        int punts = 0;

        if (tipusNoticia.equals(TipusNoticia.FUTBOL.getTipusNoticia())) {
            var noticiaFutbol = (NoticiaFutbol)noticia;
            punts = EPuntuacionsFutbol.FUTBOL.getPunts();
            if (noticiaFutbol.getClub().equals("Barça")) punts += EPuntuacionsFutbol.BARCA.getPunts();
            if (noticiaFutbol.getClub().equals("Madrid")) punts += EPuntuacionsFutbol.MADRID.getPunts();
            if (noticiaFutbol.getCompeticio().equals("Lliga de campions")) punts += EPuntuacionsFutbol.LLIGA_CAMPIONS.getPunts();
            if (noticiaFutbol.getCompeticio().equals("Lliga")) punts += EPuntuacionsFutbol.LLIGA.getPunts();
            if (noticiaFutbol.getJugador().equals("Ferran Torres")) punts += EPuntuacionsFutbol.FERRAN_TORRES.getPunts();
            if (noticiaFutbol.getJugador().equals("Benzema")) punts += EPuntuacionsFutbol.BENZEMA.getPunts();
            noticiaFutbol.setPuntuacio(punts);
            return noticiaFutbol.getPuntuacio();
        }

        if (tipusNoticia.equals(TipusNoticia.BASQUET.getTipusNoticia())) {
            var noticiaBasquet = (NoticiaBasquet)noticia;
            punts = EPuntuacionsBasquet.BASQUET.getPunts();
            if (noticiaBasquet.getCompeticio().equals("Eurolliga")) punts += EPuntuacionsBasquet.EUROLLIGA.getPunts();
            if (noticiaBasquet.getCompeticio().equals("ACB")) punts = punts + EPuntuacionsBasquet.ACB.getPunts();
            if (noticiaBasquet.getClub().equals("Barça")) punts = punts + EPuntuacionsBasquet.BARCA.getPunts();
            if (noticiaBasquet.getClub().equals("Madrid")) punts = punts + EPuntuacionsBasquet.MADRID.getPunts();
            noticiaBasquet.setPuntuacio(punts);
            return noticiaBasquet.getPuntuacio();
        }

        if (tipusNoticia.equals(TipusNoticia.F1.getTipusNoticia())) {
            var noticiaf1 = (NoticiaF1)noticia;
            punts = EPuntuacionsF1.F1.getPunts();
            if (noticiaf1.getEscuderia().equals("Ferrari")) punts += EPuntuacionsF1.FERRARI.getPunts();
            if (noticiaf1.getEscuderia().equals("Mercedes")) punts += EPuntuacionsF1.MERCEDES.getPunts();
            noticiaf1.setPuntuacio(punts);
            return noticiaf1.getPuntuacio();
        }

        if (tipusNoticia.equals(TipusNoticia.TENIS.getTipusNoticia())) {
            var noticiaTenis = (NoticiaTenis)noticia;
            punts = EPuntuacionsTenis.TENIS.getPunts();
            if (noticiaTenis.getCompeticio().equals("Grand Slam")) punts += EPuntuacionsTenis.GRAND_SLAM.getPunts();
            if (noticiaTenis.getCompeticio().equals("Wimblendon")) punts = punts + EPuntuacionsTenis.WIMBLENDON.getPunts();
            if (noticiaTenis.getTenista().equals("Federer")) punts = punts + EPuntuacionsTenis.FEDERER.getPunts();
            if (noticiaTenis.getTenista().equals("Nadal")) punts = punts + EPuntuacionsTenis.NADAL.getPunts();
            if (noticiaTenis.getTenista().equals("Djokovic")) punts = punts + EPuntuacionsTenis.DJOKOVIC.getPunts();
            noticiaTenis.setPuntuacio(punts);
            return noticiaTenis.getPuntuacio();
        }

        if (tipusNoticia.equals(TipusNoticia.MOTOCICLISME.getTipusNoticia())) {
            var noticiaMotociclisme = (NoticiaMotociclisme)noticia;
            punts = EPuntuacionsMotociclisme.MOTOCICLISME.getPunts();
            if (noticiaMotociclisme.getEquip().equals("Honda")) punts += EPuntuacionsMotociclisme.HONDA.getPunts();
            if (noticiaMotociclisme.getEquip().equals("Yamaha")) punts += EPuntuacionsMotociclisme.YAMAHA.getPunts();
            noticiaMotociclisme.setPuntuacio(punts);
            return noticiaMotociclisme.getPuntuacio();
        }

        return punts;
    }

    public static int calcularPreu(String tipusNoticia, Noticia noticia) {
        int preu = 0;

        if (tipusNoticia.equals(TipusNoticia.FUTBOL.getTipusNoticia())) {
            var noticiaFutbol = (NoticiaFutbol)noticia;
            preu = EPreuFutbol.PREU_INICIAL.getPreu();
            if (noticiaFutbol.getClub().equals("Barça")) preu += EPreuFutbol.BARCA.getPreu();
            if (noticiaFutbol.getClub().equals("Madrid")) preu += EPreuFutbol.MADRID.getPreu();
            if (noticiaFutbol.getCompeticio().equals("Lliga de campions")) preu += EPreuFutbol.LLIGA_CAMPIONS.getPreu();
            if (noticiaFutbol.getJugador().equals("Ferran Torres")) preu += EPreuFutbol.FERRAN_TORRES.getPreu();
            if (noticiaFutbol.getJugador().equals("Benzema")) preu += EPreuFutbol.BENZEMA.getPreu();
            noticiaFutbol.setPreu(preu);
            return noticiaFutbol.getPreu();
        }

        if (tipusNoticia.equals(TipusNoticia.BASQUET.getTipusNoticia())) {
            var noticiaBasquet = (NoticiaBasquet)noticia;
            preu = EPreuBasquet.PREU_INICIAL.getPreu();
            if (noticiaBasquet.getCompeticio().equals("Eurolliga")) preu += EPreuBasquet.EUROLLIGA.getPreu();
            if (noticiaBasquet.getClub().equals("Barça")) preu = preu + EPreuBasquet.BARCA.getPreu();
            if (noticiaBasquet.getClub().equals("Madrid")) preu = preu + EPreuBasquet.MADRID.getPreu();
            noticiaBasquet.setPreu(preu);
            return noticiaBasquet.getPreu();
        }

        if (tipusNoticia.equals(TipusNoticia.F1.getTipusNoticia())) {
            var noticiaf1 = (NoticiaF1)noticia;
            preu = EPreuF1.PREU_INICIAL.getPreu();
            if (noticiaf1.getEscuderia().equals("Ferrari")) preu += EPreuF1.FERRARI.getPreu();
            if (noticiaf1.getEscuderia().equals("Mercedes")) preu += EPreuF1.MERCEDES.getPreu();
            noticiaf1.setPreu(preu);
            return noticiaf1.getPreu();
        }

        if (tipusNoticia.equals(TipusNoticia.TENIS.getTipusNoticia())) {
            var noticiaTenis = (NoticiaTenis)noticia;
            preu = EPreuTenis.PREU_INICIAL.getPreu();
            if (noticiaTenis.getCompeticio().equals("Grand Slam")) preu += EPreuTenis.GRAND_SLAM.getPreu();
            if (noticiaTenis.getCompeticio().equals("Wimblendon")) preu = preu + EPreuTenis.WIMBLENDON.getPreu();
            if (noticiaTenis.getTenista().equals("Federer")) preu = preu + EPreuTenis.FEDERER.getPreu();
            if (noticiaTenis.getTenista().equals("Nadal")) preu = preu + EPreuTenis.NADAL.getPreu();
            if (noticiaTenis.getTenista().equals("Djokovic")) preu = preu + EPreuTenis.DJOKOVIC.getPreu();
            noticiaTenis.setPreu(preu);
            return noticiaTenis.getPreu();
        }

        if (tipusNoticia.equals(TipusNoticia.MOTOCICLISME.getTipusNoticia())) {
            var noticiaMotociclisme = (NoticiaMotociclisme)noticia;
            preu = EPreuMotociclisme.PREU_INICIAL.getPreu();
            if (noticiaMotociclisme.getEquip().equals("Honda")) preu += EPreuMotociclisme.HONDA.getPreu();
            if (noticiaMotociclisme.getEquip().equals("Yamaha")) preu += EPreuMotociclisme.YAMAHA.getPreu();
            noticiaMotociclisme.setPreu(preu);
            return noticiaMotociclisme.getPreu();
        }

        return preu;
    }
}
