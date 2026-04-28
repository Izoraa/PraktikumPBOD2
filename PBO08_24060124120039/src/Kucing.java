/**
 * File         : Kucing.java
 * Deskripsi    : Berisi Class Kucing beserta atribut dan methodenya
 *Nama/NIM      : Izzatu Khoirul Fata / 24060124120039
 *Tanggal       : 28 April 2026
 */
class Kucing extends Anabul {
    //Kamus
    private double bobot;

    //Algoritma
    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    @Override
    public void gerak() {
        System.out.println(nama + " melata");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " meong");
    }
}