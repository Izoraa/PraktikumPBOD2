/**
 * File         : Datum.java
 * Deskripsi    : Class Datum , Kelas generik untuk menyimpan satu nilai bertipe bebas
 *                dengan operasi get dan set.
 *Nama/NIM      : Izzatu Khoirul Fata / 24060124120039
 *Tanggal       : 28 April 2026
 */

public class Datum<G> {
    private G isi;

    public G getIsi() {
        return isi;
    }

    public void setIsi(G isi) {
        this.isi = isi;
    }
}