/**
 * File         : Main.java
 * Deskripsi    : Kelas utamauntuk menguji Class Piaraan dan Anabul serta turunannya
 *Nama/NIM      : Izzatu Khoirul Fata / 24060124120039
 *Tanggal       : 5 Mei 2026
 */
public class Main {
    public static void main(String[] args) {

        Piaraan p = new Piaraan();
        Anjing a1 = new Anjing("Ruby");
        Burung b1 = new Burung("RIoo");
        Kucing k1 = new Kucing("Cimeng", 4.5);
        Anggora a2 = new Anggora("Gembul", 3.2);
        Kembangtelon kt = new Kembangtelon("Belang", 5.1);

        p.enqueueAnabul(a1);
        p.enqueueAnabul(b1);
        p.enqueueAnabul(k1);
        p.enqueueAnabul(a2);
        p.enqueueAnabul(kt);

        System.out.println("Daftar Anabul :");
        p.showAnabul();

        System.out.println("\nJumlah keluarga kucing: ");
        System.out.println(p.countKucing());

        System.out.println("\nTotal bobot keluarga kucing : ");
        System.out.println(p.bobotKucing());

        System.out.println("\nJenis Jenis Anabul : ");
        p.showJenisAnabul();

        System.out.println("\nAnabul pertama adalahh:");
        System.out.println(p.getAnabul().getNama());

        System.out.println("\nDequeue");
        System.out.println(p.dequeueAnabul().getNama());

        System.out.println("\nIsi antrean setelah dequeue : ");
        p.showAnabul();
    }
}

// Cara kerja konsep koleksi berdasarkan yangsudah diajarkan dikelas dan juga dipraktikum adalah cara menyimpan banyak objek dalam satu wadah. Seperti dicontoh saol praktikum koleksi digunakan untuk menyimpan objek-objek Anabul ke dalam antrean Piaraan. Koleksi juga bisa mennggunakan konsep turunan dan polymorphisme, koleksi bertipe Anabul dapat menyimpan berbagai turunan seperti Anjing, Burung, Kucing, Anggora, dan Kembangtelon. Penggunaan koleksi mempermudah pengolahan data secara terstruktur.