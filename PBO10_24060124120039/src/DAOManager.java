/**
 * File : DAOManager.java
 * Deskripsi : pengelola DAO dalam program
 * Nama/NIM  : Izzatu Khoirul Fata / 24060124120039
 * Tanggal   : 12 Mei 2026
 */

public class DAOManager {

    private PersonDAO personDAO;
    public void setPersonDAO(PersonDAO person) {
        personDAO = person;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}