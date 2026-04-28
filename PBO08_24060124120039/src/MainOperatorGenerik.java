/* Nama File        : MainOperatorGenerik.java
 * Deskripsi        : Class MainOperatorGenerik untuk menguji operasi generik Tukar dan Bobot2
 * Pembuat          : Izzatu Khoirul Fata/24060124120039
 * Tanggal          : 28 April 2026 */

public class MainOperatorGenerik {
    public static void main(String[] args) {

        Integer[] a = {1};
        Integer[] b = {3};
        OperatorGenerik.Tukar(a, b);
        System.out.println("Integer: " + a[0] + " " + b[0]);

        String[] s1 = {"Izzatu"};
        String[] s2 = {"Khoirul"};

        OperatorGenerik.Tukar(s1, s2);
        System.out.println("String: " + s1[0] + " " + s2[0]);

        Anabul[] anabul1 = {new Anjing("Chester")};
        Anabul[] anabul2 = {new Kucing("Nana", 2.5)};

        OperatorGenerik.Tukar(anabul1, anabul2);
        System.out.println("Anabul:");
        System.out.println(anabul1[0].getNama());
        System.out.println(anabul2[0].getNama());

        Anggora k1 = new Anggora("Chiko", 4.5);
        Kembangtelon k2 = new Kembangtelon("Mochi", 2.0);

        double hasil = OperatorGenerik.Bobot2(k1, k2);
        System.out.println("Total bobot " + k1.getNama() + " dan " + k2.getNama() + " = " + hasil + " kg");
    }
}