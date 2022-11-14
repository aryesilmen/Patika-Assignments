package Giris;

import java.util.Scanner;

public class VucutKitleIndeksiHesaplayanProgram {
    public static void main(String[] args) {
        double boy, kilo, vucutkitleindeksi;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();

        vucutkitleindeksi = kilo/Math.pow(boy,2);
        System.out.println("Vücut Kitle İndeksiniz : "+ vucutkitleindeksi);
    }
}
