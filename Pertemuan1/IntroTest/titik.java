public class Titik {
    // Atribut
    double absis;
    double ordinat;

    // METHOD
    // Konstruktor membuat titik (0,0)
    Titik (){
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

    //Mengeset absis dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }
    //Mengeset Ordinat
    void setOrdinat(double y){
        ordinat = y;
    }
}