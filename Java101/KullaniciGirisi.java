package Giris;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String username, password, newpassword;
        int sifreyenileme;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        username = input.next();

        System.out.print("Şifreniz: ");
        password = input.next();

        if (username.equals("Patika") && password.equals("java123")){
            System.out.println("Giriş başarılı !");
        }
        else if (username.equals("Patika") && password != "java123"){
            System.out.println("Şifre hatalı.Şifrenizi sıfırlamak ister misiniz? Evet için 1'i hayır için 2'yi tuşlayınız.");
            sifreyenileme=input.nextInt();
            switch (sifreyenileme){
                case 1:
                    System.out.println("Yeni Şifrenizi Giriniz: ");
                    newpassword = input.next();
                        if (newpassword.equals("java123") || newpassword.equals(password)){
                        System.out.println("Şifre oluşturulamadı");
                    }   else {System.out.println("Şifre oluşturuldu");}
                        break;
                case 2:
                    System.out.println("Lütfen tekrar giriş yapmayı deneyin.");
                    break;
            }
        }
        else {
            System.out.println("Kullanıcı adınızı veya şifrenizi yanlış girdiniz.");
        }
    }
}
