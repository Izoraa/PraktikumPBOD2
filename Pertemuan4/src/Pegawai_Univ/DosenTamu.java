/* Nama File        : DosenTamu.java
 * Deskripsi        : berisi atribut dan metode dalam class DosenTamu
 * Pembuat          : Izzatu Khoirul Fata/24060124120039
 * Tanggal          : 16 MAret 2026 */

package Pegawai_Univ;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DosenTamu extends Dosen{
    private String NIDK;
    private LocalDate tglBerakhirKontrak;

    // Konstrukotr
    DosenTamu(){

    }

    DosenTamu(String NIP, String nama, LocalDate tanggal_lahir, LocalDate TMT, double gaji_pokok, String Fakultas, String NIDK, LocalDate tglBerakhirKontrak){
        super(NIP, nama, tanggal_lahir, TMT, gaji_pokok,  Fakultas);
        this.NIDK = NIDK;
        this.tglBerakhirKontrak = tglBerakhirKontrak;
    }

    public double hitungTunjangan(){
        return 0.025 * gaji_pokok;
    }

    public Period sisaKontrak(){
        return Period.between(LocalDate.now(), tglBerakhirKontrak);
    }

    public String formatTanggal(LocalDate tanggal) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        return tanggal.format(formatter);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        Period kontrak = sisaKontrak();
        int totalBulan = kontrak.getYears() * 12 + kontrak.getMonths();

        System.out.println("NIDK : " + NIDK);
        System.out.println("Tanggal Kontak Berakhir : " + formatTanggal(tglBerakhirKontrak));
        System.out.println("Sisa Kontrak : " + totalBulan + " bulan");
        System.out.println("Tunjangan : " + hitungTunjangan());
    }

}
