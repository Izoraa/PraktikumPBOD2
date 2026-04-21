/**
 * File : MAhasiswa.java
 * Deskripsi : Berisi Class MAhasiswa beserta methodenya
 *Nama/NIM     : Izzatu Khoirul Fata / 24060124120039
 *Tanggal      : 21 April 2026
 */
class Mahasiswa {

    // KAmus
    String nim;
    String nama;
    String programStudi;

    // Algoritma
    public Mahasiswa() {
        this.nim = "-999";
        this.nama = "n/a";
        this.programStudi = "n/a";
    }

    public Mahasiswa(String nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    public Mahasiswa(Mahasiswa m) {
        this.nim = m.nim;
        this.nama = m.nama;
        this.programStudi = m.programStudi;
    }

    public void setProgramStudi() {
        this.programStudi = "Kosong";
    }

    public void setProgramStudi(String ps) {
        this.programStudi = ps;
    }

    public void setProgramStudi(Mahasiswa m) {
        this.programStudi = m.programStudi;
    }

    public void printInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Program Studi: " + programStudi);
    }
}
