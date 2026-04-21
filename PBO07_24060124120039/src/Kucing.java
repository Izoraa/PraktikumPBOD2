/**
 * File : Kucing.java
 * Deskripsi : Berisi Class Kucing beserta methodenya
 *Nama/NIM     : Izzatu Khoirul Fata / 24060124120039
 *Tanggal      : 21 April 2026
 */
class Kucing extends Anabul {

    public Kucing(String nama) {
        super(nama);
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