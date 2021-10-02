package minggu3;

import java.util.Scanner;

public class Soal2 {

    public static void main(String args[]) {
       
        //Declare variable
        int angka;
        String kata;
        String jumlahKata[] = new String[3];
        int jumlahAngka[] = new int[3];
        
        //Scan Command
        Scanner input = new Scanner(System.in);
        
        //Proses
        for(int i = 0; i <3; i++){
            kata = input.next();
            if(kata.length() <= 10){
                angka = input.nextInt();
                if(angka >=1 && angka <= 999) {
                    jumlahKata[i] = kata;
                    jumlahAngka[i] = angka;
                }else{
                    System.out.println("Jumlah angka melebihi kapasitas");
                    return;
                } 
            }else{
                System.out.println("Jumlah kata tidak boleh melebihi 10");
                return;
            }
        }
        
        //Tampil Output
        System.out.println("========================");
        for (int j = 0; j <3; j++){
            if(jumlahAngka[j] < 100){
                System.out.printf("%-15s 0%d\n", jumlahKata[j], jumlahAngka[j]);
            }else{
                System.out.printf("%-15s %d\n", jumlahKata[j], jumlahAngka[j]);
            } 
        }
        System.out.println("========================");
    }
}

