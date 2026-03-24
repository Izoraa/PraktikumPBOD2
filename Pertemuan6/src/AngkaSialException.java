/**
 * File : AngkaSialException.java
 * Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
 *Nama/NIM     : Izzatu Khoirul Fata / 24060124120039
 *Tanggal      : 24 Maret 2026
 */

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}