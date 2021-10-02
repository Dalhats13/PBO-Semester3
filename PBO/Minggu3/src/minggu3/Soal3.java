package minggu3;

import java.util.Scanner;

public class Soal3 {

    public static void main(String args[]) {
       
        //Declare Variable
        int A, B;
        String operasi;
        
        //Scan Command
        Scanner input = new Scanner(System.in);
        
        //Proses
        A = input.nextInt();
        operasi = input.next();
        B = input.nextInt();
        
        if ((A >= 1 && A <= 1000) && (B >= 1 && B <= 1000)){
            switch(operasi){
                case "+" : 
                    System.out.println(A + B);
                    break;
                case "-" :
                    System.out.println(B - A);
                    break;
                case "*" : 
                    System.out.println(A * B);
                    break;
                case "%" : 
                    System.out.println(A % B);
                    break;
                //Hasil bagi dijamin
                case "/" :
                    if(A % B == 0) {
                        System.out.println(A / B);
                    }else{
                        System.out.println("A tidak habis dibagi B");
                    }
                    break;
                }
        }else{
            System.out.println("ketentuan angka adalah 1 - 1000");
        }
    }
}

