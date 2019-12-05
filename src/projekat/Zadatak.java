package projekat;

import Tim.Zaposleni;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Zadatak implements Comparable<Zadatak> {

    private String naziv, opis;
    private boolean stanje;
    private int dan, mesec, godina;
    private ArrayList<Zaposleni> listaZaposlenih;

    public Zadatak(String naziv, String opis) {
        this.naziv = naziv;
        this.opis = opis;
        this.listaZaposlenih = new ArrayList<Zaposleni>();
        LocalDate vremeKreiranja = LocalDate.now();
        this.dan = vremeKreiranja.getDayOfMonth();
        this.mesec = vremeKreiranja.getMonthValue();
        this.godina = vremeKreiranja.getYear();
        this.stanje = true;
    }

    public void dodajZaposlenog (Zaposleni z) {
        listaZaposlenih.add(z);
    }

    public ArrayList<Zaposleni> getListaZaposlenih() {
        Collections.sort(listaZaposlenih);
        return listaZaposlenih;
    }

    public void zatvoriZadatak() {
        this.stanje = false;
    }

    public int getDan() {
        return dan;
    }

    public int getMesec() {
        return mesec;
    }

    public int getGodina() {
        return godina;
    }

    public boolean isStanje() {
        return stanje;
    }

    public int brojZaposlenih () {
        return listaZaposlenih.size();
    }

    @Override
    public int compareTo(Zadatak o) {
        if (this.godina > o.getGodina()) {
            return 1;
        } else if (this.godina == o.getGodina() && this.mesec > o.getMesec()) {
            return 1;
        } else if (this.godina == o.getGodina() && this.mesec == o.getMesec() && this.dan > o.getDan()) {
            return 1;
        } else if (this.godina == o.getGodina() && this.mesec == o.getMesec() && this.dan == o.getDan()) {
            return 0;
        } else {
            return -1;
        }
    }



    @Override
    public String toString() {
        String tekst = "Zadatak " + naziv + " ({" + dan + "}.{" + mesec + "}.{" + godina + "}) - Stanje (" + (stanje ? "AKTIVAN" : "GOTOV") + ")\n";
        Collections.sort(listaZaposlenih);
        for (Zaposleni z: listaZaposlenih) {
            tekst += z + "\n";
        }
        return tekst;
    }
}
