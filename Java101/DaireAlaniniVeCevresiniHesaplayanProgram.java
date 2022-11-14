package Giris;

import java.util.Scanner;

public class DaireAlaniniVeCevresiniHesaplayanProgram {
    public static void main(String[] args) {
        double r, alan, cevre;
        System.out.print("Alanını ve çevresini hesaplamak istediğiniz dairenin yarıçapını giriniz: ");
        Scanner input = new Scanner(System.in);
        r = input.nextInt();
        alan = Math.PI*Math.pow(r,2);
        cevre = 2*Math.PI*r;
        System.out.println("Dairenin alanı: "+ alan);
        System.out.print("Dairenin çevresi: "+ cevre);
    }
}
