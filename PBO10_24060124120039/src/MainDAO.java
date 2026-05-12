/**
 * File : MainDAO.java
 * Deskripsi : Main program untuk akses DAO
 * Nama/NIM  : Izzatu Khoirul Fata / 24060124120039
 * Tanggal   : 12 Mei 2026
 */

public class MainDAO {
    public static void main(String args[]) {
        Person person = new Person("Izzatu");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());

        try {
            m.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
