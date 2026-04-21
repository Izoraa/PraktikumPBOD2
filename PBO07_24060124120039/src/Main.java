/* Nama File        : Main.java
 * Deskripsi        : berisi Main dari Class-class yang dibuat
 * Pembuat          : Izzatu Khoirul Fata/24060124120039
 * Tanggal          : 21 Apreil 2026 */

public class Main {
    public static void main(String[] args) {

        // Main untuk Mahasiswa (Overloading no 2)
        System.out.println("Tapa parameter : ");
        Mahasiswa m1 = new Mahasiswa();
        m1.printInfo();

        System.out.println("\n 3 parameter input : ");
        Mahasiswa m2 = new Mahasiswa("001", "Adi", "Informatika");
        m2.printInfo();

        System.out.println("\nsetProgramStudi tanpa parameter :");
        m1.setProgramStudi();
        m1.printInfo();

        System.out.println("\nsetProgramStudi(String) : ");
        m1.setProgramStudi("Ilmu Komputer");
        m1.printInfo();

        System.out.println("\nsetProgramStudi(Mahasiswa) :");
        m1.setProgramStudi(m2);
        m1.printInfo();

        System.out.println("\nObjek kloning");
        Mahasiswa m3 = new Mahasiswa(m2);
        m3.printInfo();

        // MAin untuk Soal no 3 (universal inclusion)
        Anabul[] peliharaan = {
            new Kucing("Kuching"),
            new Anjing("Dog"),
            new Burung("Bird")
        };

        for (Anabul a : peliharaan) {
            a.gerak();
            a.bersuara();
            System.out.println("---------");
        }


        //Main untuk Soal nomor 4
        Dosen d1 = new Dosen("Budiono", "D01");
        Dosen d2 = new Dosen("Sri", "D02");

        MahasiswaNo4 m6 = new MahasiswaNo4("Adi", "001", d1);
        MahasiswaNo4 m7 = new MahasiswaNo4("Budi", "002", d1);
        MahasiswaNo4 m8 = new MahasiswaNo4("Cantika", "003", d2);
        MahasiswaNo4 m9 = new MahasiswaNo4("Deni", "004", d2);
        MahasiswaNo4 m10 = new MahasiswaNo4("Eko", "005", d1);

        Seminar seminar = new Seminar();
        seminar.registrasi(d1);
        seminar.registrasi(d2);
        seminar.registrasi(m6);
        seminar.registrasi(m7);
        seminar.registrasi(m8);
        seminar.registrasi(m9);
        seminar.registrasi(m10);

        System.out.println("Total Peserta: " + seminar.countPeserta());

        System.out.println("\nDaftar Peserta:");
        seminar.tampilPeserta();

        System.out.println("\nJumlah Mahasiswa: " + seminar.countMahasiswa());

        m6.setWali(d2);
        System.out.println("\nData Mahasiswa:");
        m6.tampilDataMahasiswa();
        m7.tampilDataMahasiswa();
        m8.tampilDataMahasiswa();
        m9.tampilDataMahasiswa();
        m10.tampilDataMahasiswa();
    }
}

//Kesimpulan dari Polimorfisme
// Polimorfisme yang merupakan konsep bahwa satu nama atau entitas bisa memiliki banyak bentuk atau perilaku yang berbeda-beda. Cara kerjanya pada coercion (konversi tipe data) atau casting, polimorfisme bekerja pada perubahan tipe data. Satu nilai bisa diubah menjadi integer, double, ataupun string dengan fungsi parseInt, parseDouble, dan toString. Penggunaan polimorfisme pada overloading adalah dengan satu nama yang sama, namun mempunyai parameter yang berbeda, sehingga cara kerjanya akan berbeda-beda sesuai kegunaannya masing-masing. Sedangkan pada universal inclusion, polimorfisme bekerja ketika objek dari kelas turunan diperlakukan sebagai kelas induk, tetapi tetap menjalankan perilaku sesuai dengan jenis aslinya. Misalnya, objek Kucing, Anjing, dan Burung disimpan dalam satu tipe Anabul, namun saat method dipanggil, masing-masing menghasilkan perilaku yang berbeda.
