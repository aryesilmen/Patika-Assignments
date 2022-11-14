package Giris;

import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {

        int mat, fizik, kimya, tarih, turkce, muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.println("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.println("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.println("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();

        System.out.println("Turkce notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.println("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        double ortalama = (mat+fizik+kimya+tarih+turkce+muzik)/6;
        System.out.println("Ortalamanız: " + ortalama);

        String Durum = (ortalama>=60) ? "Geçti" : "Kaldı";
        System.out.print(Durum);




    }
}
