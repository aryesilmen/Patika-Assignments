package Giris;

import java.util.Scanner;

public class Bankamatik {
    public static void main(String[] args) {

        int right = 3, select, deposit, withdrawal;
        String username, password;
        int balance = 100;
        boolean isError = false;

        while (right > 0) {
            Scanner input = new Scanner(System.in);
            System.out.print("Kullanıcı Adını Giriniz: ");
            username = input.next();

            System.out.print("Şifrenizi Giriniz: ");
            password = input.next();

            if (username.equals("patika") && password.equals("java123")) {
                System.out.println("Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println(
                            "(1) Para Yatırma\n" +
                                    "(2) Para Çekme\n" +
                                    "(3) Bakiye Sorgulama\n" +
                                    "(4) Çıkış\n" +
                                    "Lütfen Yapmak İstediğiniz İşlemi Seçiniz.");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Lütfen Yatırmak İstediğiniz Tutarı Giriniz: ");
                            deposit = input.nextInt();
                            balance += deposit;
                            System.out.println("Güncel Bakiyeniz: " + balance);
                            break;
                        case 2:
                            System.out.print("Lütfen Çekmek İstediğiniz Tutarı Giriniz: ");
                            withdrawal = input.nextInt();
                            if (balance>withdrawal){
                                balance -= withdrawal;
                            }else {
                                System.out.println("Yetersiz Bakiye!");
                            }
                            System.out.println("Güncel Bakiyeniz: " + balance);
                            break;
                        case 3:
                            System.out.println("Güncel Bakiyeniz: " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar Görüşmek Üzere!");
                break;

            } else {
                right--;
                if (right == 0) {
                    System.out.println("Hesabınız Bloke Olmuştur. Lütfen Banka ile İletişime Geçiniz.");
                } else {
                    System.out.println("Hatalı Kullanıcı Adı veya Şifre! Lütfen Tekrar Deneyiniz.");
                    System.out.println("Kalan Hakkınız: " + right);
                }
            }

        }
    }
}