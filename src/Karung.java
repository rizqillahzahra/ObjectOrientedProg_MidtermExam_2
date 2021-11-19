import java.util.Locale;
import java.text.NumberFormat;

public class Karung {
    String ukuranKarung;
    int durasiPinjam; //dalam bulan
    public double bungaPersen = 0.025;
    long harga;
    double nilaiBunga; // nilai bunga dari uang yang dipinjam
    double kewajibanBunga; //tiap bulan
    double totalPinjaman;
    int nomor;

    Locale locale = new Locale("id", "ID");
    NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
    
    public int getNomor() {
        return nomor;
    }

    public int getDurasiPinjam() {
        return durasiPinjam;
    }

    public String getUkuranKarung() {
        return ukuranKarung;
    }

    public double getBungaPersen() {
        return bungaPersen;
    }

    public double getHarga() {
        return harga;
    }

    public void setDurasiPinjam(int durasiPinjam) {
        this.durasiPinjam = durasiPinjam;
    }

    public double getNilaiBunga() {
        return nilaiBunga;
    }

    public double getKewajibanBunga() {
        return getNilaiBunga() * getDurasiPinjam();
    }

    public double getTotalPinjaman() {
        return getKewajibanBunga() + getHarga();
    }

    public Karung(int nomor, String ukuranKarung, long harga, double nilaiBunga) {
        this.nomor = nomor;
        this.ukuranKarung = ukuranKarung;
        this.harga = harga;
        this.nilaiBunga = bungaPersen * harga;
    }

    @Override
    public String toString() {
        return getNomor() + ". " + getUkuranKarung() + "." + "\t"
        + "Harga Pinjaman : " + "\t" + numberFormat.format(getHarga()) + "." + "\t"
        + "Bunga Pinjaman : " + "\t" + numberFormat.format(getNilaiBunga());
    }
}
