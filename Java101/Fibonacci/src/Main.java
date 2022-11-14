import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci Serisinin Eleman Sayısını Giriniz: ");
        int elemanSayisi = scanner.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(a + " ");
            b += a;
            a = b - a;
        }
    }
}

