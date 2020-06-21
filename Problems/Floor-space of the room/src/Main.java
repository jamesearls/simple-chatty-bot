import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String choice = s.nextLine();
        double a;
        double b;
        double c;
        double r;

        switch (choice) {
            case "triangle":
                 a = s.nextDouble();
                 b = s.nextDouble();
                 c = s.nextDouble();
               double s2 = (a + b + c) / 2;
                 System.out.println(Math.sqrt(s2 * (s2 - a) * (s2 - b) * (s2 - c)));
                 break;
            case "rectangle":
                a = s.nextDouble();
                b = s.nextDouble();
                System.out.println(a * b);
                break;
            case "circle":
                r = s.nextDouble();
                System.out.println(3.14 * (r * r));
                break;
            default:
                System.out.println("Error!");
        }
    }
}