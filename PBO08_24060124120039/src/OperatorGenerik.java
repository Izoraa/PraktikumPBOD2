/* Nama File        : OperatorGenerik.java
 * Deskripsi        : Class yang berisi operator generik Tukar dan Bobot2
 * Pembuat          : Izzatu Khoirul Fata/24060124120039
 * Tanggal          : 28 April 2026 */

class OperatorGenerik {

    public static <T> void Tukar(T[] a, T[] b) {
        T temp = a[0];
        a[0] = b[0];
        b[0] = temp;
    }

    public static <T extends Kucing> double Bobot2(T k1, T k2) {
        return k1.getBobot() + k2.getBobot();
    }
}
