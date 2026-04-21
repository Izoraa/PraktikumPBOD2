/**
 * File         : Dosen.java
 * Deskripsi    : Berisi Atribut dan Methode dari Class Dosen
 * Nama/NIM     : Izzatu Khoirul Fata / 24060124120039
 * Tanggal      : 21 April 2026
 */
public class Dosen extends Civitasakademika{
    //Kamus
    String nip;

    //algoritma
    public Dosen(String nama, String nip){
        super(nama);
        this.nip = nip;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public String getNip(){
        return nip;
    }

    @Override
    public String getNomor(){
        return nip;
    }

}
