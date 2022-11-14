package Giris;

import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km, ntotal, agedis, twowaydis = 0.2, total=0;
        int age, type;
        boolean isError = false;

        System.out.print("Gitmek istediğiniz mesafeyi giriniz (km) : ");
        km = input.nextDouble();

        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();

        System.out.print("(1) Tek Yön\n(2) Gidiş-Dönüş\nUçuş tipini seçiniz: ");
        type = input.nextInt();

        ntotal = km * 0.1;

        if (km > 0 && age>0) {
            switch (type) {
                case 1:
                    if (age < 12) {
                        agedis = 0.5;
                        total = ntotal - (ntotal * agedis);
                    } else if (age >= 12 && age <= 24) {
                        agedis = 0.1;
                        total = ntotal - (ntotal * agedis);
                    } else if (age > 65) {
                        agedis = 0.3;
                        total = ntotal - (ntotal * agedis);
                    }else{
                        total =ntotal;
                    }

                break;
                case 2:
                    if (age < 12) {
                        agedis = 0.5;
                        total = (2 * ntotal - (2 * ntotal * agedis)) * (1 - twowaydis);
                    } else if (age >= 12 && age <= 24) {
                        agedis = 0.1;
                        total = (2 * ntotal - (2 * ntotal * agedis)) * (1 - twowaydis);
                    } else if (age > 65) {
                        agedis = 0.3;
                        total = (2 * ntotal - (2 * ntotal * agedis)) * (1 - twowaydis);
                    }else{
                        total =2*ntotal*(1-twowaydis);
                    }

                break;
                default:isError=true;
                }
        }else {
            isError = true;
        }
        if (isError){
            System.out.println("Hatalı Veri Girdiniz ! Tekrar deneyiniz.");
        }else {
            System.out.println("Toplam Tutar: " + total);
        }
        }
    }