/**
 * File : Coersion.java
 * Deskripsi : Berisi Class Coersion dan Contoh penggunannya
 *Nama/NIM     : Izzatu Khoirul Fata / 24060124120039
 *Tanggal      : 21 April 2026
 */
public class Coersion {
    public static void main(String[] args) {

        //Coersion
        int nilai = 65;
        System.out.println("Integer: " + nilai);
        System.out.println("Char: " + (char) nilai);
        System.out.println("Double: " + (double) nilai);

        //Dari integer ke real kemudian balikin ke integer lagi dengan variabel beda
        int a = 65;
        double b = a;
        int c = (int) b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);


        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("S Hasil konkatenasi: " + S);
        System.out.println("Z hasil penjumlahan: " + Z);


        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("R Hasil konkatenasi: " + R);
        System.out.println("D hasil penjumlahan: " + D);

        //konversi S menjadi A integer
        Integer A = Integer.parseInt(S);
        System.out.println("A: " + A);

        //konversi A menjadi T SDtring
        String T = A.toString();
        System.out.println("T: " + T);
    }
}