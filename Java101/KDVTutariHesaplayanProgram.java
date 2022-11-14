package Giris;

import java.util.Scanner;

public class KDVTutariHesaplayanProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Tutarı Giriniz: ");

        double tutar = input.nextInt();

        double KDV = (tutar<=1000) ? 0.18 : 0.08;
        System.out.println("KDV'siz Tutar: "+ tutar);
        System.out.println("KDV Oranı: "+ KDV);
        System.out.println("KDV Tutarı: "+tutar*KDV);
        System.out.print("KDV Dahil Tutar: "+ tutar*(1+KDV));

    }
}
