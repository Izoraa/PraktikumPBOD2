package Pegawai_Univ;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Tendik extends Pegawai {

    private String bidang;
    private final int BUP = 55;

    public Tendik(String NIP, String nama, LocalDate tanggal_lahir,
            LocalDate TMT, double gaji_pokok, String bidang) {

        super(NIP, nama, tanggal_lahir, TMT, gaji_pokok);
        this.bidang = bidang;
    }

    public double hitungTunjangan() {
        Period masaKerja = getMasaKerja();
        int tahun = masaKerja.getYears();
        return 0.01 * tahun * gaji_pokok;
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

        System.out.println("Bidang : " + bidang);
        System.out.println("BUP : " + BUP + " tahun");
        System.out.println("Tunjangan : " + hitungTunjangan());
        System.out.println("Tanggal Pensiun : " + formatTanggal(hitungTanggalPensiun()));
    }
}