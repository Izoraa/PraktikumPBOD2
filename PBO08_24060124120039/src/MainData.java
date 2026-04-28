/**
 * File         : MainData.java
 * Deskripsi    : Kelas utama untuk menguji larik generik Data
 *                menggunakan objek keluarga Anabul
 *Nama/NIM      : Izzatu Khoirul Fata / 24060124120039
 *Tanggal       : 28 April 2026
 */
public class MainData {
    public static void main(String[] args) {

        Data<Anabul> data = new Data<>();

        data.setIsi(1, new Kucing("Nana", 2.5));
        data.setIsi(2, new Anjing("Chese"));
        data.setIsi(3, new Burung("Bird"));
        data.setIsi(4, new Anggora("Chiko", 4.5));
        data.setIsi(5, new Kembangtelon("Mochi", 2.0));

        System.out.println("Isi Data Anabul :");

        for (int i = 1; i <= data.getSize(); i++) {
            Anabul a = data.getIsi(i);
            System.out.println("Nama: " + a.getNama());
            a.gerak();
            a.bersuara();
        }

        System.out.println("Banyak elemen efektif: " + data.getSize());
    }
}

// Kesimpulan cara kerja konsep Generik
// Konsep generik dalam Java digunakan untuk membuat class atau method yang dapat bekerja dengan berbagai tipe data tanpa harus menulis ulang kodenya. Dengan menggunakan generik bisa digunakan untuk menentukan tipe data saat pemanggilan, sehingga lebih fleksibel dan tetap aman dari kesalahan tipe datamya. Generik juga dapat digunakan pada class yang sudah dibuat seperti Datum, OperatorGenerik, dan Data yang digunakan untuk menyimpan, menukar, dan mengelola berbagai objek seperti Integer, String, maupun objek turunan Anabul. Hal ini membuat kode menjadi lebih umum, mudah digunakan kembali, dan tetap terstruktur tanpa perlu membuat class khusus untuk setiap tipe data.