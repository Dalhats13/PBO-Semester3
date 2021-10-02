package minggu3;

import java.util.Scanner;

public class Soal4 {

    public static void main(String args[]) {
        
        //Declare variable
        final int gajiPokok = 500000;
        final int hargaBarang = 50000;
        int  gajiTotal,jumlahJual;
        
        //Scan Command
        Scanner input = new Scanner(System.in);
        jumlahJual = input.nextInt();
        
        //Proses 
        if(jumlahJual < 15) { //jika barang terjual kurang dari 15
            gajiTotal = gajiPokok - ((15 - jumlahJual) * hargaBarang * 15/100);
        }else if(jumlahJual > 80) { //jika barang terjual lebih dari 80
            gajiTotal = gajiPokok + (jumlahJual * hargaBarang * 35/100);
	}else if(jumlahJual >= 40) { //jika barang terjual minimal 40
            gajiTotal = gajiPokok + (jumlahJual * hargaBarang * 25/100);
	}else{ //jika jumlah barang terjual 15 hingga 39
            gajiTotal = (jumlahJual * hargaBarang * 10/100) + gajiPokok;
        }
	System.out.println(gajiTotal);
    }
}
