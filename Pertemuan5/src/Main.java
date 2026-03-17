/* Nama File        : Main.java
 * Deskripsi        : berisi Main dari Bangun Datar yang dibuat
 * Pembuat          : Izzatu Khoirul Fata/24060124120039
 * Tanggal          : 17 Maret 2026 */

public class Main {
    public static void main(String[] args) {
        //BangunDatar B1 = new BangunDatar(); (error)

        BangunDatar p1 = new Persegi(10, "Merah", "Hitam");
        Persegi p2 = new Persegi(5, "Biru", "Putih");

        BangunDatar l1 = new Lingkaran(14, "Kuning", "Hijau");
        Lingkaran l2 = new Lingkaran(28, "Ungu", "Abu");

        System.out.println("--Luas--");
        System.out.println(p1.getLuas());
        System.out.println(l1.getLuas());

        System.out.println("--Keliling--");
        System.out.println(p2.getKeliling());
        System.out.println(l2.getKeliling());

        System.out.println("Apakah luas sama? " + p1.isEqualLuas(l1));
        System.out.println("Apa Keliling sama? " + p2.isEqualKeliling(l2));

        p2.zoomIn();
        l2.zoomOut();

        System.out.println("--After Resize--");
        System.out.println(p2.getLuas());
        System.out.println(l2.getKeliling());

        System.out.println("Print Info TErbaru");
        p2.printInfo();
        l2.printInfo();

        BangunDatar.printCounterBangunDatar();
    }
}