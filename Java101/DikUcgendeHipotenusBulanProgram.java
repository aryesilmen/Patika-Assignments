package Giris;

import java.util.Scanner;

public class DikUcgendeHipotenusBulanProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double a, b, c, u, alan;
        System.out.print("1. dik kenarın uzunluğunu giriniz: ");
        a = input.nextInt();
        System.out.print("2. dik kenarın uzunluğunu giriniz: ");
        b = input.nextInt();
        c = Math.sqrt(a*a+b*b);
        System.out.println("Hipotenüsün uzunluğu: "+c);
        u=(a+b+c)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Üçgenin alanı: "+alan);
    }
}