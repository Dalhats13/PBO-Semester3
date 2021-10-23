package Asosiasi;

public class Mahasiswa { 
    
    private String nama; 
    private int nomorID; 
    private Jurusan jurusan; 
    
    public Mahasiswa(String nama, int nomorID){ 
        this.nama = nama; 
        this.nomorID = nomorID; 
        jurusan = null; 
    } 
    public String getNama() {
        return nama; 
    } 
    
    public void setNama(String nama) {
        this.nama = nama; 
    } 
    
    public int getNomorID() { 
        return nomorID; 
    } 
    
    public void setNomorID(int nomorID) { 
        this.nomorID = nomorID; 
    } 
    
    public void setJurusan(Jurusan jurusan) { 
        this.jurusan = jurusan; 
    } 
}

