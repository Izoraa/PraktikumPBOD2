/* Nama File       : Titik.java
 * Deskripsi       : berisi atribut dan metode dalam class titik
 * Pembuat          : Izzatu Khoirul Fata/24060124120039
 * Tanggal          : 20 Februari 2026 */

public class Titik {
    // Atribut
    double absis;
    double ordinat;

    // METHOD
    // Konstruktor membuat titik (0,0)
    Titik(){
        absis = 0;
        ordinat = 0;
    }

    //Mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }
    //Mengembalikan nilai Ordinat
    double getOrdinat(){
        return Ordinat;
    }

    //Mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }
    //Mengeset Ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    //MEngerser nilai absis dan ordinat masing masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //Mencetak koordinat titk
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}//end class titik