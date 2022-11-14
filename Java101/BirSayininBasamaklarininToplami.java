package Giris;

import  java.util.Scanner;

public class BirSayininBasamaklarininToplami {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number,digitSum=0,digit=0;
        System.out.print("Sayı Giriniz: ");
        number = input.nextInt();

        while (number!=0) {
            digit=number%10;
                digitSum+=digit;
                number/=10;
        }
        System.out.print("Sayının basamakları toplamı: "+digitSum);
    }
}
