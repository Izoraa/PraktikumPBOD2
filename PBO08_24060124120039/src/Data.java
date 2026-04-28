/**
 * File : Data.java
 * Deskripsi : Kelas generik yang menyimpan data dalam larik statik
 * berisi maksimal 100 elemen generik
 * Nama/NIM : Izzatu Khoirul Fata / 24060124120039
 * Tanggal : 28 April 2026
 */
public class Data<G> {
    // Kamus
    private Object[] ruang;
    private int banyak;

    // Algoritma
    public Data() {
        ruang = new Object[100];
        banyak = 0;
    }

    public G getIsi(int posisi) {
        return (G) ruang[posisi - 1];
    }

    public void setIsi(int posisi, G isi) {
        if (posisi >= 1 && posisi <= 100) {
            if (ruang[posisi - 1] == null) {
                banyak++;
            }
            ruang[posisi - 1] = isi;
        }
    }

    public int getSize() {
        return banyak;
    }
}