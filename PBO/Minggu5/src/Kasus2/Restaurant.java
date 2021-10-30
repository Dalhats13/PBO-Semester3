package Kasus2;

public class Restaurant { 
    private String[] nama_makanan; 
    private double[] harga_makanan; 
    private int[] stok; 
    
    public Restaurant() {
	nama_makanan = new String[10];
	harga_makanan = new double[10];
	stok = new int[10];
    }

	public void setNamaMakanan(String nama, byte id) {
		nama_makanan[id] = nama;
	}

	public void setHargaMakanan(int harga,byte id) {
		harga_makanan[id] = harga;
	}

	public void setStok(int stok, byte id) {
		this.stok[id] += stok;
	}

	public String getNamaMakanan(int id) {
		return nama_makanan[id];
	}

	public int getHargaMakanan(int id) {
		return (int) harga_makanan[id];
	}

	public int getStok(int id) {
		return stok[id];
	}
	
	public void cutStok(int id, int total) {
		this.stok[id] -= total;
	}
} 

