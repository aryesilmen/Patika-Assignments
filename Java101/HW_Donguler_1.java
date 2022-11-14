package Giris;

import java.util.Scanner;

public class HW_Donguler_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a,i=0,b=0,c=0;
        System.out.print("Sayı Giriniz: ");
        a=input.nextInt();
        while(i<=a){
            if(i%3==0 && i%4==0){
                b+=1;
                c+=i;
                i++;

            }i++;
        }
        System.out.println(c/(b-1)); // -1 0'ı ortalamaya dahil etmemek için.
    }

}
