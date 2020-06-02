import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int sum = 0;
        if(a < b){
            for(int i = a; i <= b; i++){
                sum += i;
            }
        }
        System.out.print(sum);
    }
}