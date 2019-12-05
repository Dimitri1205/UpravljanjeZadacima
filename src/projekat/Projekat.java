package projekat;

import java.util.ArrayList;

public class Projekat {

    private String naziv;
    private int sifraProjekta;
    private ArrayList<Grupa> listaGrupa;

    public Projekat(String naziv, int sifraProjekta) {
        this.naziv = naziv;
        this.sifraProjekta = sifraProjekta;
        this.listaGrupa = new ArrayList<>();
    }

    public void dodajGrupu (Grupa g) {
        listaGrupa.add(g);
    }

    @Override
    public String toString() {
        String tekst = "Projekat: " + naziv + " sifra: " + sifraProjekta;
        for (Grupa g: listaGrupa) {
            tekst += "\n------------------------\n";
            tekst += g;
        }
        return tekst;
    }
}
