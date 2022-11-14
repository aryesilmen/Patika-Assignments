package Giris;

import java.util.Scanner;

public class YildizlarlaElmasYapimi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int a;
        a = input.nextInt();

        for (int i = 1; i <= (2 * a - 1); i++) {
            if (i <= a) {
                for (int j = 1; j <= (a - i); j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int l = 1; l <= (i - a); l++) {
                    System.out.print(" ");
                }
                for (int m = 2 * (i - a) - 1; m < 2 * a - 2; m++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
