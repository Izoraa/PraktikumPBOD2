/* Nama File        : Pengusaha.java
 * Deskripsi        : berisi atribut dan metode dalam class Pengusaha
 * Pembuat          : Izzatu Khoirul Fata/24060124120039
 * Tanggal          : 23 Maret 2026 */

package LaporanPajak;

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp() { return npwp; }
    public void setNpwp(String npwp) { this.npwp = npwp; }

    public static int getCounterPengusaha() { return counterPengusaha; }

    @Override
    public int hitungMasaKerja() {
        int tahun = Period.between(tglMulaiKerja, LocalDate.now()).getYears();
        return tahun + 3;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }
}
