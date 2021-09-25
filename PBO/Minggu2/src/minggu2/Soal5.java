package minggu2;

import java.util.Scanner;

public class Soal5 {

    public static void main(String args[]) {
    
    Scanner sc=new Scanner(System.in);
    
    //Declare Variable dan jadikan untuk input
    String A = sc.next();
    String B = sc.next();
    
    //Sum
    System.out.println( A.length() + B.length() );
    
    //Compare with Ternary Operator
    System.out.println( (A.compareTo(B) > 0) ? "Yes" : "No");
    
    //Cetak Hasil
    System.out.println(
        A.substring(0, 1).toUpperCase() + A.substring(1) + " " +
        B.substring(0, 1).toUpperCase() + B.substring(1)
        ); 
    }
}
