public class Main {
    public static void main(String[] args) {

        Persegi persegi1 = new Persegi(4, "merah", "solid");
        Lingkaran lingkaran1 = new Lingkaran(1, "biru", "dashed");

        System.out.println("Persegi");
        persegi1.printInfo();
        System.out.println("Luas : " + persegi1.getLuas());
        System.out.println("Keliling : " + persegi1.getKeliling());
        System.out.println("Diagonal : " + persegi1.getDiagonal());

        System.out.println();

        System.out.println("Lingkaran");
        lingkaran1.printInfo();
        System.out.println("Luas : " + lingkaran1.getLuas());
        System.out.println("Keliling : " + lingkaran1.getKeliling());

        System.out.println("Jumlah Objek Bangun Datar : " + BangunDatar.counterBangunDatar);
    }
}