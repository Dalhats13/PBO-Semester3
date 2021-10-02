package minggu3;

import java.util.Scanner;

public class Soal1 {

    public static void main(String args[]) {
        
        //Declare Variable
        String a;
        String splitA[];
        
        //Scan Command
        Scanner input = new Scanner(System.in);
        
        //Proses
        a = input.nextLine(); // Scan & input String
        splitA = a.split("[!@,.'_\\s]+");
        
        //Tampil Ouput 
        System.out.println(splitA.length); 
        for ( String b : splitA) {
            System.out.println(b);
        }
    }
}
