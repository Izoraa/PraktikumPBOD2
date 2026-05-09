/**
 * File         : Anggora.java
 * Deskripsi    : Kelas turunan dari Kucing yang merepresentasikan kucing Anggora
 *Nama/NIM      : Izzatu Khoirul Fata / 24060124120039
 *Tanggal       : 28 April 2026
 */

class Anggora extends Kucing {

    public Anggora(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " miaww miaww");
    }
}
