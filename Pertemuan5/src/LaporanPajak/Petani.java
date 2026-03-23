/* Nama File        : Petani.java
 * Deskripsi        : berisi atribut dan metode dalam class Petani
 * Pembuat          : Izzatu Khoirul Fata/24060124120039
 * Tanggal          : 23 Maret 2026 */

package LaporanPajak;

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    private String asalKota;
    private static int counterPetani = 0;

    public Petani(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String asalKota) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }

    public String getAsalKota() { return asalKota; }
    public void setAsalKota(String asalKota) { this.asalKota = asalKota; }

    public static int getCounterPetani() { return counterPetani; }

    @Override
    public int hitungMasaKerja() {
        int tahun = Period.between(tglMulaiKerja, LocalDate.now()).getYears();
        return tahun + 0;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asalKota);
    }
}
