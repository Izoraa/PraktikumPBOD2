/**
 * File : Anjing.java
 * Deskripsi : Berisi Class Anjing beserta methodenya
 *Nama/NIM     : Izzatu Khoirul Fata / 24060124120039
 *Tanggal      : 21 April 2026
 */
class Anjing extends Anabul {

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " melata");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " guk-guk");
    }
}