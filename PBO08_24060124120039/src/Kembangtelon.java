/**
 * File         : Kembangtelon.java
 * Deskripsi    : Kelas turunan dari Kucing yang merepresentasikan kucing Kembangtelon
 *Nama/NIM      : Izzatu Khoirul Fata / 24060124120039
 *Tanggal       : 28 April 2026
 */

class Kembangtelon extends Kucing {

    public Kembangtelon(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " rawrr");
    }
}