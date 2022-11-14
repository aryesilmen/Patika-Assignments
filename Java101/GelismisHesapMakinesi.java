package Giris;

import java.util.Scanner;

public class GelismisHesapMakinesi {
    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam: " + result);
        return result;
    }
    static int sub(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma: " + result);
        return result;
    }

    static int mul(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma: " + result);
        return result;
    }

    static int div(int a, int b) {
        int result = a / b;
        System.out.println("Bölme: " + result);
        return result;
    }

    static int pow(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Üs Alma: " + result);
        return result;
    }

    static int fak(int a) {
        int result = 1;
        for (int i = 0; i < a; i++) {
            result *= (a - i);
        }
        System.out.println("Faktöriyel: " + result);
        return result;
    }
    static int mod(int a,int b){
        int result=a%b;
        System.out.println("Mod İşlemi: "+result);
        return result;
    }

    static void areacircum(int a, int b){
        int area=a*b,circum=2*(a+b);
        System.out.println("Dikdörtgenin Çevresi: "+circum);
        System.out.println("Dikdörtgenin Alanı: "+area);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        while (true) {
            int a=0, b=0;
            System.out.println(menu);
            System.out.print("Bir İşlem Seçiniz: ");
            select = input.nextInt();
            if (select == 0) {
                System.out.println("Tekrar Görüşmek Üzere!");
                break;
            } else if (select==6) {
                System.out.print("Bir Sayı Giriniz: ");
                a = input.nextInt();
            } else if (select>8 || select<0){
                System.out.println("Geçersiz İşlem!");
                break;
            }else {
                System.out.print("Bir Sayı Giriniz: ");
                a = input.nextInt();
                System.out.print("Bir Sayı Giriniz: ");
                b = input.nextInt();
            }
            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    sub(a, b);
                    break;
                case 3:
                    mul(a, b);
                    break;
                case 4:
                    if (b==0){
                        System.out.println("Sonuç Tanımsız");
                    }else div(a, b);
                    break;
                case 5:
                    pow(a, b);
                    break;
                case 6:
                    fak(a);//kvmerkve
                    break;
                case 7:
                    mod(a,b);
                    break;
                case 8:
                    areacircum(a,b);
                    break;
            }
        }
    }
}