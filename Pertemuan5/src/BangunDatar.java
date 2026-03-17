/* Nama File        : BAngunDatar.java
 * Deskripsi        : berisi atribut dan metode dalam class BAngun Datar
 * Pembuat          : Izzatu Khoirul Fata/24060124120039
 * Tanggal          : 17 MAret 2026 */

public abstract class BangunDatar {
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    public abstract double getLuas();
    public abstract double getKeliling();

    BangunDatar(){
        counterBangunDatar++;
    }

    BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public int getjmlSisi(){
        return jmlSisi;
    }

    public void setjmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public String getwarna(){
        return warna;
    }

    public String getborder(){
        return border;
    }

    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }
    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar : " +counterBangunDatar);
    }
    public void printInfo(){
        System.out.println("Jumlah sisi : " + jmlSisi);
        System.out.println("Warna : " + warna);
        System.out.println("Border : " + border);
    }
}
