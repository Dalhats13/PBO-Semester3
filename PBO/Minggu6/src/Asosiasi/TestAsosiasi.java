package Asosiasi;

public class TestAsosiasi { 
    
    public static void main(String args []){ 
        Mahasiswa mahasiswa = new Mahasiswa("Naufal Dalhats", 201511022); 
        Jurusan jurusan = new Jurusan("Teknik Informatika"); 
        jurusan.setMahasiswa(mahasiswa); 
        mahasiswa.setJurusan(jurusan); 
        System.out.print("Nama: " + mahasiswa.getNama() +"\n"+ "ID: " + mahasiswa.getNomorID() +"\n" + 
                "Jurusan: " + jurusan.getNamaJurusan()); 
    } 
}  
