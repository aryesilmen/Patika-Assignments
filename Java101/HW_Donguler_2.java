package Giris;

import java.util.Scanner;

public class HW_Donguler_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, total=0;
        do{
            System.out.print("Sayı Giriniz: ");
            n=input.nextInt();

            if(n%4==0){
                total+=n;
            }
        }while (n%2!=1);
        System.out.println("Toplam: "+ total);
    }
}
