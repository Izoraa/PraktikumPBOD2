/* Nama File        : PNS.java
 * Deskripsi        : berisi atribut dan metode dalam class PNS
 * Pembuat          : Izzatu Khoirul Fata/24060124120039
 * Tanggal          : 23 Maret 2026 */

package LaporanPajak;

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public PNS(String nama, LocalDate tglMulaiKerja, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, "", pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip() { return nip; }
    public void setNip(String nip) { this.nip = nip; }

    public static int getCounterPNS() { return counterPNS; }

    @Override
    public int hitungMasaKerja() {
        int tahun = Period.between(tglMulaiKerja, LocalDate.now()).getYears();
        return tahun + 9;
    }

    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }
}
