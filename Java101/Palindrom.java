package Giris;

public class Palindrom {

    static boolean f(int n) {
        int tempNumber = n;
        int reverseNumber = 0;
        while (tempNumber != 0) {
            int lastdigit = tempNumber % 10;
            reverseNumber = (reverseNumber * 10) + lastdigit;
            tempNumber /= 10;
        }
        if (reverseNumber == n) {
            return true;
        }
        else
        {return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(f(3243423));
    }
}