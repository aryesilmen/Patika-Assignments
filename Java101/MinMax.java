package Giris;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n,minValue=0,maxValue=0,nx;
        System.out.print("Kaç tane sayı gireceksiniz: ");
        n= input.nextInt();

        int i=1;

        do{
            System.out.print(i+". Sayıyı Giriniz: ");
            nx=input.nextInt();
            switch (i){
                case 1:
                    maxValue=nx;
                    minValue=nx;
                    break;
            }
            if (nx>maxValue){
                maxValue=nx;
            }

            if (nx<=minValue){
                minValue=nx;
            }

            i++;

        }while (i<=n);
        System.out.println("En Büyük Sayı: "+maxValue);
        System.out.println("En Küçük Sayı: "+minValue);
    }
}
