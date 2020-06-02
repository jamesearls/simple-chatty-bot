import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int end = s.nextInt();
        for (int i = 1; i * i <= end; i++) {
            System.out.println(i * i);
        }
    }
}