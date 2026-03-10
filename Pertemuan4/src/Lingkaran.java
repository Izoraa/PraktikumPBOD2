public class Lingkaran extends BangunDatar{
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

    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari : " + jari);
    }
}