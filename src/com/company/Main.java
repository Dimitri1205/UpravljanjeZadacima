package com.company;

import Tim.Zaposleni;
import projekat.Grupa;
import projekat.Projekat;
import projekat.Zadatak;

import java.sql.SQLOutput;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        Zaposleni z1 = new Zaposleni("Nikola", "Milosevic", "Nikola.Milosevic@Firma.com");
        Zaposleni z2 = new Zaposleni("Marko", "Jankovic", "Marko.Jankovic@Firma.com");
        Zaposleni z3 = new Zaposleni("Nenad", "Djuric", "Nenad.Djuric@Firma.com");
        Zaposleni z4 = new Zaposleni("Goran", "Petrovic", "Goran.Petrovic@Firma.com");
        Zaposleni z5 = new Zaposleni("Natasa", "Milic", "Natasa.Milic@Firma.com");
        Zaposleni z6 = new Zaposleni("Marija", "Bozovic", "Marija.Bozovic@Firma.com");
        Zaposleni z7 = new Zaposleni("Vanja", "Zunjic", "Vanja.Zunjic@Firma.com");
        Zaposleni z8 = new Zaposleni("Jovan", "Stankovic", "Jovan.Stankovic@Firma.com");
        Zaposleni z9 = new Zaposleni("Stevan", "Nikolic", "Stevan.Nikolic@Firma.com");
        Zaposleni z10 = new Zaposleni("Petar", "Djordjevic", "Petar.Djordjevic@Firma.com");

        Zadatak za1 = new Zadatak("Zadatak1", "Prvi");
        Zadatak za2 = new Zadatak("Zadatak2", "Drugi");
        Zadatak za3 = new Zadatak("Zadatak3", "Treci");
        Zadatak za4 = new Zadatak("Zadatak4", "Cevrti");


        Grupa g1 = new Grupa("Grupa1");
        Grupa g2 = new Grupa("Grupa2");
        Grupa g3 = new Grupa("Grupa3");

        Projekat p1 = new Projekat("Projekat", 1);

        za1.dodajZaposlenog(z1);
        za1.dodajZaposlenog(z2);
        za1.dodajZaposlenog(z3);
        za1.dodajZaposlenog(z8);
        za1.dodajZaposlenog(z9);


        za2.dodajZaposlenog(z4);
        za2.dodajZaposlenog(z5);
        za2.dodajZaposlenog(z6);
        za2.dodajZaposlenog(z7);
        za2.dodajZaposlenog(z1);
        za2.dodajZaposlenog(z9);

        za3.dodajZaposlenog(z2);
        za3.dodajZaposlenog(z8);
        za3.dodajZaposlenog(z9);


        za4.dodajZaposlenog(z10);
        za4.dodajZaposlenog(z1);
        za4.dodajZaposlenog(z5);
        za4.dodajZaposlenog(z7);

        g1.dodajZadatak(za1);
        g1.dodajZadatak(za2);
        g1.dodajZadatak(za4);

        g2.dodajZadatak(za1);
        g2.dodajZadatak(za3);

        g3.dodajZadatak(za1);
        g3.dodajZadatak(za4);
        g3.dodajZadatak(za2);


        p1.dodajGrupu(g1);
        p1.dodajGrupu(g2);
        p1.dodajGrupu(g3);

        za2.zatvoriZadatak();
        za4.zatvoriZadatak();

        System.out.println("Stampanje projekta p1");
        System.out.println(p1);
        System.out.println("------------");
        System.out.println("Broj zaposlenih na aktivnim zadacima grupe g1: " + g1.brojZaposlenihNaAktivnimZadacima());
        System.out.println("------------");
        System.out.println("Sortirana lista zaposlenih grupe g3 koji nisu na aktivnom zadatku: ");
        stampajListu(g3.listaZaposlenihKojiNisuNaAktivnim());
        System.out.println("Broj aktivnih zadataka grupe g2: " + g2.brojAktivnihZadataka());
        System.out.println("----------------");
        System.out.println("Sortirana lista zaposlenih grupe g3 koji su na gotovim zadacima: ");
        stampajListu(g3.listaZaposlenihNaGotovim());



    }

    public static void stampajListu (ArrayList<Zaposleni> lista) {
        for (Zaposleni z: lista) {
            System.out.println(z);
        }
    }
}
