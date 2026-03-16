/* Nama File        : Pegawai.java
 * Deskripsi        : berisi atribut dan metode dalam class Pegawai
 * Pembuat          : Izzatu Khoirul Fata/24060124120039
 * Tanggal          : 15 MAret 2026 */

package Pegawai_Univ;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {

    protected String NIP;
    protected String nama;
    protected LocalDate tanggal_lahir;
    protected LocalDate TMT;
    protected double gaji_pokok;

    // Konstruktor
    Pegawai(){

    }

    Pegawai(String NIP, String nama, LocalDate tanggal_lahir, LocalDate TMT, double gaji_pokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggal_lahir = tanggal_lahir;
        this.TMT = TMT;
        this.gaji_pokok = gaji_pokok;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public LocalDate getTanggalLahir() {
        return tanggal_lahir;
    }

    public void setTanggalLahir(LocalDate tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public LocalDate getTMT() {
        return TMT;
    }

    public void setTMT(LocalDate TMT) {
        this.TMT = TMT;
    }

    public double getGajiPokok() {
        return gaji_pokok;
    }

    public void setGajiPokok(double gaji_pokok) {
        this.gaji_pokok = gaji_pokok;
    }

    public Period hitungMasaKerja() {
        LocalDate tanggalAcuan = LocalDate.of(2025, 3, 10);
        return Period.between(TMT, tanggalAcuan);
    }

    public Period getMasaKerja() {
        return hitungMasaKerja();
    }

    public String formatTanggal(LocalDate tanggal) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        return tanggal.format(formatter);
    }


    public void printInfo() {
        System.out.println("NIP : " + NIP);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(tanggal_lahir));
        System.out.println("TMT : " + formatTanggal(TMT));
        System.out.println("Gaji Pokok : Rp " + gaji_pokok);

        Period masaKerja = getMasaKerja();
        System.out.println("Masa Kerja : " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
    }
}