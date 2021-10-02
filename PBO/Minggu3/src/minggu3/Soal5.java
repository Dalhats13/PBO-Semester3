package minggu3;

import java.util.Scanner;

public class Soal5 {

    public static void main(String args[]) {
        
        //Declare Variabel
        String platNomer;
        long angka, Rumus;
	
        //Scan Command
	Scanner scan = new Scanner(System.in);
        platNomer = scan.nextLine();
        
        //Proses		
        //Menghilangkan spasi kemudian menjadikan bertipe long agar dapat diproses
        angka = Long.parseLong(platNomer.replaceAll("\\s", ""));
        //Rumus yang soal berikan
        Rumus = (angka - 999999) % 5; 
            if(Rumus == 0) { 
                System.out.println("Jalan");
            }else{ 
		System.out.println("Berhenti");
            }
    }
}
