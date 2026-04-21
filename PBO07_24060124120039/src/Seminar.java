/**
 * File         : Seminar.java
 * Deskripsi    : Berisi Atribut dan Methode dari Class Seminar
 * Nama/NIM     : Izzatu Khoirul Fata / 24060124120039
 * Tanggal      : 21 April 2026
 */
class Seminar{
    //Kamus
    Civitasakademika[] peserta = new Civitasakademika[100];
    int banyakPeserta;
    //algortima
    public Seminar() {
        banyakPeserta = 0;
    }

    public int countPeserta() {
        return banyakPeserta;
    }

    public void registrasi(Civitasakademika c) {
        if (banyakPeserta < 100) {
            peserta[banyakPeserta] = c;
            banyakPeserta++;
        } else {
            System.out.println("Kapasitas penuh");
        }
    }

    public void tampilPeserta() {
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println(peserta[i].getNomor() + " - " + peserta[i].getNama());
        }
    }

    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (peserta[i] instanceof MahasiswaNo4) {
                count++;
            }
        }
        return count;
    }
}