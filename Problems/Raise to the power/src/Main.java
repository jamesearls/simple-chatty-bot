import java.util.Scanner;

public class Main {

    public static long power(int n, int m) {
        long power = n;
        for (int i = 0; i < m - 1; i++) {
            power = power * n;
        }
        if (m == 0) {
            return 1;
        } else {
            return power;
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        System.out.println(power(n, m));
    }
}