import java.util.*;

class Teman<T> {
    private int nbelm;
    private T[] Lnama;

    public Teman() {
        nbelm = 0;
        Lnama = (T[]) new Object[100];
    }

    public int getNbelm() {
        return nbelm;
    }

    public T getNama(int indeks) {
        return Lnama[indeks];
    }

    public void setNama(int indeks, T nama) {
        Lnama[indeks] = nama;
    }

    public void addNama(T nama) {
        Lnama[nbelm] = nama;
        nbelm++;
    }

    public void delNama(T nama) {
        for (int i = 0; i < nbelm; i++) {
            if (Lnama[i] == nama) {
                for (int j = i; j < nbelm - 1; j++) {
                    Lnama[j] = Lnama[j + 1];
                }
                Lnama[nbelm - 1] = null;
                nbelm--;
                i--;
            }
        }
    }

    public boolean isMember(T nama) {
        for (int i = 0; i < nbelm; i++) {
            if (Lnama[i] == nama) {
                return true;
            }
        }
        return false;
    }

    public void gantiNama(T nama, T namabaru) {
        for (int i = 0; i < nbelm; i++) {
            if (Lnama[i] == nama) {
                Lnama[i] = namabaru;
            }
        }
    }

    public int countNama(T nama) {
        int count = 0;
        for (int i = 0; i < nbelm; i++) {
            if (Lnama[i] == nama) {
                count++;
            }
        }
        return count;
    }

    public void showTeman() {
        for (int i = 0; i < nbelm; i++) {
            System.out.println(Lnama[i]);
        }
    }
}