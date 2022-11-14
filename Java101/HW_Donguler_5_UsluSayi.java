package Giris;

import java.util.Scanner;

public class HW_Donguler_5_UsluSayi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a,b,total=1;
        System.out.print("Üssünü Almak İstediğiniz Sayıyı Giriniz: ");
        a= input.nextInt();

        System.out.print("Üs Sayısını Giriniz: ");
        b= input.nextInt();

        for(int i =1;i<=b;i++){
            total*=a;
        }
        System.out.print("Sonuç: "+total);

    }
}
