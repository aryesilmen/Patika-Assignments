package Giris;

import java.util.Scanner;

public class HW_Donguler_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int a;
        a=input.nextInt();
        for (int i=1;i<=a;i*=4){
            System.out.println(i);
        }
        for (int j=1;j<=a;j*=5){
            System.out.println(j);
        }
    }
}
