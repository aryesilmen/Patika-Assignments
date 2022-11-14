package Giris;

import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("Sayı Giriniz: ");
        double result=0;
        a= input.nextInt();
        for (int i=1;i<=a;i++){
            result+=(1.0/i);
        }
        System.out.println("Harmonik Seri Toplamı: "+result);
    }
}