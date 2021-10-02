package minggu3;

import java.math.BigInteger;
import java.util.Scanner;

public class Soal6 {

    public static void main(String args[]) {
       
       //Declare Variable
       String s1,s2;
       
       //Scan Command
       Scanner input = new Scanner(System.in);
       s1=input.nextLine();
       s2=input.nextLine();
       
       //Proses
       System.out.println(new BigInteger(s1).add(new BigInteger(s2)));
       System.out.println(new BigInteger(s1).multiply(new BigInteger(s2)));
    }
}
