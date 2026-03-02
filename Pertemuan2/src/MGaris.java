/* Nama File        : MGaris.java
 * Deskripsi        : berisi Main untuk class garis
 * Pembuat          : Izzatu Khoirul Fata/24060124120039
 * Tanggal          : 1 Maret 2026 */

public class MGaris {

    public static void main(String[] args) {

        Garis g1 = new Garis();
        Garis g2 = new Garis(new Titik(2,4), new Titik(4,8));

        System.out.println("Panjang garis g1: " + g1.panjangGaris());
        System.out.println("Panjang garis g2: " + g2.panjangGaris());

        System.out.println("Gradien g1: " + g1.gradienGaris());
        System.out.println("Gradien g2: " + g2.gradienGaris());

        System.out.println("Titik tengah g1:");
        g1.getTitikTengah().printTitik();

        System.out.println("Titik tengah g2:");
        g2.getTitikTengah().printTitik();

        System.out.println("Garis g1 dan g2 apakah sejajar? : " + g1.isSejajar(g2));

        System.out.println("Persamaan g1: " + g1.getPersamaanGaris());
        System.out.println("Persamaan g2: " + g2.getPersamaanGaris());
    }
}