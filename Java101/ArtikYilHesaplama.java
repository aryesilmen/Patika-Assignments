package Giris;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int year, artikyil;

        System.out.print("Yıl Giriniz: ");
        year = input.nextInt();

        artikyil = year % 4;
        boolean isArtik = false;

        if (artikyil == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isArtik = true;
                } else {
                    isArtik = false;
                }
            } else {
                isArtik = true;
            }
        } else isArtik = false;

        if (isArtik) {
            System.out.print(year + " artık yıldır.");
        } else {
            System.out.println(year+" artık yıl değildir.");
        }
    }
}