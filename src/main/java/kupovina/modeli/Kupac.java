package kupovina.modeli;
import javax.persistence.*;

@Entity
@Table(name="kupac")
public class Kupac {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int kupac_id;
    private String ime;
    private String prezime;
    private String br_tel;
    private String adresa;
    private String godiste;

    public Kupac() {
    }

    public Kupac(String ime, String prezime, String br_tel, String adresa, String godiste) {
        this.ime = ime;
        this.prezime = prezime;
        this.br_tel = br_tel;
        this.adresa = adresa;
        this.godiste = godiste;
    }

    public void setKupac_id(int kupac_id) {
        this.kupac_id = kupac_id;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setBr_tel(String br_tel) {
        this.br_tel = br_tel;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setGodiste(String godiste) {
        this.godiste = godiste;
    }

    public int getKupac_id() {
        return kupac_id;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getBr_tel() {
        return br_tel;
    }

    public String getAdresa() {
        return adresa;
    }

    public String getGodiste() {
        return godiste;
    }

    @Override
    public String toString() {
        return "Kupac{" +
                "kupac_id=" + kupac_id +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", br_tel='" + br_tel + '\'' +
                ", adresa='" + adresa + '\'' +
                ", godiste='" + godiste + '\'' +
                '}';
    }
}
