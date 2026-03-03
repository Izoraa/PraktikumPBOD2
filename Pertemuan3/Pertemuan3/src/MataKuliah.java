public class MataKuliah {
    private String idMatkul;
    private String nama;
    private int sks;

    MataKuliah(String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    MataKuliah(){
        this("0","0",0);
    }

    public String getidMatkul(){
        return idMatkul;
    }

    public String getNama(){
        return nama;
    }

    public int getsks(){
        return sks;
    }

    public void setidMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setsks(int sks){
        this.sks = sks;
    }

}