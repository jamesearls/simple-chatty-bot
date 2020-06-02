import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // number of elements in the sequence
        int result = 0;

        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();

            if (element > result && element % 4 == 0) {
                result = element;
            }
        }

        System.out.println(result);

    }
}