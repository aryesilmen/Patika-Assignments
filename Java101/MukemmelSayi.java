package Giris;

import  java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int n,sum=0;
        n= input.nextInt();
        for (int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if (sum==n){
            System.out.print(n+" Mükemmel Sayıdır.");
        }else System.out.print(n+" Mükemmel Sayı Değildir.");
    }
}
