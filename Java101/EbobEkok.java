package Giris;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {

        int n1, n2, a=0, b=0,ebob=0;
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        n1 = input.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        n2 = input.nextInt();

        if (n1 > n2) {
            a = n1;
            b = n2;
        } else {
            b = n1;
            a = n2;
        }

        int i=1;

        while (i <= b){
            if (a%i==0 && b%i==0){
                ebob=i;
            }
            i++;
        }
        System.out.println("Ebob: "+ebob);
        System.out.println("Ekok: "+(n1*n2)/ebob);
    }
}
