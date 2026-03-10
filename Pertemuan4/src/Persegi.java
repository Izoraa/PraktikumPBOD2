/* Nama File        : Persegi.java
 * Deskripsi        : berisi atribut dan metode dalam class Persegi
 * Pembuat          : Izzatu Khoirul Fata/24060124120039
 * Tanggal          : 10 MAret 2026 */

public class Persegi extends BangunDatar{
    private double sisi;

    Persegi(){
        setjmlSisi(4);
    }

    Persegi(double sisi, String warna, String border){
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }

    public void setsisi(double sisi){
        this.sisi = sisi;
    }

    public double getLuas(){
        return sisi * sisi;
    }

    public double getKeliling(){
        return getjmlSisi() * sisi;
    }

    public double getDiagonal(){
        return sisi * Math.sqrt(2);
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi : " + sisi);
    }
}