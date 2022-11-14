package Giris;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, selection;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        n1=input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2=input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("İşlem Seçiminiz: ");
        selection = input.nextInt();

        switch (selection){

            case 1:
                System.out.println("Toplam Sonucu=" + (n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma Sonucu=" + (n1-n2));
                break;
            case 3:
                System.out.println("Çarpım Sonucu=" + (n1*n2));
                break;
            case 4:
                switch  (n2){
                    case 0:
                        System.out.println("Sonuç tanımsız");
                        break;
                    default:
                        System.out.println("Bölme Sonucu=" + (n1/n2));
                }
                break;
            default:
                System.out.println("Eksik veya hatalı giriş yaptınız. Lütfen tekrar deneyiniz.");
        }
    }
}
