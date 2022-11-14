package Giris;

import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        double mat, fizik, turkce, kimya, muzik, ortalama, derssayisi=5;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextDouble();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextDouble();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextDouble();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextDouble();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextDouble();

        if (mat < 0 || mat > 100)
            {mat = 0;
            derssayisi--;}

        if (fizik < 0 || fizik > 100)
            {fizik = 0;
            derssayisi--;}

        if (kimya < 0 || kimya > 100)
            {kimya = 0;
            derssayisi--;}

        if (turkce < 0 || turkce > 100)
            {turkce = 0;
            derssayisi--;}

        if (muzik < 0 || muzik > 100)
           {muzik = 0;
            derssayisi--;}

        ortalama = (mat + fizik + kimya + turkce + muzik)/derssayisi;
        System.out.println("Ortalamanız: "+ortalama);
        if (ortalama>55){
            System.out.print("Sınıfı Başarıyla Geçtiniz.");
        }
        else {
                System.out.print("Sınıfta Kaldınız.");
            }
        }
    }