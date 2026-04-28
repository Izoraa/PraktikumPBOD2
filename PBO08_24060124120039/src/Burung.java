/**
 * File         : Burung.java
 * Deskripsi    : Berisi Class Burung beserta atribut dan methodenya
 *Nama/NIM      : Izzatu Khoirul Fata / 24060124120039
 *Tanggal       : 28 April 2026
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