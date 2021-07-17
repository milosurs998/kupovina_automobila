package kupovina.modeli;

import javax.persistence.*;

@Entity
@Table(name="auto")
public class Auto {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int auto_id;
    private String marka;
    private String model;
    private String godiste;
    private String boja;
    private double konjska_snaga;
    private int kupac_id;

    public Auto() {
    }

    public Auto(String marka, String model, String godiste, String boja, double konjska_snaga, int kupac_id) {
        this.marka = marka;
        this.model = model;
        this.godiste = godiste;
        this.boja = boja;
        this.konjska_snaga = konjska_snaga;
        this.kupac_id = kupac_id;
    }

    public void setAuto_id(int auto_id) {
        this.auto_id = auto_id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setGodiste(String godiste) {
        this.godiste = godiste;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public void setKonjska_snaga(double konjska_snaga) {
        this.konjska_snaga = konjska_snaga;
    }

    public void setKupac_id(int kupac_id) {
        this.kupac_id = kupac_id;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getAuto_id() {
        return auto_id;
    }

    public String getModel() {
        return model;
    }

    public String getGodiste() {
        return godiste;
    }

    public String getBoja() {
        return boja;
    }

    public double getKonjska_snaga() {
        return konjska_snaga;
    }

    public int getKupac_id() {
        return kupac_id;
    }

    public String getMarka() {
        return marka;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "auto_id=" + auto_id +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", godiste='" + godiste + '\'' +
                ", boja='" + boja + '\'' +
                ", konjska_snaga=" + konjska_snaga +
                ", kupac_id=" + kupac_id +
                '}';
    }
}
