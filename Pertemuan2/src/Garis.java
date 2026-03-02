/* Nama File        : Garis.java
 * Deskripsi        : berisi atribut dan metode dalam class garis
 * Pembuat          : Izzatu Khoirul Fata/24060124120039
 * Tanggal          : 1 Maret 2026 */
public class Garis {
    // Atribut
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;

    // Method
    Garis() {
        titikAwal = new Titik(0, 0);
        titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    Garis(Titik t1, Titik t2) {
        titikAwal = t1;
        titikAkhir = t2;
        counterGaris++;
    }

    Titik getTitikAwal() {
        return titikAwal;
    }

    Titik getTitikAkhir() {
        return titikAkhir;
    }

    void setTitikAwal(Titik t1) {
        titikAwal = t1;
    }

    void setTitikAkhir(Titik t2) {
        titikAkhir = t2;
    }

    static int getCounterGaris() {
        return counterGaris;
    }

    public double panjangGaris() {
    return Math.sqrt(Math.pow(titikAkhir.getAbsis() - titikAwal.getAbsis(), 2)
            + Math.pow(titikAkhir.getOrdinat() - titikAwal.getOrdinat(), 2));
    }

    public double gradienGaris() {
    return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    Titik getTitikTengah() {
        double absis = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2.0;
        double ordinat = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2.0;
        return new Titik(absis, ordinat);
    }

    boolean isSejajar(Garis g) {
        return this.gradienGaris() == g.gradienGaris();
    }

    void printGaris() {
        System.out.println("Garis (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + ") -> ("
                + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");
    }

    String getPersamaanGaris() {
    if (titikAkhir.getAbsis() == titikAwal.getAbsis()) {
        return "x = " + titikAwal.getAbsis();
    }

    double m = gradienGaris();
    double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
    return "y = " + m + "x + " + c;
    }
}