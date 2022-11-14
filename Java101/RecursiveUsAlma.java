package Giris;

import java.util.Scanner;

public class RecursiveUsAlma {
    static int us(int a,int b){
        if (b==0){
            return 1;
        }
        b--;
        return us(a,b)*a;
    }
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban Değerini Giriniz: ");
        a=input.nextInt();
        System.out.print("Üs Değerini Giriniz: ");
        b=input.nextInt();
        System.out.println("Sonuç: "+us(a,b));
    }
}
