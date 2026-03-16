/* Nama File        : Dosen.java
 * Deskripsi        : berisi atribut dan metode dalam class Dosen
 * Pembuat          : Izzatu Khoirul Fata/24060124120039
 * Tanggal          : 15 MAret 2026 */

package Pegawai_Univ;

import java.time.LocalDate;

public class Dosen extends Pegawai {
    protected String Fakultas;

    public Dosen() {

    }

    public Dosen(String NIP, String nama, LocalDate tanggal_lahir, LocalDate TMT, double gaji_pokok, String Fakultas) {
        super(NIP, nama, tanggal_lahir, TMT, gaji_pokok);
        this.Fakultas = Fakultas;
    }

    public String getFakultas() {
        return Fakultas;
    }

    public void setFakultas(String Fakultas) {
        this.Fakultas = Fakultas;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas : " + Fakultas);
    }

}
