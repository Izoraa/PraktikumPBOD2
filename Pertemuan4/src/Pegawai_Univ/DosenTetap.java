/* Nama File        : DosenTeteap.java
 * Deskripsi        : berisi atribut dan metode dalam class DosenTeteap
 * Pembuat          : Izzatu Khoirul Fata/24060124120039
 * Tanggal          : 16 MAret 2026 */

package Pegawai_Univ;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DosenTetap extends Dosen {
    private String NIDN;
    private final int BUP = 65;

    public DosenTetap(String NIP, String nama, LocalDate tanggal_lahir,
            LocalDate TMT, double gaji_pokok, String fakultas, String NIDN) {

        super(NIP, nama, tanggal_lahir, TMT, gaji_pokok, fakultas);
        this.NIDN = NIDN;
    }

    public String getNIDN() {
        return NIDN;
    }

    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }

    public double hitungTunjangan() {
        Period masaKerja = getMasaKerja();
        int tahun = masaKerja.getYears();
        return 0.02 * tahun * gaji_pokok;
    }

    public LocalDate hitungTanggalPensiun() {
        return tanggal_lahir.plusYears(BUP).plusMonths(1).withDayOfMonth(1);
    }

    public String formatTanggal(LocalDate tanggal) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        return tanggal.format(formatter);
    }

    @Override
    public void printInfo() {
        super.printInfo();

        System.out.println("NIDN : " + NIDN);
        System.out.println("BUP : " + BUP + " tahun");
        System.out.println("Tunjangan : " + hitungTunjangan());
        System.out.println("Tanggal Pensiun : " + formatTanggal(hitungTanggalPensiun()));
    }
}