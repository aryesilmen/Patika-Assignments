package Giris;

import java.util.Scanner;

public class TersUcgenYapimi {
    public static void main(String[] args) {
        System.out.print("Bir Sayı Giriniz: ");

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * (a - i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
