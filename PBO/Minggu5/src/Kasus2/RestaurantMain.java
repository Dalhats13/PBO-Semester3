package Kasus2;

import java.util.Scanner;

public class RestaurantMain { 
    
    public static void main(String[] args) { 
        String name_food = null;
        byte a = 0,b;
        MenuMakanan menu = new MenuMakanan();
        Scanner scan = new Scanner(System.in);
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20); 
        menu.tambahMenuMakanan("Gehu", 1_000, 20); 
        menu.tambahMenuMakanan("Tahu", 1_000, 20); 
        menu.tambahMenuMakanan("Molen", 1_000, 20); 
        menu.tampilMenuMakanan(); 
        System.out.print("Masukan Nama Menu : ");
        name_food = scan.nextLine();
            if (null != name_food)switch (name_food) {
                case "Bala - Bala":
                    a = 1;
                    break;
                case "Gehu":
                    a = 2;
                    break;
                case "Tahu":
                    a = 3;
                    break;
                case "Molen":
                    a = 4;
                    break;
                default:
                    break;
            }
        System.out.print("Jumlah pesanan : ");
        b = scan.nextByte();
        menu.pesanMakanan(a, b);
        menu.tampilMenuMakanan();
        } 
    } 