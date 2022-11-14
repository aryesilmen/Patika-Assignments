package Giris;

import  java.util.Scanner;

public class HW_Donguler_4_Kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n,r,c=1;
        System.out.print("Kombinasyonunu bulmak istediğiniz sayıyı giriniz (n): ");
        n=input.nextLong();

        System.out.print("Kaçlı kombinasyonunu bulmak istediğinizi giriniz (r): ");
        r=input.nextLong();

        for (int i=0;i<n;i++){
            c*=n-i;
        }
        for(int j=0;j<r;j++){
            c/=r-j;
        }
        for(int k=0;k<(n-r);k++){
            c/=(n-r)-k;
        }
        System.out.print("C("+n+","+r+")="+c);
    }
}
