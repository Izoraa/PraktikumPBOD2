/* Nama File        : MainAnabul.java
 * Deskripsi        : Class MainAnabul untuk menguji objek Anabul dan penggunaan generik Datum
 * Pembuat          : Izzatu Khoirul Fata/24060124120039
 * Tanggal          : 28 April 2026 */

import java.util.ArrayList;

public class MainAnabul {
    public static void main(String[] args) {

        Anabul anabul1 = new Kucing("Kuching", 3.0);
        Anabul anabul2 = new Anjing("Dog");
        Anabul anabul3 = new Burung("Bird");

        ArrayList<Anabul> anabuls = new ArrayList<>();
        anabuls.add(anabul1);
        anabuls.add(anabul2);
        anabuls.add(anabul3);

        for (Anabul anabul : anabuls) {
            anabul.gerak();
            anabul.bersuara();
        }

        Datum<Anabul> A = new Datum<>();

        System.out.println("-Anabul 1-");
        A.setIsi(anabul1);
        System.out.println(A.getIsi().getNama());
        A.getIsi().gerak();
        A.getIsi().bersuara();

        System.out.println("-Anabul 2-");

        A.setIsi(anabul2);
        System.out.println(A.getIsi().getNama());
        A.getIsi().gerak();
        A.getIsi().bersuara();

        System.out.println("-Anabuol 3-");

        A.setIsi(anabul3);
        System.out.println(A.getIsi().getNama());
        A.getIsi().gerak();
        A.getIsi().bersuara();
    }
}