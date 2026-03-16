/* Nama File        : Main.java
 * Deskripsi        : berisi Main dari Pegawai Universitas yang  telah dibuat
 * Pembuat          : Izzatu Khoirul Fata/24060124120039
 * Tanggal          : 16 Maret 2026 */

package Pegawai_Univ;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        DosenTetap dosen = new DosenTetap(
                "9545647548",
                "Andi",
                LocalDate.of(1990, 5, 5),
                LocalDate.of(2015, 1, 1),
                5000000,
                "Fakultas Sains dan Matematika",
                "78647324");
        dosen.printInfo();
    }
}