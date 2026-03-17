/* Nama File        : Lingkaran.java
 * Deskripsi        : berisi atribut dan metode dalam class Lingkaran
 * Pembuat          : Izzatu Khoirul Fata/24060124120039
 * Tanggal          : 17 MAret 2026 */

public class Lingkaran extends BangunDatar implements IResize{
    private double jari;

    Lingkaran(){
        setjmlSisi(1);
    }

    Lingkaran(double jari, String warna, String border){
        super(1, warna, border);
        this.jari = jari;
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI * jari * jari;
    }

    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut() {
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent) {
        jari = jari * percent/100;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari : " + jari);
    }
}