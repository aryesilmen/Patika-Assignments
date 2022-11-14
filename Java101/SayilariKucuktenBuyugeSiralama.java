package Giris;

import java.util.Scanner;

public class SayilariKucuktenBuyugeSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        System.out.print("Sıralamak istediğiniz birinci sayıyı giriniz: ");
        a = input.nextDouble();
        System.out.print("Sıralamak istediğiniz ikinci sayıyı giriniz: ");
        b = input.nextDouble();
        System.out.print("Sıralamak istediğiniz üçüncü sayıyı giriniz: ");
        c = input.nextDouble();

        if (a < b && a < c) {
            if (b < c) {
                System.out.println(a+"<"+b+"<"+c);
            } else {
                System.out.println(a+"<"+c+"<"+b);
            }

        } else if (b < a && b < c) {
            if (a < c) {
                System.out.println(b+"<"+a+"<"+c);
            } else {
                System.out.println(b+"<"+c+"<"+a);
            }

        } else {
            if (b < a) {
                System.out.println(c+"<"+b+"<"+a);
            } else {
                System.out.println(c+"<"+a+"<"+b);
            }

        }
    }
}