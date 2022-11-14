public class Main {

    public static void main(String[] args) {

        boolean isPrime = true;

        for (int i = 1; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime && i != 1) {
                System.out.println(i);
            }
            isPrime = true;
        }
    }
}
