package Giris;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double armutkg, armuttl=2.14, elmakg, elmatl=3.67, domateskg, domatestl=1.11, muzkg, muztl=0.95, patlicankg, patlicantl = 5, tutar;

        System.out.print("Alınan armut miktarını giriniz (KG): ");
        armutkg = input.nextDouble();

        System.out.print("Alınan elma miktarını giriniz (KG): ");
        elmakg = input.nextDouble();

        System.out.print("Alınan domates miktarını giriniz (KG): ");
        domateskg = input.nextDouble();

        System.out.print("Alınan muz miktarını giriniz (KG): ");
        muzkg = input.nextDouble();

        System.out.print("Alınan patlıcan miktarını giriniz (KG): ");
        patlicankg = input.nextDouble();

        tutar = armutkg*armuttl+elmakg*elmatl+domateskg*domatestl+muzkg*muztl+patlicankg*patlicantl;

        System.out.print("Toplam tutar: "+tutar);
    }
}
