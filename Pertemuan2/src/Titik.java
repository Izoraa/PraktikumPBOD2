/* Nama File        : Titik.java
 * Deskripsi        : berisi atribut dan metode dalam class titik
 * Pembuat          : Izzatu Khoirul Fata/24060124120039
 * Tanggal          : 24 Februari 2026 */

public class Titik {
    // Atribut
    double absis;
    double ordinat;
    static int counterTitik = 0;

    // METHOD
    // Konstruktor membuat titik (0,0)
    Titik(){
        absis = 0;
        ordinat = 0;
    }

    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //Mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }
    //Mengembalikan nilai Ordinat
    double getOrdinat(){
        return ordinat;
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

    void printCounterTitik(){
        System.out.println(this.counterTitik);
    }

    int Kuadran() {
        if (absis > 0 && ordinat > 0){
            return 1;
        }else if (absis < 0 && ordinat > 0){
            return 2;
        }else if (absis < 0 && ordinat < 0){
            return 3;
        }else if (absis > 0 && ordinat < 0){
            return 4;
        }else {
            return 0;
        }
    }

    Titik getRefleksiX(){
        return new Titik(this.getAbsis(), -this.getOrdinat());
    }

    Titik getRefleksiY(){
        return new Titik(-this.getAbsis(), this.getOrdinat());
    }

    void refleksiY(){
        setAbsis(getOrdinat() * -1);
    }

    void refleksiX(){
        setOrdinat(getOrdinat() * -1);
    }

    //Mencetak koordinat titk
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}//end class titik