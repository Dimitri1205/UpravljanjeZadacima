package Tim;


public class Zaposleni implements Comparable<Zaposleni> {

    private String ime, prezime, email;

    public Zaposleni(String ime, String prezime, String email) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    @Override
    public String toString() {
        return prezime + " " + ime + " - " + email;
    }


    @Override
    public int compareTo(Zaposleni o) {
        if (this.prezime.compareTo(o.getPrezime()) == 0) {
            if (this.ime.compareTo(o.getIme()) > 0) {
                return 1;
            } else if (this.ime.compareTo(o.getIme()) < 0) {
                return -1;
            } else {
                return 0;
            }
        } else if (this.prezime.compareTo(o.getPrezime()) > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
