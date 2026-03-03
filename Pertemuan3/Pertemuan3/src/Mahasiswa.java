import java.util.ArrayList;

public class Mahasiswa{
    //Atribut
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan Kendaraan;

    //Method
    Mahasiswa(){
        nim = " ";
        nama = " ";
        prodi = " ";
        listMatkul = new ArrayList<>();
        dosenWali = new Dosen();
        Kendaraan = new Kendaraan();
    }

    Mahasiswa (String nim, String nama, String prodi){
        this();
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNim(){
        return nim;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public int getJumlahMatkul(){
        return listMatkul.size();
    }

    public int getJumlahSKS(){
        int totalsks = 0;
        for(MataKuliah Matkul  : listMatkul){
            totalsks += Matkul.getsks();
        }
        return totalsks;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;

    }
    public void setKendaraan(Kendaraan kendaraan){
        this.Kendaraan = kendaraan;
    }

    public void addMatkul(MataKuliah newMatKul){
        listMatkul.add(newMatKul);
    }

    public void printDetailMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        int i;
        for (i=0;i<listMatkul.size();i++){
            System.out.println(listMatkul.get(i).getNama());
        }
    }
}