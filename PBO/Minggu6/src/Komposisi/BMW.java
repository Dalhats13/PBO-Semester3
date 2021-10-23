package Komposisi;

public class BMW extends Kendaraan{
 
  //Mewarisi semua properti dari class Kendaraan
 
  public void setStart(){
 
    MesinBMW mesin = new MesinBMW();//komposisi
 
    mesin.start();
 
  }
 
}
    
