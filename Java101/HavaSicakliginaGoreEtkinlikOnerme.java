package Giris;

import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double temperature;
        System.out.print("Hava Sıcaklığını Giriniz: ");
        temperature = input.nextDouble();
        if (temperature<5){
            System.out.println("Kayak yapabilirsin.");
        }
        else if (temperature>25){
            System.out.println("Yüzmeye gidebilirsin.");
        }
        else if (temperature>=5 && temperature<10) {
            System.out.println("Sinemaya gidebilirsin.");
        }
        else if (temperature>=10 && temperature<=15) {
            System.out.println("Sinemaya gidebilirsin. Pikniğe gidebilirsin.");
        }
        else {
            System.out.println("Pikniğe gidebilirsin.");
        }
    }
    }
