/**
 * File         : MahasiswaNo4.java
 * Deskripsi    : Berisi Atribut dan Methode dari Class MahasiswaNo4 (untuk soal no 4)
 * Nama/NIM     : Izzatu Khoirul Fata / 24060124120039
 * Tanggal      : 21 April 2026
 */
public class MahasiswaNo4 extends Civitasakademika{
    //Kamus
    String nim;
    Dosen dosenWali;
    //algoritma
    MahasiswaNo4(String nama, String nim, Dosen dosenWali){
        super(nama);
        this.nim = nim;
        this.dosenWali = dosenWali;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public String getNim(){
        return nim;
    }

    public void setWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public String getWali(){
        return dosenWali.getNama();
    }

    @Override
    public String getNomor(){
        return nim;
    }

    public void tampilDataMahasiswa(){
        System.out.println("NIM : " +nim);
        System.out.println("Nama Mahasiswa : " +nama);
        System.out.println("Nama Dosen Wali : " +dosenWali.getNama());
    }
}
