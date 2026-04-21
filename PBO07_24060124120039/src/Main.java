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
    }
}