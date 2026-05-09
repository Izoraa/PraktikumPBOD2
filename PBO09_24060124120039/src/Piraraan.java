/**
 * File         : Piaraan.java
 * Deskripsi    : Berisi Class Piaraan beserta atribut dan methodenya
 *Nama/NIM      : Izzatu Khoirul Fata / 24060124120039
 *Tanggal         : 5 Mei 2026
 */

class Piaraan {
    // Kamus
    private int nbelm;
    private Anabul[] Lanabul;

    // Algoritma
    public Piaraan() {
        nbelm = 0;
        Lanabul = new Anabul[100];
    }

    public int getNbelm() {
        return nbelm;
    }

    public void enqueueAnabul(Anabul anabul) {
        Lanabul[nbelm] = anabul;
        nbelm++;
    }

    public boolean isMember(Anabul anabul) {
        for (int i = 0; i < nbelm; i++) {
            if (Lanabul[i] == anabul) {
                return true;
            }
        }

        return false;
    }

    public Anabul getAnabul() {
        if (nbelm == 0) {
            return null;
        }

        return Lanabul[0];
    }

    public Anabul dequeueAnabul() {
        if (nbelm == 0) {
            return null;
        }
        Anabul temp = Lanabul[0];
        for (int i = 0; i < nbelm - 1; i++) {
            Lanabul[i] = Lanabul[i + 1];
        }

        Lanabul[nbelm - 1] = null;
        nbelm--;
        return temp;
    }

    public void showAnabul() {
        for (int i = 0; i < nbelm; i++) {
            System.out.println(Lanabul[i].getNama());
        }
    }

    public int countKucing() {
        int count = 0;
        for (int i = 0; i < nbelm; i++) {
            if (Lanabul[i] instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    public double bobotKucing() {
        double total = 0;
        for (int i = 0; i < nbelm; i++) {
            if (Lanabul[i] instanceof Kucing) {
                total += ((Kucing) Lanabul[i]).getBobot();
            }
        }

        return total;
    }

    public void showJenisAnabul() {
        for (int i = 0; i < nbelm; i++) {
            System.out.println(
                    Lanabul[i].getNama()
                            + " - "
                            + Lanabul[i].getClass().getName());
        }
    }
}