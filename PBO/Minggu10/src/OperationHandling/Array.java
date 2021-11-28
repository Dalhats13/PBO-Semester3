package OperationHandling;

public class Array {

public static void main (String[]args) {
        int Bilangan[]= {1,2,3};
        
      try{
        for(int i=0; i<=5; i++){
            System.out.println("elemen ke "+i+" = "+Bilangan[i]);
        }
      }
      catch(Exception e){
          System.out.println("Kapasitas Array melebihi batas atau tidak mencukupi");
      }
    }
}


//Sebelum menggunakan error handling
/*
public static void main (String[]args) {
        int Bilangan[]= {1,2,3};
        
        for(int i=0; i<=5; i++){
            System.out.println("elemen ke "+i+" = "+Bilangan[i]);
        }
    }
}
*/