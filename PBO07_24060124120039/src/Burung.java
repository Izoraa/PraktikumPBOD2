/**
 * File : Burung.java
 * Deskripsi : Berisi Class Burung beserta methodenya
 *Nama/NIM     : Izzatu Khoirul Fata / 24060124120039
 *Tanggal      : 21 April 2026
 */
class Burung extends Anabul {

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " terbang");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " cuit");
    }
}