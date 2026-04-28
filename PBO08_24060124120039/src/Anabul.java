/**
 * File         : Anabul.java
 * Deskripsi    : Class Anabul berisi atribut dan methode dari Class Anabul
 *Nama/NIM      : Izzatu Khoirul Fata / 24060124120039
 *Tanggal       : 28 April 2026
 */
class Anabul {
    //Kamus
    String nama;

    //Algoritma
    public Anabul(String nama) {
        this.nama = nama;
    }

    public void gerak() {
        System.out.println("Anabul bergerak");
    }

    public void bersuara() {
        System.out.println("Anabul bersuara");
    }

    public String getNama() {
        return nama;
    }
}
