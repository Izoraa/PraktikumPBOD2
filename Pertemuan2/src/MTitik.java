/* Nama File        : MTitik.java
 * Deskripsi        : berisi Main untuk class titik
 * Pembuat          : Izzatu Khoirul Fata/24060124120039
 * Tanggal          : 24 Februari 2026 */

public class MTitik {
    public static void main(String [] args) {
        Titik T1 = new Titik(); //Membuat objek titik T1(0,0)
        T1.setAbsis(3); //Mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4);  //Mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); //Mencetak koordinat titik T1
        T1.geser(3,4); // Menggeser T1 sejauh (3,4)
        T1.printTitik(); //Menampillkan koordinat T1 seletah digeser 0


        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        T1.Kuadran();
        T1.refleksiX();
        T1.printTitik();
        T1.refleksiY();
        T1.printTitik();
        System.out.println("T1 berada di Kuadran = " + T1.Kuadran());

    }
}