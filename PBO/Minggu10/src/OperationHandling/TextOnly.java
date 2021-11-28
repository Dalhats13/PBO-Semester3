package OperationHandling;

import java.util.*;

public class TextOnly {

    public static void main(String args[]) {
        
    Scanner input = new Scanner(System.in);
    
    try{
        System.out.print("Masukkan inputan: ");
        int angka = input.nextInt();
        System.out.println("Input adalah "+angka);
    }
    
    catch(Exception e){
       System.out.println("Error Message ="+e);
    }
  }      
}

//Sebelum modifikasi
/* 
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan inputan: ");
    int angka = input.nextInt();
    System.out.println("Input adalah "+angka);
*/