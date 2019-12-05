package projekat;

import Tim.Zaposleni;

import java.util.ArrayList;
import java.util.Collections;

public class Grupa {

    private String naziv;
    private ArrayList<Zadatak> listaZadataka;

    public Grupa(String naziv) {
        this.naziv = naziv;
        this.listaZadataka = new ArrayList<>();
    }

    public void dodajZadatak (Zadatak z) {
        listaZadataka.add(z);
    }

    public int brojZaposlenihNaAktivnimZadacima () {
        int broj = 0;
        for (Zadatak z: listaZadataka) {
            if (z.isStanje()) {
                broj += z.brojZaposlenih();
            }
        }
        return broj;
    }



    public int brojAktivnihZadataka () {
        int broj = 0;
        for (Zadatak z: listaZadataka) {
            if (z.isStanje()) {
                broj++;
            }
        }
        return broj;
    }

    //ovo je samo mali testic bio, nije trazeno u zadatku
    public ArrayList<Zaposleni> listaZaposlenihNaGotovim () {
        ArrayList<Zaposleni> lista = new ArrayList<>();
        for (Zadatak z: listaZadataka) {
            if (!z.isStanje()) {
                for (int i = 0; i < z.getListaZaposlenih().size(); i++) {
                    lista.add(z.getListaZaposlenih().get(i));
                }
            }
        }
        Collections.sort(lista);
        return lista;

    }

    public ArrayList<Zaposleni> listaZaposlenihKojiNisuNaAktivnim () {
        ArrayList<Zaposleni> lista = new ArrayList<>();
        ArrayList<Zaposleni> lista2 = new ArrayList<>();
        for (Zadatak z: listaZadataka) {
            for (Zaposleni za: z.getListaZaposlenih()) {
                if (z.isStanje() == true) {
                    lista2.add(za);
                }
            }
        }

        for (Zadatak z: listaZadataka) {
            for (Zaposleni za: z.getListaZaposlenih()) {
                if (z.isStanje() == false && !lista2.contains(za) && !lista.contains(za) ) {
                    lista.add(za);
                }
            }
        }
        Collections.sort(lista);
        return lista;
    }

    @Override
    public String toString() {
        int brojZ = 0;
        for (Zadatak z: listaZadataka) {
            brojZ += z.brojZaposlenih();
        }
        String tekst = "Grupa: " + this.naziv + " ({" + brojZ + "} zaposlenih na {" + listaZadataka.size() + "} zadataka)\n";
        Collections.sort(listaZadataka);
        for (Zadatak za: listaZadataka) {
            tekst += za + "\n";
        }
        return tekst;
    }
}
